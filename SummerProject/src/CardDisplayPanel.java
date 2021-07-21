import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class CardDisplayPanel extends JPanel{

	private JLabel cardName,cardName1;
	private JLabel stats1[];
	public CardDisplayPanel(Integer atack,Integer criticalChance, Integer atackPenetration, String image, String nameCard, String cardType, Color color) {
		Border compound,loweredbevel,raisedbevel;
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(
				0, 5, 5, 5, Color.CYAN));
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		
		compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		
		cardName = new JLabel(nameCard);
		cardName.setHorizontalAlignment(JLabel. CENTER);
		cardName.setBackground(Color.PINK);
		cardName.setFont(new Font("SansSerif", Font.BOLD, 20));
			
		cardName1 = new JLabel(cardType);
		cardName1.setHorizontalAlignment(JLabel. CENTER);
		cardName1.setBackground(Color.PINK);
		cardName1.setFont(new Font("Monospaced", Font.BOLD, 14));
		JPanel statsP1 = new JPanel(new GridLayout(3,2));
		statsP1.setPreferredSize(new Dimension(155,50));
	stats1 = new JLabel[6];
	stats1[0] = new JLabel("Atack");
	stats1[1] = new JLabel(atack+"");
	stats1[2] = new JLabel("Critical");
	stats1[3] = new JLabel(criticalChance+"%");
	stats1[4] = new JLabel("Penetr");
	stats1[5] = new JLabel(atackPenetration+"%");
	for(int i=0; i<stats1.length; i++)
	{
		stats1[i].setOpaque(true);
		stats1[i].setBackground(Color.yellow);
		stats1[i].setFont(new Font("Arial", Font.PLAIN , 20));
		stats1[i].setBorder(compound);
		add(stats1[i]);
		statsP1.add(stats1[i]);
	}
	JLabel image1 = new JLabel();
		image1.setIcon(new ImageIcon(image));
		image1.setOpaque(true);
		image1.setBackground(color);
		image1.setHorizontalAlignment(JLabel. CENTER);
		
		add(image1,BorderLayout.CENTER);
		add(statsP1,BorderLayout.EAST);
		add(cardName, BorderLayout.NORTH);
		add(cardName1, BorderLayout.SOUTH);
		
		
		
	}
}
