package log.charter.song.notes;

import log.charter.song.BendValue;
import log.charter.song.enums.HOPO;
import log.charter.song.enums.Harmonic;
import log.charter.song.enums.Mute;
import log.charter.util.CollectionUtils.ArrayList2;

public class ChordNote {
	public int length;
	public Mute mute = Mute.NONE;
	public HOPO hopo = HOPO.NONE;
	public Harmonic harmonic = Harmonic.NONE;
	public boolean vibrato = false;
	public boolean tremolo = false;
	public boolean linkNext = false;
	public Integer slideTo = null;
	public boolean unpitchedSlide = false;
	public ArrayList2<BendValue> bendValues = new ArrayList2<>();

	public ChordNote() {
	}

	public ChordNote(final ChordNote other) {
		length = other.length;
		mute = other.mute;
		hopo = other.hopo;
		harmonic = other.harmonic;
		vibrato = other.vibrato;
		tremolo = other.tremolo;
		linkNext = other.linkNext;
		slideTo = other.slideTo;
		unpitchedSlide = other.unpitchedSlide;
		bendValues = other.bendValues.map(BendValue::new);
	}

	public ChordNote(final Note note) {
		length = note.length();
		mute = note.mute;
		hopo = note.hopo;
		harmonic = note.harmonic;
		vibrato = note.vibrato;
		tremolo = note.tremolo;
		linkNext = note.linkNext;
		slideTo = note.slideTo;
		unpitchedSlide = note.unpitchedSlide;
		bendValues = note.bendValues.map(BendValue::new);
	}
}
