package log.charter.data.config;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import log.charter.gui.menuHandlers.CharterMenuBar;
import log.charter.util.RW;

public class Localization {
	public enum Label {
		ARRANGEMENT_MENU("Arrangement"), //
		ARRANGEMENT_MENU_OPTIONS("Arrangement options"), //
		ARRANGEMENT_MENU_TOGGLE_MIDI_NOTES("Toggle midi notes"), //
		ARRANGEMENT_MENU_TOGGLE_CLAPS("Toggle claps on note"), //
		ARRANGEMENT_MENU_TOGGLE_METRONOME("Toggle metronome"), //
		ARRANGEMENT_MENU_TOGGLE_WAVEFORM("Toggle waveform drawing"), //

		BUTTON_CANCEL("Cancel"), //
		BUTTON_SAVE("Save"), //

		CONFIG_PANE("Config"), //
		CONFIG_MUSIC_FOLDER("Music folder"), //
		CONFIG_SONGS_FOLDER("Songs folder"), //
		CONFIG_MINIMAL_NOTE_DISTANCE("Minimal note distance (ms)"), //
		CONFIG_MINIMAL_TAIL_LENGTH("Minimal note tail length (ms)"), //
		CONFIG_SOUND_DELAY("Sound delay (ms)"), //
		CONFIG_MIDI_DELAY("Midi sound delay (ms)"), //
		CONFIG_MARKER_POSITION("Marker position (px)"), //
		CONFIG_NOTE_WIDTH("Note width (px)"), //
		CONFIG_NOTE_HEIGHT("Note height (px)"), //
		CONFIG_CHART_MAP_HEIGHT_MULTIPLIER("Chart map size"), //
		CONFIG_INVERT_STRINGS("Invert strings"), //
		CONFIG_LEFT_HANDED("Left handed"), //
		CONFIG_SHOW_CHORD_IDS("Show chord ids"), //
		CONFIG_SHOW_GRID("Show grid"), //
		CONFIG_CREATE_DEFAULT_STRETCHES_IN_BACKGROUND("Create stretched audio in the background when new song is made"), //
		CONFIG_FPS("FPS"), //
		CONFIG_BACKUP_DELAY("Backup delay (s)"), //
		CONFIG_MAX_STRINGS("Max strings"), //
		CONFIG_THEME("Graphical theme"), //
		CONFIG_THEME_DEFAULT("Default"), //
		CONFIG_THEME_ROCKSMITH("Rocksmith"), //

		GRAPHIC_CONFIG_PANE("Graphic config pane"), //
		GRAPHIC_CONFIG_BASE_1("Base 1"), //
		GRAPHIC_CONFIG_BASE_2("Base 2"), //

		GRAPHIC_CONFIG_BASE_BG_0("Base background 0"), //
		GRAPHIC_CONFIG_BASE_BG_1("Base background 1"), //
		GRAPHIC_CONFIG_BASE_BG_2("Base background 2"), //
		GRAPHIC_CONFIG_BASE_BG_3("Base background 3"), //
		GRAPHIC_CONFIG_BASE_BG_4("Base background 4"), //
		GRAPHIC_CONFIG_BASE_BG_5("Base background 5"), //

		GRAPHIC_CONFIG_BASE_DARK_TEXT("Dark text"), //
		GRAPHIC_CONFIG_BASE_TEXT("Text"), //

		GRAPHIC_CONFIG_NOTE_BACKGROUND("Note background"), //
		GRAPHIC_CONFIG_NOTE_ADD_LINE("Note add line"), //
		GRAPHIC_CONFIG_LANE("Lane"), //
		GRAPHIC_CONFIG_MAIN_BEAT("Main beat"), //
		GRAPHIC_CONFIG_SECONDARY_BEAT("Secondary beat"), //
		GRAPHIC_CONFIG_GRID("Grid"), //
		GRAPHIC_CONFIG_MARKER("Marker"), //
		GRAPHIC_CONFIG_SECTION_NAME_BG("Section name background"), //
		GRAPHIC_CONFIG_PHRASE_NAME_BG("Phrase name background"), //
		GRAPHIC_CONFIG_EVENT_BG("Event background"), //
		GRAPHIC_CONFIG_HIGHLIGHT("Highlight"), //
		GRAPHIC_CONFIG_SELECT("Select"), //

		GRAPHIC_CONFIG_NOTE_FLAG_MARKER("Note flag marker"), //
		GRAPHIC_CONFIG_SLIDE_NORMAL_FRET_BG("Normal slide fret background"), //
		GRAPHIC_CONFIG_SLIDE_NORMAL_FRET_TEXT("Normal slide fret text"), //
		GRAPHIC_CONFIG_SLIDE_UNPITCHED_FRET_BG("Unpitched slide fret background"), //
		GRAPHIC_CONFIG_SLIDE_UNPITCHED_FRET_TEXT("Unpitched slide fret text"), //
		GRAPHIC_CONFIG_NOTE_FULL_MUTE("Full mute"), //
		GRAPHIC_CONFIG_HAMMER_ON("Hammer on"), //
		GRAPHIC_CONFIG_PULL_OFF("Pull off"), //
		GRAPHIC_CONFIG_TAP("Tap"), //
		GRAPHIC_CONFIG_HARMONIC("Harmonic"), //
		GRAPHIC_CONFIG_PINCH_HARMONIC("Pinch harmonic"), //

		GRAPHIC_CONFIG_LANE_0("Lane 1"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_0("Lane bright 1"), //
		GRAPHIC_CONFIG_NOTE_0("Note 1"), //
		GRAPHIC_CONFIG_NOTE_TAIL_0("Note tail 1"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_0("Note accent 1"), //

		GRAPHIC_CONFIG_LANE_1("Lane 2"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_1("Lane bright 2"), //
		GRAPHIC_CONFIG_NOTE_1("Note 2"), //
		GRAPHIC_CONFIG_NOTE_TAIL_1("Note tail 2"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_1("Note accent 2"), //

		GRAPHIC_CONFIG_LANE_2("Lane 3"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_2("Lane bright 3"), //
		GRAPHIC_CONFIG_NOTE_2("Note 3"), //
		GRAPHIC_CONFIG_NOTE_TAIL_2("Note tail 3"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_2("Note accent 3"), //

		GRAPHIC_CONFIG_LANE_3("Lane 4"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_3("Lane bright 4"), //
		GRAPHIC_CONFIG_NOTE_3("Note 4"), //
		GRAPHIC_CONFIG_NOTE_TAIL_3("Note tail 4"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_3("Note accent 4"), //

		GRAPHIC_CONFIG_LANE_4("Lane 5"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_4("Lane bright 5"), //
		GRAPHIC_CONFIG_NOTE_4("Note 5"), //
		GRAPHIC_CONFIG_NOTE_TAIL_4("Note tail 5"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_4("Note accent 5"), //

		GRAPHIC_CONFIG_LANE_5("Lane 6"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_5("Lane bright 6"), //
		GRAPHIC_CONFIG_NOTE_5("Note 6"), //
		GRAPHIC_CONFIG_NOTE_TAIL_5("Note tail 6"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_5("Note accent 6"), //

		GRAPHIC_CONFIG_LANE_6("Lane 7"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_6("Lane bright 7"), //
		GRAPHIC_CONFIG_NOTE_6("Note 7"), //
		GRAPHIC_CONFIG_NOTE_TAIL_6("Note tail 7"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_6("Note accent 7"), //

		GRAPHIC_CONFIG_LANE_7("Lane 8"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_7("Lane bright 8"), //
		GRAPHIC_CONFIG_NOTE_7("Note 8"), //
		GRAPHIC_CONFIG_NOTE_TAIL_7("Note tail 8"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_7("Note accent 8"), //

		GRAPHIC_CONFIG_LANE_8("Lane 9"), //
		GRAPHIC_CONFIG_LANE_BRIGHT_8("Lane bright 9"), //
		GRAPHIC_CONFIG_NOTE_8("Note 9"), //
		GRAPHIC_CONFIG_NOTE_TAIL_8("Note tail 9"), //
		GRAPHIC_CONFIG_NOTE_ACCENT_8("Note accent 9"), //

		GRAPHIC_CONFIG_ANCHOR("Anchor"), //
		GRAPHIC_CONFIG_HAND_SHAPE("Hand shape"), //
		GRAPHIC_CONFIG_HAND_SHAPE_ARPEGGIO("Arpeggio"), //
		GRAPHIC_CONFIG_TONE_CHANGE("Tone change"), //

		GRAPHIC_CONFIG_VOCAL_LINE_BACKGROUND("Vocal line background"), //
		GRAPHIC_CONFIG_VOCAL_LINE_TEXT("Vocal line text"), //
		GRAPHIC_CONFIG_VOCAL_TEXT("Vocal text"), //
		GRAPHIC_CONFIG_VOCAL_NOTE("Vocal note"), //
		GRAPHIC_CONFIG_VOCAL_NOTE_WORD_PART("Vocal note word part"), //
		GRAPHIC_CONFIG_VOCAL_SELECT("Vocal selection"), //

		GRAPHIC_CONFIG_PREVIEW_3D_FULL_MUTE("3D preview full mute"), //
		GRAPHIC_CONFIG_PREVIEW_3D_PALM_MUTE("3D preview palm mute"), //
		GRAPHIC_CONFIG_PREVIEW_3D_ANCHOR("3D preview anchor"), //
		GRAPHIC_CONFIG_PREVIEW_3D_FRET_LANE("3D preview fret lane"), //
		GRAPHIC_CONFIG_PREVIEW_3D_BEAT("3D preview beat"), //
		GRAPHIC_CONFIG_PREVIEW_3D_CHORD_BOX("Chord box"), //
		GRAPHIC_CONFIG_PREVIEW_3D_CHORD_FULL_MUTE("Full mute chord"), //
		GRAPHIC_CONFIG_PREVIEW_3D_CHORD_PALM_MUTE("Palm mute chord"), //

		STRETCH_PANE("Custom music stretch"), //
		STRETCH_PANE_VALUE("Song speed (%)"), //

		EDIT_MENU("Edit"), //
		EDIT_MENU_UNDO("Undo"), //
		EDIT_MENU_REDO("Redo"), //
		EDIT_MENU_SELECT_ALL("Select all notes"), //
		EDIT_MENU_DELETE("Delete"), //
		EDIT_MENU_COPY("Copy"), //
		EDIT_MENU_PASTE("Paste"), //
		EDIT_MENU_SPECIAL_PASTE("Special paste"), //
		EDIT_MENU_SONG_OPTIONS("Song options"), //
		EDIT_MENU_ADD_SILENCE("Add silence in the beginning"), //
		EDIT_MENU_ADD_DEFAULT_SILENCE("Add default silence based on bars"), //

		FILE_MENU("File"), //
		FILE_MENU_NEW("New"), //
		FILE_MENU_OPEN("Open"), //
		FILE_MENU_OPEN_RS("Create song based on RS arrangement XML"), //
		FILE_MENU_OPEN_AUDIO("Temporary open an audio file"), //
		FILE_MENU_IMPORT("Import"), //
		FILE_MENU_IMPORT_RS_GUITAR("RS guitar arrangement XML"), //
		FILE_MENU_IMPORT_RS_VOCALS("RS vocals arrangement XML"), //
		FILE_MENU_IMPORT_GP("Guitar Pro file"), //
		FILE_MENU_SAVE("Save"), //
		FILE_MENU_SAVE_AS("Save as..."), //
		FILE_MENU_OPTIONS("Options"), //
		FILE_MENU_GRAPHIC_OPTIONS("Graphic options"), //
		FILE_MENU_EXIT("Exit"), //

		GRID_PANE("Grid options"), //
		GRID_PANE_GRID_SIZE("Grid size 1/"), //
		GRID_PANE_USE_GRID("Use grid"), //
		GRID_PANE_NOTE_TYPE("Note"), //
		GRID_PANE_BEAT_TYPE("Beat"), //
		GRID_PANE_MEASURE_TYPE("Measure"), //

		GUITAR_BEAT_PANE("Guitar beat options"), //
		GUITAR_BEAT_PANE_SECTION_TYPE("Section"), //
		GUITAR_BEAT_PANE_PHRASE_NAME("Phrase name"), //
		GUITAR_BEAT_PANE_PHRASE_LEVEL("Level"), //
		GUITAR_BEAT_PANE_PHRASE_SOLO("Solo"), //
		GUITAR_BEAT_PANE_EVENT_ADD("Add event"), //
		GUITAR_BEAT_PANE_EVENT_REMOVE("Remove event"), //

		GUITAR_MENU("Guitar"), //
		GUITAR_MENU_STRING_UP("Move notes string up"), //
		GUITAR_MENU_STRING_DOWN("Move notes string down"), //
		GUITAR_MENU_STRING_UP_KEEP_FRETS("Move notes string up keeping the frets"), //
		GUITAR_MENU_STRING_DOWN_KEEP_FRETS("Move notes string down keeping the frets"), //
		GUITAR_MENU_TOGGLE_MUTES("Toggle mutes"), //
		GUITAR_MENU_TOGGLE_HOPO("Toggle HO/PO"), //
		GUITAR_MENU_TOGGLE_HARMONIC("Toggle harmonic"), //
		GUITAR_MENU_SET_SLIDE("Set slide"), //
		GUITAR_MENU_TOGGLE_ACCENT("Toggle accent"), //
		GUITAR_MENU_TOGGLE_VIBRATO("Toggle vibrato"), //
		GUITAR_MENU_TOGGLE_TREMOLO("Toggle tremolo"), //
		GUITAR_MENU_TOGGLE_LINK_NEXT("Toggle link next"), //
		GUITAR_MENU_SET_FRET("Set fret"), //
		GUITAR_MENU_EDIT_NOTE("Edit note"), //
		GUITAR_MENU_EDIT_NOTE_TOOLTIP("Opens notes for edit as chord or single note based on first note selected"), //
		GUITAR_MENU_EDIT_AS_SINGLE_NOTE("Edit as single note"), //
		GUITAR_MENU_EDIT_AS_SINGLE_NOTE_TOOLTIP(
				"Opens notes for edit as single note, will change selected chords into single notes"), //
		GUITAR_MENU_EDIT_AS_CHORD("Edit as chord"), //
		GUITAR_MENU_EDIT_AS_CHORD_TOOLTIP(
				"Opens notes for edit as chord, will change selected single notes into chords"), //
		GUITAR_MENU_EDIT_BEND("Edit bend"), //
		GUITAR_MENU_MARK_HAND_SHAPE("Mark hand shape"), //
		GUITAR_MENU_EDIT_HAND_SHAPE("Edit hand shape"), //
		GUITAR_MENU_AUTOCREATE_FHP("Autocreate Fret Hand Positions"), //
		GUITAR_MENU_FULL_SCREEN_PREVIEW("Full screen preview"), //

		TEMPO_BEAT_PANE("Tempo beat options"), //
		TEMPO_BEAT_PANE_BEATS_IN_MEASURE("Beats in measure"), //
		TEMPO_BEAT_PANE_NOTE_DENOMINATOR("Note denominator"), //

		INFO_MENU("Info"), //
		INFO_MENU_VERSION("Version"), //
		INFO_MENU_LANGUAGE("Language"), //

		MUSIC_MENU("Music"), //
		MUSIC_MENU_25("25% speed"), //
		MUSIC_MENU_50("50% speed"), //
		MUSIC_MENU_75("75% speed"), //
		MUSIC_MENU_CUSTOM("Custom speed"), //

		NOTES_MENU("Notes"), //
		NOTES_MENU_GRID_OPTIONS("Grid options"), //
		NOTES_MENU_SNAP("Snap notes to grid"), //
		NOTES_MENU_SNAP_ALL("Snap all items between to grid"), //
		NOTES_MENU_DOUBLE_GRID("Double grid resolution"), //
		NOTES_MENU_HALVE_GRID("Halve grid resolution"), //

		TOOLBAR_MIDI("Midi"), //
		TOOLBAR_CLAPS("Claps"), //
		TOOLBAR_METRONOME("Metronome"), //
		TOOLBAR_WAVEFORM_GRAPH("Waveform graph"), //
		TOOLBAR_SLOWED_PLAYBACK_SPEED("Slowed speed"), //
		TOOLBAR_VOLUME("Volume"), //
		TOOLBAR_MIDI_VOLUME("Midi volume"), //

		SLIDE_PANE("Slide options"), //
		SLIDE_PANE_FRET("Slide to"), //
		SLIDE_PANE_UNPITCHED("Unpitched"), //

		SONG_OPTIONS_PANE("Song options"), //
		SONG_OPTIONS_TITLE("Title"), //
		SONG_OPTIONS_ARTIST_NAME("Artist name"), //
		SONG_OPTIONS_ARTIST_NAME_SORTING("Artist name (sorting)"), //
		SONG_OPTIONS_ALBUM("Album"), //
		SONG_OPTIONS_YEAR("Year"), //
		SONG_OPTIONS_CROWD_SPEED("Crowd speed"), //

		ADD_SILENCE_PANE("Add silence"), //
		ADD_SILENCE_SECONDS("Add this many seconds of silence:"), //
		ADD_SILENCE_ADD("Add silence"), //
		ADD_SILENCE_SET("Set silence"), //

		ADD_DEFAULT_SILENCE_PANE("Add silence"), //
		ADD_DEFAULT_SILENCE_BARS("Add this many bars of silence after 10s:"), //

		ARRANGEMENT_OPTIONS_PANE("Arrangement options"), //
		ARRANGEMENT_OPTIONS_TYPE("Arrangement type"), //
		ARRANGEMENT_OPTIONS_SUBTYPE("Arrangement subtype"), //
		ARRANGEMENT_OPTIONS_BASE_TONE("Base tone"), //
		ARRANGEMENT_OPTIONS_TUNING_TYPE("Tuning"), //
		ARRANGEMENT_OPTIONS_STRINGS("Strings"), //
		ARRANGEMENT_OPTIONS_CAPO("Capo"), //
		ARRANGEMENT_OPTIONS_MOVE_FRETS("Move frets on tuning change"), //

		VOCAL_PANE_CREATION("Vocal creation"), //
		VOCAL_PANE_EDIT("Vocal edit"), //
		VOCAL_PANE_LYRIC("Lyric"), //
		VOCAL_PANE_WORD_PART("Word part"), //
		VOCAL_PANE_PHRASE_END("Phrase end"), //

		VOCALS_MENU("Vocals"), //
		VOCALS_MENU_EDIT_VOCALS("Edit selected vocals"), //
		VOCALS_MENU_TOGGLE_WORD_PART("Toggle word part"), //
		VOCALS_MENU_TOGGLE_PHRASE_END("Toggle phrase end"), //

		ANCHOR_PANE("Anchor edit"), //
		ANCHOR_WIDTH("Anchor width"), //

		CHORD_OPTIONS_PANE("Chord options"), //
		HAND_SHAPE_PANE("Hand shape edit"), //
		NOTE_OPTIONS_PANE("Note options"), //
		BEND_OPTIONS_PANE("Bend options"), //

		CHORD_NAME("Chord name"), //
		CHORD_NAME_ADVICE("Chord name advice"), //

		STRING("String"), //
		FRET("Fret"), //
		CHORD_TEMPLATE_FINGER("Finger"), //

		ARPEGGIO("Arpeggio"), //

		MUTE("Mute:"), //
		MUTE_FULL("Full"), //
		MUTE_PALM("Palm"), //
		MUTE_NONE("None"), //

		HOPO("HOPO:"), //
		HOPO_HAMMER_ON("HO"), //
		HOPO_PULL_OFF("PO"), //
		HOPO_TAP("Tap"), //
		HOPO_NONE("None"), //

		BASS_PICKING_TECHNIQUE("Bass picking:"), //
		BASS_PICKING_POP("Pop"), //
		BASS_PICKING_SLAP("Slap"), //
		BASS_PICKING_NONE("None"), //

		HARMONIC("Harmonic:"), //
		HARMONIC_NORMAL("Normal"), //
		HARMONIC_PINCH("Pinch"), //
		HARMONIC_NONE("None"), //

		ACCENT("Accent"), //
		LINK_NEXT("Link next"), //
		SPLIT_INTO_NOTES("Split"), //
		IGNORE_NOTE("Ignore"), //
		PASS_OTHER_NOTES("Crazy/Arpeggiato"), //
		VIBRATO("Vibrato"), //
		TREMOLO("Tremolo"), //

		SPECIAL_GUITAR_PASTE_PANE("Special paste"), //
		SPECIAL_GUITAR_PASTE_SECTIONS("Paste sections"), //
		SPECIAL_GUITAR_PASTE_PHRASES("Paste phrases"), //
		SPECIAL_GUITAR_PASTE_EVENTS("Paste events"), //
		SPECIAL_GUITAR_PASTE_TONE_CHANGES("Paste tone changes"), //
		SPECIAL_GUITAR_PASTE_ANCHORS("Paste anchors"), //
		SPECIAL_GUITAR_PASTE_SOUNDS("Paste notes"), //
		SPECIAL_GUITAR_PASTE_HAND_SHAPES("Paste hand shapes"), //

		TONE_CHANGE_PANE("Tone change options"), //
		TONE_CHANGE_TONE_NAME("Tone name"), //

		CHOOSE_FOLDER_NAME("Choose folder name"), //
		COULDNT_LOAD_ARRANGEMENT("Couldn't load arrangement"), //
		COUNT_PHRASE_MISSING(
				"Count phrase is missing, do you want to move to the beginning of the arrangement to place it?"), //
		COUNT_PHRASE_MULTIPLE(
				"Count phrase is placed in multiple places, do you want to move to the last position to fix it?"), //
		DIRECTORY_DOESNT_EXIST("Directory doesn't exist"), //
		END_PHRASE_MISSING("End phrase is missing, do you want to move to the end of the arrangement to place it?"), //
		END_PHRASE_MULTIPLE(
				"End phrase is placed in multiple places, do you want to move to the first position to fix it?"), //
		EXIT_POPUP("Exit"), //
		EXIT_MESSAGE("Are you sure you want to exit?"), //
		FOLDER_EXISTS_CHOOSE_DIFFERENT("Given folder already exists, choose different name"), //
		GENERATING_SLOWED_SOUND("Playback speed added to queue"), //
		GP_FILE("GP file (.gp3, .gp4, .gp5)"), //
		LOADING("Please wait, loading..."), //
		LOADING_ARRANGEMENTS("Loading arrangements"), //
		LOADING_DONE("Loading done"), //
		LOADING_MUSIC_FILE("Loading music file"), //
		LOADING_PROJECT_FILE("Loading project file"), //
		MP3_OR_OGG_FILE("Mp3 (.mp3) or Ogg (.ogg) file"), //
		MISSING_ARRANGEMENT_FILE("Missing arrangement file %s"), //
		MUSIC_FILE_COULDNT_BE_LOADED("Music file couldn't be loaded"), //
		MUSIC_DATA_NOT_FOUND(
				"Music file not found in song folder, something went wrong with copying or the file is invalid"), //
		MUSIC_FILE_NOT_FOUND_PICK_NEW("Music file not found in song folder, please choose new file"), //
		NO_PROJECT("No project"), //
		NOT_A_FOLDER("Given path is not a folder"), //
		NOT_MP3_OGG("Not an Mp3 or Ogg file!"), //
		OPERATION_CANCELLED("Operation cancelled"), //
		PROJECT_IS_NEWER_VERSION("Project is newer version than program handles"), //
		ROCKSMITH_CHART_PROJECT("Rocksmith Chart Project"), //
		RS_ARRANGEMENT_FILE("RS arrangment file (XML)"), //
		SELECT_FOLDER("Select"), //
		TONE_NAME_CANT_BE_EMPTY("Tone name can't be empty"), //
		TONE_NAME_PAST_LIMIT("There are already 4 tones, can't add another tone"), //
		UNSAVED_CHANGES_POPUP("Unsaved changes"), //
		UNSAVED_CHANGES_MESSAGE("You have unsaved changes. Do you want to save?"), //
		UNSUPPORTED_FILE_TYPE("This file type is not supported"), //
		VALUE_CANT_BE_EMPTY("Value must not be empty"), //
		VALUE_MUST_BE_GE("Value must be greater or equal to %s"), //
		VALUE_MUST_BE_LE("Value must be lesser or equal to %s"), //
		VALUE_NUMBER_EXPECTED("Number expected"), //
		WRONG_FINGER_VALUE("Wrong finger name, must be one of (T, 1, 2, 3, 4)"), //
		WRONG_MUSIC_FILE("Wrong music file"), //

		SONG_FOLDER_SELECT("Create song folder"), //
		SONG_FOLDER_AUDIO_FILE_FOLDER("Use audio file folder (%s)"), //
		SONG_FOLDER_CREATE_NEW("Create new folder in %s");

		private final String defaultLabel;

		private Label(final String defaultLabel) {
			this.defaultLabel = defaultLabel;
		}

		public String label() {
			return labels.getOrDefault(name(), defaultLabel);
		}
	}

	public static final String languagesFolder = new File(RW.getProgramDirectory(), "languages").getAbsolutePath();

	private static Map<String, String> labels;

	public static void init() {
		final StringBuilder localizationFileBuilder = new StringBuilder();
		for (final Label label : Label.values()) {
			localizationFileBuilder.append(label.name()).append('=').append(label.defaultLabel).append('\n');
		}
		RW.write(new File(languagesFolder, "English.txt"), localizationFileBuilder.toString());

		readLocalizationFile();
	}

	private static void readLocalizationFile() {
		try {
			labels = RW.readConfig(new File(languagesFolder, Config.language + ".txt"));
		} catch (final Exception e) {
			Config.language = "English";
			labels = new HashMap<>();
		}
	}

	public static void changeLanguage(final String newLanguage, final CharterMenuBar charterMenuBar) {
		Config.language = newLanguage;
		Config.markChanged();

		readLocalizationFile();
		charterMenuBar.refreshMenus();
	}
}
