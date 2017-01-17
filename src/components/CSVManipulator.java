package components;

import java.util.HashMap;

import helper_classes.CSV;

public class CSVManipulator {

	/***
	 * Returns HashMap of student data from a single file
	 * 
	 * @param filepath
	 * @return
	 */
	public static HashMap<String, Student> getStudentsFromFile(String filepath) {
		CSV csv = new CSV(filepath);
		HashMap<String, Student> students = new HashMap<String, Student>();

		String[] columnNames = csv.getColumnNames();
		// Assume {id, firstname, lastname, desiredclass,
		// finalGradeOfPreviousClass}

		// Key will be id, value is Student object
		int row = 0;
		for (String id : csv.getColumn("id")) {
			Student s = new Student();
			s.setID(id);
			s.setFirstName(csv.getColumn("firstname")[row]);
			s.setLastName(csv.getColumn("lastname")[row]);
			s.setDesiredClass(csv.getColumn("desiredclass")[row]);
			s.setPreviousClassGrade(csv.getColumn("previousclassgrade")[row]);
			students.put(id, s);
		}

		return students;

	}

	public static HashMap<String, Student> addStudentDatas(HashMap<String, Student> students, String filepath) {
		CSV csv = new CSV(filepath);
		
		String[] columnNames = csv.getColumnNames();
		
		return null;
	}
}
