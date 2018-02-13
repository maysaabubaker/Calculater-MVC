package CalcPackage;
import java.awt.EventQueue;

public class MainClass {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControllerClass con=new ControllerClass();
					ModelClass mod=new ModelClass();
					ViewClass view =new ViewClass();
					con.addModel(mod);
					con.addView(view);
					view.addController(con);
					view.setLocationRelativeTo(null);
					view.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

