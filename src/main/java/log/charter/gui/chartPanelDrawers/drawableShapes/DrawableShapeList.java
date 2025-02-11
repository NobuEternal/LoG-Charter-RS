package log.charter.gui.chartPanelDrawers.drawableShapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawableShapeList {
	private final List<DrawableShape> list = new ArrayList<>();

	public void add(final DrawableShape shape) {
		list.add(shape);
	}

	public void draw(final Graphics g) {
		list.forEach(shape -> shape.draw(g));
	}
}
