import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Gui {

	private JFrame frame;

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
		frame.setBounds(100, 100, 549, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel studentDescHeader = new JPanel();
		studentDescHeader.setBounds(6, 6, 537, 41);
		frame.getContentPane().add(studentDescHeader);
		studentDescHeader.setLayout(null);

		JLabel studentNameLabel = new JLabel("STUDENT NAME HERE");
		studentNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		studentNameLabel.setBounds(6, 6, 178, 29);
		studentDescHeader.add(studentNameLabel);

		JLabel lblCourseNameHere = new JLabel("COURSE NAME HERE");
		lblCourseNameHere.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCourseNameHere.setBounds(286, 6, 245, 29);
		studentDescHeader.add(lblCourseNameHere);

		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		separator1.setForeground(Color.BLACK);
		separator1.setBounds(6, 47, 537, 12);
		frame.getContentPane().add(separator1);

		JPanel panel = new JPanel();
		panel.setBounds(6, 59, 537, 31);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel P1GradeLabel = new JLabel("Proress Report 1: GRADE");
		P1GradeLabel.setBounds(6, 5, 66, 16);
		panel.add(P1GradeLabel);
		P1GradeLabel.setBackground(Color.WHITE);

		JLabel P2GradeLabel = new JLabel("Progress Report 2: GRADE");
		P2GradeLabel.setBounds(162, 5, 199, 16);
		panel.add(P2GradeLabel);
		P2GradeLabel.setBackground(Color.WHITE);

		JLabel S1GradeLabel = new JLabel("Semester 1: GRADE");
		S1GradeLabel.setBounds(405, 5, 66, 16);
		panel.add(S1GradeLabel);
		S1GradeLabel.setBackground(Color.WHITE);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(6, 91, 537, 12);
		frame.getContentPane().add(separator);
	}
}
