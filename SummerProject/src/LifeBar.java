import java.awt.*;

import javax.swing.*;
public class LifeBar extends PlayerPanel{
	private JLabel lifeBar;

	public LifeBar() {
		
		
	
	setLayout(new GridLayout(1,100));
	
	lifeBar = new JLabel("lifebar MAKE IT PANEL!! GRID LAYOUT 1,100");
	lifeBar.setOpaque(true);
	lifeBar.setBackground(Color.GREEN);
	lifeBar.setHorizontalAlignment(JLabel. CENTER);
	lifeBar.setBorder(BorderFactory.createMatteBorder(
	1, 1, 1, 1, Color.BLACK));
	add(lifeBar, BorderLayout.NORTH);
	
}
}