
public class Student {
	private String name;
	private String firstName;
	private String lastName;
	private int ID;

	public Student(int ID, String firstName, String lastName) {
		name = firstName + " " + lastName;
		this.ID = ID;

	}

	public int getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
