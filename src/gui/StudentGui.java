package gui;

import javax.swing.JOptionPane;

public class StudentGui {
	public static void main(String[] args) {

		String response = JOptionPane.showInputDialog("Please type your student ID");
		int ID = Integer.parseInt(response);
	}
}
