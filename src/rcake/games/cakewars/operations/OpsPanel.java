package rcake.games.cakewars.operations;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.*; 
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class OpsPanel extends JPanel implements ComponentListener, ActionListener, AncestorListener{
	private static ArrayList<CakeLevel> levels = new ArrayList<CakeLevel>(); 
	
	private JPanel subpanel1 = new JPanel();
	JButton btn = new JButton("One"); 
	
	public OpsPanel(){
		
		levels.add(new Level1()); levels.add(new Level2());
		this.setLayout(new BorderLayout());
		
		subpanel1.setLayout(new GridLayout(0, 3));
		JButton btn2 = new JButton("Two"); 
		JButton btn3 = new JButton("Three");
		btn.addActionListener(this);
		subpanel1.add(btn); subpanel1.add(btn2); subpanel1.add(btn3);
		this.add(subpanel1, BorderLayout.SOUTH);
	}
	
	public void nextLevel(int counter){
		
	}
	
	public void previousLevel(){
		
	}
	
	public void endGame(){
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//
		if(arg0.getSource() instanceof JButton){ 
			System.out.println("This is the button class. ");
		}
		if(arg0.getSource() instanceof CakeLevel){
			System.out.println("This is the cake class.");
		}
	}
	
	public void componentHidden(ComponentEvent e){
		// TODO Auto-generated method stub
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void ancestorAdded(AncestorEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorMoved(AncestorEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorRemoved(AncestorEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
