package piano;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

public class PianoMachine {

	private Midi midi;
	private ArrayList<Pitch> playedNotes = new ArrayList<>(); // part 1
    private Instrument instrument = Instrument.PIANO; // part 2
	private Integer octaveShift = 0; // part 3

    private ArrayList<NoteEvent> recordedSeq = new ArrayList<>(); // part 4
    private boolean isRecording = false;

	/**
	 * constructor for PianoMachine.
	 *
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }

    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
        if (!playedNotes.contains(rawPitch)){
            midi.beginNote(rawPitch.toMidiFrequency() + octaveShift * 12, instrument);
            playedNotes.add(rawPitch);

            if (isRecording) {
                recordedSeq.add(new NoteEvent(
                    new Pitch(rawPitch.toMidiFrequency() - 60 + octaveShift * 12),
                    System.currentTimeMillis(),
                    instrument,
                    NoteEvent.Kind.start
                ));
            }
        }
    }

    //TODO write method spec
    public void endNote(Pitch rawPitch) {
        if (playedNotes.contains(rawPitch)){
            midi.endNote(rawPitch.toMidiFrequency() + octaveShift * 12, instrument);
            playedNotes.remove(rawPitch);

            if (isRecording) {
                recordedSeq.add(new NoteEvent(
                    new Pitch(rawPitch.toMidiFrequency() - 60 + octaveShift * 12),
                    System.currentTimeMillis(),
                    instrument,
                    NoteEvent.Kind.stop
                ));
            }
        }
    }

    //TODO write method spec
    public void changeInstrument() {
        instrument = instrument.next();
    }

    //TODO write method spec
    public void shiftUp() {
        if (octaveShift < 2) {
            octaveShift += 1;
        }
    }

    //TODO write method spec
    public void shiftDown() {
        if (octaveShift > -2) {
            octaveShift -= 1;
        }
    }

    //TODO write method spec
    public boolean toggleRecording() {
        isRecording = !isRecording;
        if (isRecording)
            recordedSeq.clear();
    	return isRecording;
    }

    //TODO write method spec
    public void playback() {
//        if (isRecording) return;
        for (int i = 0; i < recordedSeq.size(); i++) {
            NoteEvent note = recordedSeq.get(i);
            if (note.getKind() == NoteEvent.Kind.start) {
                instrument = note.getInstr();
                beginNote(note.getPitch());
            }
            if (note.getKind() == NoteEvent.Kind.stop) {
                instrument = note.getInstr();
                endNote(note.getPitch());
            }
            if (i < recordedSeq.size() - 1) {
                try {
                    Thread.sleep(recordedSeq.get(i+1).getTime() - note.getTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
