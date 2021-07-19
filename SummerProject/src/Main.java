

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		// New Window enter name	
		String name = JOptionPane.showInputDialog("Enter your name");		
		// New window enter avatar

		// TODO Auto-generated method stub
		// creating object Jfram
		if(name != null && !name.equals("")) {
			JFrame start = new Game(name);
			start.setSize(1240, 720);
			start.setTitle("Board Game");	
			start.setVisible(true);
			start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// add
		}
	}

}
