import java.awt.*;

import javax.swing.*;
public class LifeBar extends JPanel {
private JLabel lifeBar[];
 public LifeBar(Integer life) {
	 setLayout(new GridLayout(1,100));
	 setBorder(BorderFactory.createMatteBorder(
			 1, 1, 1, 1, Color.BLACK));
	 setBackground(Color.BLACK);
	 setPreferredSize(new Dimension(0,25));
	 lifeBar = new JLabel[100];
	 for(int i=0; i<lifeBar.length; i++) {
	 lifeBar[i] = new JLabel("");
	
	 lifeBar[i].setHorizontalAlignment(JLabel. CENTER);
	 lifeBar[i].setOpaque(true);
	 if(i<=life){
		 lifeBar[i].setBackground(Color.GREEN);
	 }
	 else {
		 lifeBar[i].setBackground(Color.WHITE);
	 }
	add(lifeBar[i]);
	 }
	 
 }
}

//public class LifeBar extends PlayerPanel{
//	private JLabel lifeBar[];
//
//	public LifeBar() {
//		
//		
//	
//	setLayout(new GridLayout(1,100));{
//	
//	lifeBar[i] = new JLabel("lifebar MAKE IT PANEL!! GRID LAYOUT 1,100");
//	lifeBar[i].setOpaque(true);
//	lifeBar[i].setBackground(Color.GREEN);
//	lifeBar[i].setHorizontalAlignment(JLabel. CENTER);
//	lifeBar[i].setBorder(BorderFactory.createMatteBorder(
//	1, 1, 1, 1, Color.BLACK));
//	add(lifeBar, BorderLayout.NORTH);
//	{
//}
//}