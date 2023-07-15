package log.charter.song.notes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import log.charter.song.ChordTemplate;
import log.charter.util.CollectionUtils.ArrayList2;

@XStreamAlias("sound")
public class ChordOrNote implements IPositionWithLength {
	public static ChordOrNote findNextSoundOnString(final int string, final int startFromId,
			final ArrayList2<ChordOrNote> sounds) {
		for (int i = startFromId; i < sounds.size(); i++) {
			final ChordOrNote sound = sounds.get(i);
			if (sound.isNote()) {
				if (sound.note.string == string) {
					return sound;
				}
			} else if (sound.chord.chordNotes.containsKey(string)) {
				return sound;
			}
		}

		return null;
	}

	public Chord chord;
	public Note note;

	public ChordOrNote(final Chord chord) {
		this.chord = chord;
		note = null;
	}

	public ChordOrNote(final Note note) {
		chord = null;
		this.note = note;
	}

	public ChordOrNote(final ChordOrNote other) {
		chord = other.chord == null ? null : new Chord(other.chord);
		note = other.note == null ? null : new Note(other.note);
	}

	public boolean isChord() {
		return chord != null;
	}

	public boolean isNote() {
		return note != null;
	}

	public GuitarSound asGuitarSound() {
		return isChord() ? chord : note;
	}

	@Override
	public int position() {
		return asGuitarSound().position();
	}

	@Override
	public void position(final int newPosition) {
		asGuitarSound().position(newPosition);
	}

	@Override
	public int length() {
		return asGuitarSound().length();
	}

	@Override
	public void length(final int newLength) {
		asGuitarSound().length(newLength);
	}

	public void turnToNote(final ChordTemplate chordTemplate) {
		note = new Note(chord, chordTemplate);
		chord = null;
	}

	public void turnToChord(final int chordId, final ChordTemplate chordTemplate) {
		chord = new Chord(chordId, note, chordTemplate);
		note = null;
	}
}
