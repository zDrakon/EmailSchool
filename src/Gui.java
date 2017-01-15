import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Gui {

	private JFrame frame;
	private JTextField emailAddressField;
	private JPasswordField passwordField;
	private JPanel questionPanel;
	private JLabel question1Title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel emailInfoPanel = new JPanel();
		emailInfoPanel.setBounds(18, 20, 226, 69);
		emailInfoPanel.setBorder(null);
		frame.getContentPane().add(emailInfoPanel);
		emailInfoPanel.setLayout(null);

		emailAddressField = new JTextField();
		emailAddressField.setHorizontalAlignment(SwingConstants.CENTER);
		emailAddressField.setBounds(0, 16, 226, 26);
		emailInfoPanel.add(emailAddressField);
		emailAddressField.setToolTipText("Insert your email here");
		emailAddressField.setText("example@gmail.com");
		emailAddressField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		passwordField.setBounds(0, 43, 226, 26);
		passwordField.setText("password");
		emailInfoPanel.add(passwordField);
		passwordField.setToolTipText("Insert your email password here");

		JLabel lblEnterYourEmail = DefaultComponentFactory.getInstance().createTitle("ENTER YOUR EMAIL INFO BELOW");
		lblEnterYourEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourEmail.setBounds(0, 0, 226, 16);
		emailInfoPanel.add(lblEnterYourEmail);

		questionPanel = new JPanel();
		questionPanel.setBounds(18, 119, 226, 159);
		frame.getContentPane().add(questionPanel);
		questionPanel.setLayout(null);

		question1Title = new JLabel("Example question here");
		question1Title.setBounds(6, 6, 214, 16);
		questionPanel.add(question1Title);
	}
}
