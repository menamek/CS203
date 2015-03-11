
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.sound.midi.*;
import javax.swing.JPanel;
public class MiniMusicPlayer2 implements ControllerEventListener {
	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	public void go() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			int[] eventsIWant = { 127 };
			sequencer.addControllerEventListener(this, eventsIWant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			for (int i = 5; i < 61; i += 4) {
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i));
			}
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void controlChange(ShortMessage event) {
		System.out.println("laaaa");
	}
	private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
		} catch (Exception e) {
		}
		return event;
	}
}
class MyDrawPanel extends JPanel implements ControllerEventListener {
	boolean msg = false;
	@Override
	public void controlChange(ShortMessage event) {
		msg = true;
		repaint();
	}
	public void paintComponent(Graphics g) {
		if (msg) {
			Graphics2D g2 = (Graphics2D) g;
			int r = (int) (Math.random() * 250);
			int gr = (int) (Math.random() * 250);
			int b = (int) (Math.random() * 250);
			g.setColor(new Color(r, gr, b));
			int ht = (int) ((Math.random() * 120) + 10);
			int width = (int) ((Math.random() * 120) + 10);
			int x = (int) ((Math.random() * 40) + 10);
			int y = (int) ((Math.random() * 40) + 10);
			g.fillRect(x, y, width, ht);
			msg = false;
		}
	}
}

