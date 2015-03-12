import java.awt.*;

import javax.swing.*;
import javax.sound.midi.*;

import java.util.*;
import java.awt.event.*;

public class BeatBox {
	
	JPanel mainpanel;
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame theFrame;
	
	
	String [] instrumentNames={"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare","Hand clap","High Tom",
			"Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap","Low-mid Tom","High Agogo","Open Hi Congo"};
	
	int[] instruments={35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	
	public static void main(String[] args){
		new BeatBox().buildGUI();
	}
	
	public void buildGUI(){
		
		theFrame =new JFrame("Cyber BeatBox");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		checkboxList = new ArrayList<JCheckBox>();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		
		JButton start = new JButton("Start");
		start.addActionListener(new MyStartListener());
		buttonBox.add(start);
		
		

		JButton stop = new JButton("stop");
		start.addActionListener(new MyStartListener());
		buttonBox.add(stop);
		
		

		JButton upTempo = new JButton("Temp Up");
		upTempo.addActionListener(new MyUpTempoListener());
		buttonBox.add(upTempo);
		
		
		JButton downTemp = new JButton("Temp Down");
		downTemp.addActionListener(new MyDownTempoListener());
		buttonBox.add(downTemp);
		
		Box nameBox = new Box(BoxLayout.Y_AXIS);
		for(int i=0;i<16;i++){
			nameBox.add(new Label(instrumentNames[i]));
		}
		
		background.add(BorderLayout.EAST,buttonBox);
		background.add(BorderLayout.WEST,buttonBox);
		
		theFrame.getContentPane().add(background);
		
		GridLayout grid = new GridLayout(16,16);
		grid.setVgap(1);
		grid.setHgap(2);
		mainpanel = new JPanel(grid);
		background.add(BorderLayout.CENTER, mainpanel);
		
		
		for (int i=0;i<255;i++){
			JCheckBox c=new JCheckBox();
			c.setSelected(false);
			checkboxList.add(c);
		}
		
		setUpMidi();
		theFrame.setBounds(50,50,300,300);
		theFrame.pack();
		theFrame.setVisible(true);
		
	}
	public void setUpMidi(){
		try {
			sequencer=MidiSystem.getSequencer();
			sequencer.open();
			 sequence=new Sequence(Sequence.PPQ,4);
			track =sequence.createTrack();
			sequencer.setTempoInBPM(120);
		} catch(Exception e){e.printStackTrace();}
	}
 public void buildTrackAndStart(){
	 int[] trackList = null;
	 
	 sequence.deleteTrack(track);
	 track=sequence.createTrack();
	 
	 for(int i=0;i<16;i++){
		 trackList =new int[16];
		 
		 int key = instruments[i];
		 
		 for(int j=0;j<16;j++){
			 
			 JCheckBox Jc=checkboxList.get(j +16*i);
			 if (Jc.isSelected()){
				 trackList[j]=key;
			 }else {
				 trackList[j]=0;
			 }
			 
		 }
		 makeTracks(trackList);
		 track.add(makeEvent(176,1,127,0,16));
		 }
		 
	track.add(makeEvent(192,9,1,0,15));
	try{
		sequencer.setSequence(sequence);
		sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
		sequencer.start();
		sequencer.setTempoInBPM(120);
		
	}catch (Exception e){e.printStackTrace();}
	
 }
	 
 class MyStartListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		buildTrackAndStart();
		
	}
}

class MyStopListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		sequencer.stop();
		
	}
	

}
 class MyUpTempoListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		float tempoFactor = sequencer.getTempoFactor();
		   sequencer.setTempoFactor((float)(tempoFactor* 1.03));
		
	}
	
}

 class MyDownTempoListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		float tempoFactor = sequencer.getTempoFactor();
		   sequencer.setTempoFactor((float)(tempoFactor* 97));
		
		
	}
 }
 public void makeTracks(int[] list){
	 
	 for (int i=0;i<16;i++){
		 int key=list[i];
		 
		 if (key !=0){
			 track.add(makeEvent(144,9,key,100,i));
			 track.add(makeEvent(128,9,key,100,i+1));
		 }
	 }
	 
 }
	
public MidiEvent makeEvent(int comd,int chan,int one,int two , int tick){
	MidiEvent event = null;
	try {
		ShortMessage a= new ShortMessage();
		a.setMessage(comd,chan,one,two);
		event = new MidiEvent(a,tick);
		
	} catch(Exception e) {e.printStackTrace();
}
	return event;



}
 }