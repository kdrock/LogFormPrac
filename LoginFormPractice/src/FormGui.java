import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormGui implements ActionListener {

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel successLabel,passwordLabel,userLabel,passTooShortLabel;
	private static JButton loginButton, registerButton;
	private static JTextField userTextField,passwordTextField;

	public static void main(String[] args) {

		frame = new JFrame();
		panel = new JPanel();
		userLabel = new JLabel("User");
		passwordLabel = new JLabel("Password");
		successLabel = new JLabel("");
		passTooShortLabel = new JLabel("");
		loginButton = new JButton("Login");
		registerButton = new JButton("Register");
		userTextField = new JTextField(20);
		passwordTextField = new JPasswordField(30);

		panel.setLayout(null);
		frame.setSize(380, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		userLabel.setBounds(50, 78, 80, 25);
		panel.add(userLabel);

		passwordLabel.setBounds(50, 98, 80, 25);
		panel.add(passwordLabel);

		userTextField.setBounds(115, 80, 160, 20);
		panel.add(userTextField);

		passwordTextField.setBounds(115, 100, 160, 20);
		panel.add(passwordTextField);

		loginButton.setBounds(115, 130, 68, 20);
		loginButton.addActionListener(new FormGui());
		panel.add(loginButton);

		registerButton.setBounds(190, 130, 82, 20);
		registerButton.addActionListener(new FormGui());
		panel.add(registerButton);

		successLabel.setBounds(120, 200, 200, 20);
		panel.add(successLabel);
//		successLabel.setText("Success, logging in...");
		
		passTooShortLabel.setBounds(50, 200, 350, 20);
		panel.add(passTooShortLabel);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userTextField.getText();
		String password = passwordTextField.getText();
		ArrayList<String> up = new ArrayList<String>();
		up.add(user + " , " + password);

		if (e.getSource() == registerButton) {
			successLabel.setText("");
			passTooShortLabel.setText("");
			
			if (password.length() < 5) {
				passTooShortLabel.setText("Password should be at least 5 characters long.");
			} else {
				users.addUser(up);
				successLabel.setText("Registration successful.");
			}
			

		}

		if (e.getSource() == loginButton) {
			successLabel.setText("");
			passTooShortLabel.setText("");
			
			if (users.checker(up) != true) {
				successLabel.setText("Invalid password!");
			} else {
				successLabel.setText("Success, logging in...");
			}

		}
	}

}
