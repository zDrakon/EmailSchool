package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MainGUI {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 549, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel studentDescHeader = new JPanel();
		studentDescHeader.setBounds(6, 6, 537, 41);
		frame.getContentPane().add(studentDescHeader);
		studentDescHeader.setLayout(null);

		JLabel studentNameLabel = new JLabel("STUDENT NAME HERE");
		studentNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		studentNameLabel.setBounds(6, 6, 245, 29);
		studentDescHeader.add(studentNameLabel);

		JLabel lblCourseNameHere = new JLabel("COURSE NAME HERE");
		lblCourseNameHere.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourseNameHere.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCourseNameHere.setBounds(263, 6, 268, 29);
		studentDescHeader.add(lblCourseNameHere);

		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		separator1.setForeground(Color.BLACK);
		separator1.setBounds(6, 47, 537, 12);
		frame.getContentPane().add(separator1);

		JPanel currentGradePanel = new JPanel();
		currentGradePanel.setBounds(6, 59, 537, 31);
		frame.getContentPane().add(currentGradePanel);
		currentGradePanel.setLayout(null);

		JLabel P1GradeLabel = new JLabel("Progress Report 1: GRADE");
		P1GradeLabel.setBounds(6, 5, 172, 16);
		currentGradePanel.add(P1GradeLabel);
		P1GradeLabel.setBackground(Color.WHITE);

		JLabel P2GradeLabel = new JLabel("Progress Report 2: GRADE");
		P2GradeLabel.setBounds(190, 5, 172, 16);
		currentGradePanel.add(P2GradeLabel);
		P2GradeLabel.setBackground(Color.WHITE);

		JLabel S1GradeLabel = new JLabel("Semester 1: GRADE");
		S1GradeLabel.setBounds(373, 5, 158, 16);
		currentGradePanel.add(S1GradeLabel);
		S1GradeLabel.setBackground(Color.WHITE);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(6, 91, 537, 12);
		frame.getContentPane().add(separator);

		JPanel lastYearGradePanel = new JPanel();
		lastYearGradePanel.setBounds(6, 109, 537, 140);
		frame.getContentPane().add(lastYearGradePanel);
		lastYearGradePanel.setLayout(null);

		JLabel lastYearLabel = new JLabel("Last Year: ");
		lastYearLabel.setBounds(6, 6, 72, 16);
		lastYearGradePanel.add(lastYearLabel);

		JLabel classNameLabel = new JLabel("CLASS NAME HERE >");
		classNameLabel.setBounds(90, 6, 139, 16);
		lastYearGradePanel.add(classNameLabel);

		JLabel S1Label = new JLabel("Semester 1: GRADE");
		S1Label.setBounds(227, 6, 130, 16);
		lastYearGradePanel.add(S1Label);

		JLabel S2Label = new JLabel("Semester 2: GRADE");
		S2Label.setBounds(373, 6, 139, 16);
		lastYearGradePanel.add(S2Label);

		JLabel desiredClassLabel = new JLabel("Desired Class: CLASS NAME");
		desiredClassLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		desiredClassLabel.setBounds(6, 34, 295, 28);
		lastYearGradePanel.add(desiredClassLabel);

		JRadioButton agreeButton = new JRadioButton("Agree");
		agreeButton.setBounds(0, 80, 120, 23);
		lastYearGradePanel.add(agreeButton);
		agreeButton.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton SomeRButton = new JRadioButton("Some Reservations");
		SomeRButton.setBounds(132, 80, 200, 23);
		lastYearGradePanel.add(SomeRButton);
		SomeRButton.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton StrongRButton = new JRadioButton("Strong Reservations");
		StrongRButton.setBounds(343, 80, 200, 23);
		lastYearGradePanel.add(StrongRButton);
		StrongRButton.setHorizontalAlignment(SwingConstants.CENTER);

	}
}
