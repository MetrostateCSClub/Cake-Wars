package rcake.games.cakewars.operations;

import java.awt.Event;

import javax.swing.JPanel;

public abstract class CakeLevel extends JPanel{
	public Event finish(Event e){ 
		
		return e;
	}
	
	public int getCounter(){
		return 0;
		
	}
}
