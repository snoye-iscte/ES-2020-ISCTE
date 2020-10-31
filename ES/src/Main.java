
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui gui = new Gui();
		gui.start();
		getExcel getE = new getExcel();
		getE.addThings();
		
		gui.manage_gui(getE);
		
		//gui.manage_gui(null);
	}

}
