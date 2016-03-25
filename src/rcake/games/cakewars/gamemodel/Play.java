package rcake.games.cakewars.gamemodel;
import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.*; 

import javax.swing.*; 

import rcake.games.cakewars.operations.CakeLevel;
import rcake.games.cakewars.operations.Level1;
import rcake.games.cakewars.operations.OpsPanel; 

public class Play implements ComponentListener, HierarchyListener{
	static OpsPanel opsPanel = new OpsPanel(); 
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(opsPanel, BorderLayout.SOUTH);
		frame.setSize(1200, 900); 
		frame.setVisible(true);
		
	}
	
	public void componentHidden(ComponentEvent e){
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hierarchyChanged(HierarchyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
