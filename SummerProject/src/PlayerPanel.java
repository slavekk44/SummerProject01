import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class PlayerPanel extends JPanel {
	private JLabel lifeBar, storyEnemy, resultEnemy;
 public PlayerPanel(String text, Color color) {
	 	setLayout(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(
				5, 5, 0, 5, Color.CYAN));
		lifeBar = new JLabel("lifebar MAKE IT PANEL!! GRID LAYOUT 1,100");
		lifeBar.setOpaque(true);
		lifeBar.setBackground(Color.GREEN);
		lifeBar.setHorizontalAlignment(JLabel. CENTER);
		lifeBar.setBorder(BorderFactory.createMatteBorder(
		1, 1, 1, 1, color));
		
		
		storyEnemy = new JLabel(text);
		storyEnemy.setOpaque(true);
		storyEnemy.setHorizontalAlignment(JLabel. CENTER);
		storyEnemy.setFont(new Font("Monospaced", Font.BOLD, 20));
     
		resultEnemy = new JLabel("100");
		resultEnemy.setOpaque(true);
		resultEnemy.setBackground(color);
		resultEnemy.setFont(new Font("Monospaced", Font.BOLD, 25));
		resultEnemy.setHorizontalAlignment(JLabel. CENTER);
		resultEnemy.setBorder(BorderFactory.createMatteBorder(
				15, 15, 15, 15, color));
		
		add(resultEnemy, BorderLayout.SOUTH);
		add(storyEnemy,BorderLayout.CENTER);
		add(lifeBar, BorderLayout.NORTH);
 }
}
