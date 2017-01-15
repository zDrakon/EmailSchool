package components;

public class Student {
	private String name;
	private String firstName;
	private String lastName;
	private int ID;
	private String desiredClass;
	private String finalGradeOfPreviousClass;

	public String getDesiredClass() {
		return desiredClass;
	}

	public void setDesiredClass(String desiredClass) {
		this.desiredClass = desiredClass;
	}

	public String getFinalGradeOfPreviousClass() {
		return finalGradeOfPreviousClass;
	}

	public void setFinalGradeOfPreviousClass(String finalGradeOfPreviousClass) {
		this.finalGradeOfPreviousClass = finalGradeOfPreviousClass;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public void setID(String ID) {
		this.ID = Integer.parseInt(ID);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		setName(this.firstName + this.lastName);
	}

	public void setLastName(String lastName) {
		this.firstName = lastName;
		setName(this.firstName + this.lastName);
	}

}
