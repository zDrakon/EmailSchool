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
		Student s = new Student();
		HashMap<String, Student> students = new HashMap<String, Student>();

		String[] columnNames = csv.getColumnNames();
		// Assume {id, firstname, lastname, desiredClass,
		// finalGradeOfPreviousClass}

		// Key will be id, value is Student object
		for (String id : csv.getColumn(columnNames[0])) {
			students.put(id, s);
			s.setID(id);
			s.setFirstName(columnNames[1]);
			s.setLastName(columnNames[2]);
			s.setDesiredClass(columnNames[3]);
			s.setFinalGradeOfPreviousClass(columnNames[4]);
		}

		return students;

	}

	/***
	 * Returns a HashMap of all student data from multiple files.
	 * 
	 * @param filepath
	 * @return
	 */
	public static HashMap<String, Student> addStudentDatas(String[] filepaths) {
		return null;
	}
}
