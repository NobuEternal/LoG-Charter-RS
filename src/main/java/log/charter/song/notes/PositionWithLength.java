package log.charter.song.notes;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class PositionWithLength extends Position implements IPositionWithLength {
	@XStreamAsAttribute
	private int length;

	public PositionWithLength(final int position) {
		super(position);
	}

	public PositionWithLength(final int position, final int length) {
		super(position);
		this.length = length;
	}

	public PositionWithLength(final PositionWithLength other) {
		super(other);
		length = other.length;
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public void length(final int newLength) {
		length = newLength;
	}
}
