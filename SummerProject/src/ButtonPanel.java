
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;


public class ButtonPanel extends JPanel implements ActionListener {
	boolean check = true;
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
		this.cart1.addActionListener(this);
		
		
		cart1.setBorder(compound);
		add(cart1);
//		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
if(e.getSource() == cart1) {
	
	if(check == true) {
	cart1.setBackground(Color.GREEN);
	check = false;
	}
	else {
		cart1.setBackground(Color.WHITE);
		check = true;
	}
		}

	}
	}

