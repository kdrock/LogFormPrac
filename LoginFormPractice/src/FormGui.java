import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormGui {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel userLabel = new JLabel("User");
		
		frame.setVisible(true);
		frame.setSize(350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		userLabel.setBounds(30, 30, 85, 25);
		panel.add(userLabel);
		
		JTextField userTextField = new JTextField(20);
		userTextField.setBounds(100,30,175,25);
		panel.add(userTextField);
		
		
		
		
		panel.setLayout(null);
	}

}
