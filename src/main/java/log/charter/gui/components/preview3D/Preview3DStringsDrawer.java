package log.charter.gui.components.preview3D;

import static log.charter.gui.ChartPanelColors.getStringBasedColor;
import static log.charter.gui.components.preview3D.Preview3DUtils.getFretPosition;
import static log.charter.gui.components.preview3D.Preview3DUtils.getStringPosition;

import java.awt.Color;

import org.lwjgl.opengl.GL30;

import log.charter.data.ChartData;
import log.charter.data.config.Config;
import log.charter.gui.ChartPanelColors.StringColorLabelType;
import log.charter.gui.components.preview3D.BaseShader.BaseShaderDrawData;

public class Preview3DStringsDrawer {
	private ChartData data;

	public void init(final ChartData data) {
		this.data = data;
	}

	public void draw(final BaseShader baseShader) {
		final BaseShaderDrawData drawData = baseShader.new BaseShaderDrawData();
		final double x0 = getFretPosition(0);
		final double x1 = getFretPosition(Config.frets);

		for (int i = 0; i < data.currentStrings(); i++) {
			final Color stringColor = getStringBasedColor(StringColorLabelType.LANE, i, data.currentStrings());
			final double y = getStringPosition(i, data.currentStrings());
			drawData.addVertex(new Point3D(x0, y, 0), stringColor)//
					.addVertex(new Point3D(x1, y, 0), stringColor);
		}

		GL30.glLineWidth(2);
		drawData.draw(GL30.GL_LINES);
		GL30.glLineWidth(1);
	}
}
