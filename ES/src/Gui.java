import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Gui{
	JFrame frame;
	JPanel main_panel;
	
	String selected_file;
	public Gui() {
		this.frame = new JFrame("ES");
		main_panel = new JPanel();
		
		
	}
	
	public void start() {
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void manage_gui(JPanel panel) {
		main_panel.setLayout(new GridLayout(3,1));
		frame.add(main_panel);
		main_panel.add(panel);
	}
	
	public String getSelectedFile()  {
		return selected_file;
	}
	
	public void setSelectedFile(String text) {
		this.selected_file = text;
		///Gsdfs
	}
	
}
