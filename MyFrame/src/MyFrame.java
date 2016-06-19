import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JFrame f = new JFrame("YourFrame");
		f.setSize(500, 600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
