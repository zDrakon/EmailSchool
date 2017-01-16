package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ReasonGUI {

	JFrame frame;
	private JTextField otherTextField;
	private JTextField inputClassTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReasonGUI window = new ReasonGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public ReasonGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 549, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel currentGradePanel = new JPanel();
		currentGradePanel.setBounds(6, 6, 537, 31);
		frame.getContentPane().add(currentGradePanel);
		currentGradePanel.setLayout(null);

		JLabel P1GradeLabel = new JLabel("P1: GRADE");
		P1GradeLabel.setBounds(6, 5, 85, 16);
		currentGradePanel.add(P1GradeLabel);
		P1GradeLabel.setBackground(Color.WHITE);

		JLabel P2GradeLabel = new JLabel("P2: GRADE");
		P2GradeLabel.setBounds(103, 5, 71, 16);
		currentGradePanel.add(P2GradeLabel);
		P2GradeLabel.setBackground(Color.WHITE);

		JLabel S1GradeLabel = new JLabel("S1: GRADE");
		S1GradeLabel.setBounds(186, 3, 78, 20);
		currentGradePanel.add(S1GradeLabel);
		S1GradeLabel.setBackground(Color.WHITE);

		JSeparator separator1 = new JSeparator();
		separator1.setForeground(Color.BLACK);
		separator1.setBackground(Color.BLACK);
		separator1.setBounds(6, 131, 537, 12);
		frame.getContentPane().add(separator1);

		JPanel lastYearGradePanel = new JPanel();
		lastYearGradePanel.setBounds(6, 49, 537, 72);
		frame.getContentPane().add(lastYearGradePanel);
		lastYearGradePanel.setLayout(null);

		JLabel lastYearLabel = new JLabel("Last Year: ");
		lastYearLabel.setBounds(6, 6, 72, 16);
		lastYearGradePanel.add(lastYearLabel);

		JLabel classNameLabel = new JLabel("CLASS NAME HERE >");
		classNameLabel.setBounds(90, 6, 135, 16);
		lastYearGradePanel.add(classNameLabel);

		JLabel S1Label = new JLabel("S1: GRADE");
		S1Label.setBounds(227, 6, 74, 16);
		lastYearGradePanel.add(S1Label);

		JLabel S2Label = new JLabel("S2: GRADE");
		S2Label.setBounds(313, 6, 72, 16);
		lastYearGradePanel.add(S2Label);

		JLabel desiredClassLabel = new JLabel("Desired Class: CLASS NAME");
		desiredClassLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		desiredClassLabel.setBounds(6, 34, 295, 28);
		lastYearGradePanel.add(desiredClassLabel);

		otherTextField = new JTextField();

		JSeparator separator2 = new JSeparator();
		separator2.setForeground(Color.BLACK);
		separator2.setBackground(Color.BLACK);
		separator2.setBounds(6, 232, 537, 12);
		frame.getContentPane().add(separator2);

		JPanel reasonPanel = new JPanel();
		reasonPanel.setBounds(6, 144, 537, 89);
		frame.getContentPane().add(reasonPanel);
		reasonPanel.setLayout(null);

		JLabel lblReasons = new JLabel("Reasons:");
		lblReasons.setBounds(0, 0, 79, 22);
		reasonPanel.add(lblReasons);
		lblReasons.setFont(new Font("Lucida Grande", Font.PLAIN, 16));

		JCheckBox chckbxClassMovesMuch = new JCheckBox("DESIRED CLASS moves much faster");
		chckbxClassMovesMuch.setBounds(0, 20, 252, 23);
		reasonPanel.add(chckbxClassMovesMuch);

		JCheckBox chckbxClassRequires = new JCheckBox("DESIRED CLASS requires complete mastery of PREV CLASS");
		chckbxClassRequires.setBounds(0, 40, 393, 23);
		reasonPanel.add(chckbxClassRequires);

		JCheckBox chckbxOther = new JCheckBox("Other");
		chckbxOther.setBounds(0, 60, 79, 23);
		reasonPanel.add(chckbxOther);

		JSeparator separator3 = new JSeparator();
		separator3.setForeground(Color.BLACK);
		separator3.setBackground(Color.BLACK);
		separator3.setBounds(6, 307, 537, 12);
		frame.getContentPane().add(separator3);

		JPanel recommendationPanel = new JPanel();
		recommendationPanel.setBounds(6, 247, 537, 55);
		frame.getContentPane().add(recommendationPanel);
		recommendationPanel.setLayout(null);

		JLabel recommendationLabel = new JLabel("Recommendation:");
		recommendationLabel.setBounds(0, 0, 151, 22);
		recommendationPanel.add(recommendationLabel);
		recommendationLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));

		JLabel wouldRecommendLabel = new JLabel("I recommend you to take ");
		wouldRecommendLabel.setBounds(0, 25, 161, 16);
		recommendationPanel.add(wouldRecommendLabel);

		inputClassTextField = new JTextField();
		inputClassTextField.setBounds(160, 20, 130, 26);
		recommendationPanel.add(inputClassTextField);
		inputClassTextField.setHorizontalAlignment(SwingConstants.CENTER);
		inputClassTextField.setText("Insert class here");
		inputClassTextField.setColumns(10);

		JPanel emailSpecificationsPanel = new JPanel();
		emailSpecificationsPanel.setBounds(6, 331, 537, 241);
		frame.getContentPane().add(emailSpecificationsPanel);
		emailSpecificationsPanel.setLayout(null);

		JLabel emailSpecLabel = new JLabel("Email Specifications:");
		emailSpecLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		emailSpecLabel.setBounds(0, 0, 166, 22);
		emailSpecificationsPanel.add(emailSpecLabel);

		JLabel emailToBeSentLabel = new JLabel("Email to be sent:");
		emailToBeSentLabel.setBounds(0, 26, 105, 16);
		emailSpecificationsPanel.add(emailToBeSentLabel);

		JTextArea txtrTemplatetxtWouldGo = new JTextArea();
		txtrTemplatetxtWouldGo.setWrapStyleWord(true);
		txtrTemplatetxtWouldGo.setLineWrap(true);
		txtrTemplatetxtWouldGo.setText(
				"template.txt would go here with filled in placeholders and such and teacher can edit the email if need be.");
		txtrTemplatetxtWouldGo.setBounds(0, 54, 531, 114);
		emailSpecificationsPanel.add(txtrTemplatetxtWouldGo);

		JLabel lblSendEmailTo = new JLabel("Send email to:");
		lblSendEmailTo.setBounds(0, 180, 95, 16);
		emailSpecificationsPanel.add(lblSendEmailTo);

		JCheckBox counselorCheckBox = new JCheckBox("Counselor");
		counselorCheckBox.setSelected(true);
		counselorCheckBox.setBounds(0, 200, 105, 23);
		emailSpecificationsPanel.add(counselorCheckBox);

		JCheckBox parentsCheckBox = new JCheckBox("Parents");
		parentsCheckBox.setSelected(true);
		parentsCheckBox.setBounds(117, 200, 105, 23);
		emailSpecificationsPanel.add(parentsCheckBox);

		JCheckBox studentCheckBox = new JCheckBox("Student");
		studentCheckBox.setSelected(true);
		studentCheckBox.setBounds(219, 200, 105, 23);
		emailSpecificationsPanel.add(studentCheckBox);

		JCheckBox ccYourselfCheckBox = new JCheckBox("cc: Yourself");
		ccYourselfCheckBox.setSelected(true);
		ccYourselfCheckBox.setBounds(336, 200, 124, 23);
		emailSpecificationsPanel.add(ccYourselfCheckBox);

		chckbxOther.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					otherTextField.setVisible(true);
					otherTextField.setText("Type your custom reason here...");
					otherTextField.setBounds(80, 60, 467, 26);
					otherTextField.setColumns(10);
					otherTextField.setEditable(true);
					reasonPanel.add(otherTextField);
				} else {
					otherTextField.setVisible(false);
				}
			}
		});

	}
}
