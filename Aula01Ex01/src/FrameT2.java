import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrameT2 {
	private JFrame frame;
	
	public FrameT2() {
		frame = new JFrame("Default Name");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		//dfss
		addFrameContent();
		
		frame.pack();
	}
	
	public void open() {
		// para abrir a janela (torna-la visivel)
		frame.setVisible(true);
	}
	
	public void addFrameContent() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2));
		
		JLabel label_title = new JLabel("Title");
		JLabel label_width = new JLabel("Width");
		JLabel label_height = new JLabel("Height");
		
		JTextField text_title = new JTextField("text_title");
		JTextField text_width = new JTextField("300");
		JTextField text_height = new JTextField("450");
		
		JCheckBox check = new JCheckBox("Check");
		JButton button = new JButton("Button");
		
		panel.add(label_title);
		panel.add(text_title);
		
		panel.add(label_width);
		panel.add(text_width);
		
		panel.add(label_height);
		panel.add(text_height);
		
		panel.add(check);
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, check.isSelected() ? "checked" : "not checked");
				
				int width = Integer.parseInt(text_width.getText());
				int height = Integer.parseInt(text_height.getText());
				
				frame.setTitle(text_title.getText());
				frame.setSize(width, height);
				
				if(check.isSelected()) {
					frame.setLocationRelativeTo(null);
				}
				
					
			}
		});
		
		
		frame.add(panel);
	}
}
