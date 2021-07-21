import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
public class NameAvatarPanel extends JPanel{

	
	private JLabel myAvatar, myName;
	public NameAvatarPanel( String textName, String iconAvatar, Color color) {
		
		setLayout(new GridLayout(1,2));
		setBackground(Color.DARK_GRAY);
		setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
		myName = new JLabel(textName);
		myName.setForeground(Color.WHITE);
		myName.setHorizontalAlignment(SwingConstants.CENTER);
		//myName.setOpaque(true);
		
		myAvatar = new JLabel();
		myAvatar.setIcon(new ImageIcon(iconAvatar));
		myAvatar.setForeground(Color.WHITE);
		myAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		myAvatar.setBorder(BorderFactory.createLineBorder(Color.white,1));
		myAvatar.setBackground(color);
		myAvatar.setOpaque(true);
		
		add(myName);
		add(myAvatar);
		
	}
}
