import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Game extends JFrame  {
	//panel1 west
	private JButton settings,soundoff, windowSize, help, exit ;
	
	//panel2 east
	private JButton use,replace, cart1, cart2; 
	//panel4
	private JTextField inputChat;
	private JLabel outputChat;
	//panel5 east middle
	private JLabel deckName, myName, enemyName;
	
	private JLabel avatar, deck,avatarM,avatarE;
	
	public Game() {
		Dimension size = getPreferredSize();
		// West Panel Settings
		
		JPanel panel1 = new JPanel(new FlowLayout());
		{
		panel1.setBackground(Color.GRAY);
		panel1.setPreferredSize(new Dimension(70,50));
			
		settings = new JButton("Settings");
		settings.setBackground(Color.RED);
		settings.setOpaque(true);
		settings.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		add(settings);
		soundoff = new JButton("  Sound  ");
		soundoff.setBackground(Color.WHITE);
		soundoff.setOpaque(true);
		soundoff.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		add(soundoff);
		windowSize = new JButton("    Size    ");
		windowSize.setBackground(Color.RED);
		windowSize.setOpaque(true);
		windowSize.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		add(windowSize);
		help = new JButton("    Help    ");
		help.setBackground(Color.WHITE);
		help.setOpaque(true);
		help.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		add(help);	 
		exit = new JButton("     Exit     ");
		exit.setBackground(Color.RED);
		exit.setOpaque(true);
		exit.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		add(exit);
		
		panel1.add(settings);
		panel1.add(soundoff);
		panel1.add(windowSize);
		panel1.add(help);
		panel1.add(exit);
			
		add(panel1,BorderLayout.WEST);
		
		}		
		
		// East Panel settings
			
		JPanel panel2 = new JPanel(new GridLayout(3,1));
		{
		panel2.setBackground(Color.YELLOW);
		panel2.setPreferredSize(new Dimension(300,100));
		
//		avatar = new JLabel("*");
//		avatar.setBackground(Color.BLUE);
//		avatar.setOpaque(true);
//		avatar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
//		add(avatar);
//		avatarE = new JLabel("*");
//		avatarE.setBackground(Color.BLUE);
//		avatarE.setOpaque(true);
//		avatarE.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
//		add(avatarE);
	
	// east top
		JPanel panel4 = new JPanel(new BorderLayout());{
		panel4.setBackground(Color.WHITE);
			JLabel chatLab = new JLabel("CHAT");
			chatLab.setFont(new Font("TimesRoman", Font.BOLD, 20));
			chatLab.setHorizontalAlignment(SwingConstants.CENTER);
			chatLab.setBorder(BorderFactory.createMatteBorder(
                    5, 5, 1, 5, Color.red));
			panel4.add(chatLab, BorderLayout.NORTH);
			
		
			outputChat = new JLabel();
			outputChat.setBorder(BorderFactory.createMatteBorder(
                    0, 5, 1, 5, Color.red));
			panel4.add(outputChat);
			inputChat = new JTextField();
			inputChat.setFont(new Font("TimesRoman", Font.BOLD, 25));
			inputChat.setBorder(BorderFactory.createMatteBorder(
					0, 5, 5, 5, Color.red));
			
			
			panel4.add(inputChat,BorderLayout.SOUTH);
			
	
	    //panel4.setPreferredSize();
		
		
		
		}
		
	// east middle
		JPanel panel5 = new JPanel(new GridLayout(3,1));{
			panel5.setBackground(Color.GREEN);
		
			JPanel panelm1 = new JPanel(new GridLayout(1,2));{
			panelm1.setBackground(Color.DARK_GRAY);
			enemyName = new JLabel(" Opponenet Name");
			enemyName.setForeground(Color.WHITE);
			panelm1.add(enemyName);
			panelm1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
			JLabel enemyAvatar = new JLabel("IMAGE");
			enemyAvatar.setForeground(Color.WHITE);
			panelm1.add(enemyAvatar);
			
			}
			panel5.add(panelm1);
			
			deckName = new JLabel("BoardGame");
			deckName.setBackground(Color.GREEN);
			deckName.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
			deckName.setHorizontalAlignment(JLabel. CENTER);
			deckName.setFont(new Font("TimesRoman", Font.BOLD, 25));
			panel5.add(deckName);
			
			JPanel panelm3 = new JPanel(new GridLayout(1,2));{
			panelm3.setBackground(Color.DARK_GRAY);
			panelm3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
			
			myName = new JLabel(" My Name");
			myName.setForeground(Color.WHITE);
			panelm3.add(myName);
			JLabel myAvatar = new JLabel("MY IMAGE");
			myAvatar.setForeground(Color.WHITE);
			panelm3.add(myAvatar);
			
			
			
			
			}
			panel5.add(panelm3);
		
		}
		
	// east Bottom
		JPanel panel6 = new JPanel(new GridLayout(2,1));{
		panel6.setBackground(Color.darkGray);
		cart1 = new JButton("ATTACK");
		cart1.setOpaque(true);
		panel6.add(cart1);
		cart2 = new JButton("DEFFEND");
		cart2.setOpaque(true);
		panel6.add(cart2);
		use = new JButton("Use");
		use.setBackground(Color.LIGHT_GRAY);
		use.setOpaque(true);
		panel6.add(use);
		replace = new JButton("Replace");
		replace.setBackground(Color.LIGHT_GRAY);
		replace.setOpaque(true);
		size.height = 100;
		replace.setPreferredSize(size);
		panel6.add(replace);
		}
		panel2.add(panel4);
		panel2.add(panel5);
		panel2.add(panel6);
		
		
		
//		deck = new JLabel("*");
//		deck.setBackground(Color.BLUE);
//		deck.setOpaque(true);
//		deck.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
//		add(deck);
//		avatarM = new JLabel("*");
//		avatarM.setBackground(Color.BLUE);
//		avatarM.setOpaque(true);
//		avatarM.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
//		add(avatarM);
//		avatar = new JLabel("*");
//		avatar.setBackground(Color.BLUE);
//		avatar.setOpaque(true);
//		avatar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
//		add(avatar);
		
		
//		panel2.add(avatar);
//		panel2.add(avatarE);
//		panel2.add(deck);
	//	panel2.add(avatarM);
		
		add(panel2,BorderLayout.EAST);
	    }	
		
		
		
		// Center Panel Settings
		JPanel panel3 = new JPanel(new GridLayout(2,2));
		{
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setPreferredSize(new Dimension(300,100));
		
		JPanel center1 = new JPanel(new BorderLayout());
		center1.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.BLACK));
		JLabel resultEnemy = new JLabel("100");
		resultEnemy.setFont(new Font("Monospaced", Font.BOLD, 25));
		resultEnemy.setHorizontalAlignment(JLabel. CENTER);
		resultEnemy.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.CYAN));
		center1.add(resultEnemy, BorderLayout.SOUTH);
		
		
		
		JPanel center2 = new JPanel(new BorderLayout());
		center2.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.BLACK));
		JLabel resultMy = new JLabel("100");
		resultMy.setFont(new Font("Monospaced", Font.BOLD, 25));
		resultMy.setHorizontalAlignment(JLabel. CENTER);
		resultMy.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.PINK));
		center2.add(resultMy, BorderLayout.SOUTH);
		
		JPanel center3 = new JPanel();
		center3.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.BLACK));
		JPanel center4 = new JPanel();
		center4.setBorder(BorderFactory.createMatteBorder(
				5, 5, 5, 5, Color.BLACK));
		panel3.add(center1);
		panel3.add(center2);
		panel3.add(center3);
		panel3.add(center4);
		
		
		
		avatar = new JLabel("*");
		avatar.setBackground(Color.BLUE);
		avatar.setOpaque(true);
		avatar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20));
		add(avatar);
		add(panel3,BorderLayout.CENTER);
		}	    
		
	     
	     
	     	
	     	
	     
	     add(new Button("South"), BorderLayout.SOUTH);
		
	     add(new JLabel("Board Game by Slawomir Kolodziejczyk"), BorderLayout.NORTH);
	}
	
	
}
