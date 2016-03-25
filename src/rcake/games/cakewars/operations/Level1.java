package rcake.games.cakewars.operations;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Level1 extends CakeLevel implements ActionListener{
	private final int COUNTER = 1; 
	private Container parent = this.getParent(); 
	
	public Level1(){
		JButton jbtn = new JButton("button"); 
		jbtn.addActionListener(this);
		this.add(jbtn);
	}
	public Event finish(Event e){
		return e;
		
	}
	public int getCounter(){
		return COUNTER; 
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//component.dispatchEvent and Toolkit EventQueue 
		//this game is complete when the user successfully organizes the components into their 
		//correct group 
		
	}

}
