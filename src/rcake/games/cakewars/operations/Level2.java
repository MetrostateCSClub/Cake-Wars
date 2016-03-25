package rcake.games.cakewars.operations;

import java.awt.Event;
import java.awt.*; 
import javax.swing.*; 

public class Level2 extends CakeLevel{
	private final int COUNTER = 2; 
	
	public Level2(){
		JButton jbtn = new JButton("button2"); 
		this.add(jbtn);
	}
	
	public Event finish(Event e){
		return e;
	}
	
	public int getCounter(){
		return COUNTER; 
	}

}
