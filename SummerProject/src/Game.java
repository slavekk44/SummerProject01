import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Game extends JFrame implements ActionListener {
	// panel1 west
	private JButton settings, soundoff, windowSize, help, exit;

	// panel2 east
	private JButton inputButton;
	// panel4
	private JTextField inputChat;
	private JLabel outputChat, deckName;

	public Game(String name) {
		Border compound, loweredbevel, raisedbevel;
		Border redline = BorderFactory.createLineBorder(Color.gray, 25);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		
		// West Panel Settings

		JPanel panel1 = new JPanel(new FlowLayout());
		{
			panel1.setBackground(Color.GRAY);
			panel1.setPreferredSize(new Dimension(70, 50));

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

			add(panel1, BorderLayout.WEST);

		}

		// East Panel settings

		JPanel panel2 = new JPanel(new GridLayout(3, 1));
		{
			panel2.setBackground(Color.YELLOW);
			panel2.setPreferredSize(new Dimension(300, 100));

			// east top Chat
			JPanel panel4 = new JPanel(new BorderLayout());
			{
				panel4.setBackground(Color.WHITE);
				JLabel chatLab = new JLabel("CHAT");
				chatLab.setFont(new Font("TimesRoman", Font.BOLD, 20));
				chatLab.setHorizontalAlignment(SwingConstants.CENTER);
				chatLab.setBorder(BorderFactory.createMatteBorder(5, 5, 1, 5, Color.red));
				panel4.add(chatLab, BorderLayout.NORTH);

				outputChat = new JLabel("outputChat");
				outputChat.setBorder(BorderFactory.createMatteBorder(0, 5, 1, 5, Color.red));
				panel4.add(outputChat);

				JPanel panelInput = new JPanel(new BorderLayout());
				{

					inputChat = new JTextField();
					inputChat.setFont(new Font("TimesRoman", Font.BOLD, 20));
					inputChat.setBorder(BorderFactory.createMatteBorder(1, 5, 5, 1, Color.red));
					inputChat.setBackground(Color.LIGHT_GRAY);

					inputButton = new JButton("Send");
					inputButton.setOpaque(true);
					inputButton.setBorder(BorderFactory.createMatteBorder(1, 1, 5, 5, Color.red));
					inputButton.setBackground(Color.LIGHT_GRAY);
					inputButton.setPreferredSize(new Dimension(70, 50));

					panelInput.add(inputChat, BorderLayout.CENTER);
					panelInput.add(inputButton, BorderLayout.EAST);
				}

				panel4.add(panelInput, BorderLayout.SOUTH);

			}

			// east middle
			JPanel panel5 = new JPanel(new GridLayout(3, 1));
			{
				panel5.setBackground(Color.GREEN);
				JPanel panelm1 = new NameAvatarPanel("DEBIL", "images/avatar4.jpg", Color.CYAN);

				panel5.add(panelm1);

				deckName = new JLabel("BoardGame");
				deckName.setBackground(Color.GREEN);
				deckName.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
				deckName.setHorizontalAlignment(JLabel.CENTER);
				deckName.setFont(new Font("TimesRoman", Font.BOLD, 25));
				panel5.add(deckName);

				JPanel panelm3 = new NameAvatarPanel(name, "images/avatar3.jpg", Color.PINK);

				panel5.add(panelm3);

			}

			// east Bottom
			compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
			JPanel panel6 = new JPanel(new GridLayout(2, 2));
			{

				// panel6.setBackground(Color.darkGray);
				JPanel atack = new ButtonPanel("ATACK", Color.WHITE);
				panel6.add(atack);
				JPanel defend = new ButtonPanel("DEFEND", Color.WHITE);
				panel6.add(defend);
				JPanel use = new ButtonPanel("USE", Color.LIGHT_GRAY);
				panel6.add(use);
				JPanel replace = new ButtonPanel("REPLACE", Color.LIGHT_GRAY);
				panel6.add(replace);
			}

			panel2.add(panel4);
			panel2.add(panel5);
			panel2.add(panel6);

			add(panel2, BorderLayout.EAST);
		}

// Center Panel Settings
		JPanel panel3 = new JPanel(new GridLayout(2, 2));
		{
			panel3.setBackground(Color.LIGHT_GRAY);
			panel3.setPreferredSize(new Dimension(300, 100));

//MY LIFEBAR MESSAGE TO USER

			JPanel center1 = new PlayerPanel("You lose", Color.CYAN, 100);
			JPanel lifePanelEnemy = new LifeBar(100);
			center1.add(lifePanelEnemy, BorderLayout.NORTH);
			// center1.add(lifeBar);
//ENEMY 
			JPanel center2 = new PlayerPanel("You Win", Color.pink, 50);
			JPanel lifePanelMy = new LifeBar(50);
			center2.add(lifePanelMy, BorderLayout.NORTH);

//////////////////////// show cards Display Center Bottom
			// enemy
			JPanel center3 = new CardDisplayPanel(10, 50, 100, "images/3.jpg", "Pikachu", "ATACK", Color.CYAN);

			center3.setBorder(compound);
			// my
			JPanel center4 = new CardDisplayPanel(10, 50, 50, "images/2.jpg", "MY card Golum", "ATTACK", Color.PINK);
			center4.setBorder(compound);

			panel3.add(center1);
			panel3.add(center2);
			panel3.add(center3);
			panel3.add(center4);

			add(panel3, BorderLayout.CENTER);
		}

		add(new Button("South"), BorderLayout.SOUTH);

		add(new JLabel("Board Game by Slawomir Kolodziejczyk"), BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == settings) {
			
//			settings.setBackground(Color.BLUE);
//		buttonPanel	atack.ButtonPanel().setBackground(Color.BLACK);
		}
		else {
			
		}
		
	}

}
//JPanel panelm3 = new JPanel(new GridLayout(1,2));{
//panelm3.setBackground(Color.DARK_GRAY);
//panelm3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
//
//myName = new JLabel(name);
//myName.setForeground(Color.WHITE);
//myName.setHorizontalAlignment(SwingConstants.CENTER);
//panelm3.add(myName);
//JLabel myAvatar = new JLabel("MY IMAGE");
//myAvatar.setForeground(Color.WHITE);
//myAvatar.setHorizontalAlignment(SwingConstants.CENTER);
//panelm3.add(myAvatar);
//
//
//
//
//}

//cart1 = new JButton("ATTACK");
//cart1.setOpaque(true);
//cart1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
//

//
//cart1.setBorder(compound);
//panel6.add(cart1);
//cart2 = new JButton("DEFFEND");
//cart2.setOpaque(true);
//cart2.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 10));
//
//
//cart2.setBorder(compound);
//
//panel6.add(cart2);
//
//
//use = new JButton("Use");
//use.setBackground(Color.LIGHT_GRAY);
//use.setOpaque(true);
//panel6.add(use);
//replace = new JButton("Replace");
//replace.setBackground(Color.LIGHT_GRAY);
//replace.setOpaque(true);
//size.height = 100;
//replace.setPreferredSize(size);
//panel6.add(replace);
//}
//center4.setBackground(Color.LIGHT_GRAY);
//center4.setBorder(BorderFactory.createMatteBorder(
//		0, 10,10, 10, Color.PINK));
//center4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
//compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
//cardName2 = new JLabel("MY CARDS");
//cardName2.setHorizontalAlignment(JLabel. CENTER);
//cardName2.setBackground(Color.PINK);
//cardName2.setFont(new Font("SansSerif", Font.BOLD, 20));
//
//cardName3 = new JLabel("DEFEND");
//cardName3.setHorizontalAlignment(JLabel. CENTER);
//cardName3.setBackground(Color.PINK);
//cardName3.setFont(new Font("Monospaced", Font.BOLD, 20));
//JPanel statsP2 = new JPanel(new GridLayout(3,2));
//	statsP2.setPreferredSize(new Dimension(155,50));
//stats1 = new JLabel[6];
//stats1[0] = new JLabel("A");
//stats1[1] = new JLabel("15");
//stats1[2] = new JLabel("B");
//stats1[3] = new JLabel("25%");
//stats1[4] = new JLabel("C");
//stats1[5] = new JLabel("10%");
//for(int i=0; i<stats1.length; i++)
//{
//	stats1[i].setOpaque(true);
//	stats1[i].setBackground(Color.yellow);
//	stats1[i].setFont(new Font("Arial", Font.PLAIN , 20));
//	stats1[i].setBorder(compound);
//	add(stats1[i]);
//	statsP2.add(stats1[i]);
//}
//JLabel image2 = new JLabel("image2");
//image2.setOpaque(true);
//image2.setHorizontalAlignment(JLabel. CENTER);
//
//center4.add(image2,BorderLayout.CENTER);
//center4.add(statsP2,BorderLayout.EAST);
//center4.add(cardName2, BorderLayout.NORTH);
//center4.add(cardName3, BorderLayout.SOUTH);
