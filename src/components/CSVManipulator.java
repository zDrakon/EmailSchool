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

		// There must be a column called "id"
		String[] columnNames = csv.getColumnNames();

		// Key will be id, value is Student object
		int row = 0;
		for (String id : csv.getColumn("id")) {
			// Make a new student and set some parameters
			Student s = new Student();
			s.setID(id);
			addStudentInformation(s, csv, columnNames, row);

			// Add the newly-created student object to our hashmap
			students.put(id, s);

			// Increment the row number
			row++;
		}

		return students;

	}

	private static void addStudentInformation(Student s, CSV csv, String[] columnNames, int row) {
		for (String column : columnNames) {
			// If any of the names of the column is firstname, lastname,
			// desiredclass, or previousclassgrade, add them to the student
			// object.
			switch (column) {
			case "firstname":
				s.setFirstName(csv.getColumn("firstname")[row]);
				break;
			case "lastname":
				s.setLastName(csv.getColumn("lastname")[row]);
				break;
			case "desiredclass":
				s.setDesiredClass(csv.getColumn("desiredclass")[row]);
				break;
			case "previousclassgrade":
				s.setPreviousClassGrade(csv.getColumn("previousclassgrade")[row]);
				break;
			default:
				// Only temporary
				System.out.println("Could not add anything!");
			}
		}

	}

	public static void addStudentDatas(HashMap<String, Student> students, String filepath) {
		CSV csv = new CSV(filepath);

		String[] columnNames = csv.getColumnNames();

		// Loop through the csv file while getting and manipulating all the
		// information necessary
		int row = 0;
		for (String id : csv.getColumn("id")) {
			Student student = students.get(id);

			// If no student can be found in our HashMap...
			if (student.equals(null)) {
				// Make a new student and set some parameters
				Student s = new Student();
				s.setID(id);
				addStudentInformation(s, csv, columnNames, row);

				// Add the newly-created student object to our hashmap
				students.put(id, s);

				// If a student can be found...
			} else {
				// Add more parameters
				addStudentInformation(student, csv, columnNames, row);
			}
			// Increment the row number
			row++;
		}
	}
}
