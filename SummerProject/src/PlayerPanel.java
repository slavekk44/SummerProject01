import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
/*
* @param author Slawomir Kolodziejczyk of the author code.
*/
public class PlayerPanel extends JPanel {
	private JLabel  storyEnemy, resultEnemy;
 public PlayerPanel(String text, Color color, Integer life) {
	 	setLayout(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(
				5, 5, 0, 5, color));
//				
		storyEnemy = new JLabel(text);
		storyEnemy.setOpaque(true);
		storyEnemy.setHorizontalAlignment(JLabel. CENTER);
		storyEnemy.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		resultEnemy = new JLabel(life+" HEALTH");
		resultEnemy.setOpaque(true);
		resultEnemy.setBackground(color);
		resultEnemy.setFont(new Font("Monospaced", Font.BOLD, 25));
		resultEnemy.setHorizontalAlignment(JLabel. CENTER);
		resultEnemy.setBorder(BorderFactory.createMatteBorder(
				15, 15, 15, 15, color));
		
		add(resultEnemy, BorderLayout.SOUTH);
		add(storyEnemy,BorderLayout.CENTER);
		
 }
}
