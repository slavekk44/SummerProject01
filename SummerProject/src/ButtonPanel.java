import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;


public class ButtonPanel extends JPanel {

	private JButton cart1;
	public int size;
	public ButtonPanel(String buttonName, Color color) {
		Border compound,loweredbevel,raisedbevel;
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		setLayout(new GridLayout(1,1));
		cart1 = new JButton(buttonName);
		cart1.setOpaque(true);
		cart1.setBackground(color);
		cart1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		
		
		
		cart1.setBorder(compound);
		add(cart1);
//		
		}
	}

