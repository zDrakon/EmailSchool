import java.util.HashMap;

import helper_classes.CSV;

public class CSVManipulator {

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
			s.setId(id);
			s.setFirstName(columnNames[1]);
			s.setlastName(columnNames[2]);
			s.setDesiredClass(columnNames[3]);
			s.setFinalGradeOfPreviousClass(columnNames[4]);

		}

		return students;

	}

	public static HashMap<String, Student> addStudentDatas(String filepath) {
		return null;
	}
}
