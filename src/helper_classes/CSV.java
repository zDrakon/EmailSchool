package helper_classes;

public class CSV {
	private String[][] data;

	/***
	 * Converts a .csv file into a CSV Object for code manipulation.
	 * 
	 * @param filepath
	 * @param startRow
	 */
	public CSV(String filepath) {
		String dataString = FileIO.readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		int rows = lines.length; // Length of the first column
		int cols = lines[0].length(); // Length of the first row

		this.setData(new String[rows][cols]);
	}

	/***
	 * Returns the CSV Object's 2D Array of Strings
	 * 
	 * @return 2D Array of Strings
	 */
	public String[][] getData() {
		return data;
	}

	/***
	 * Instantiates the CSV Object's 2D Array
	 * 
	 * @param data
	 */
	public void setData(String[][] data) {
		this.data = data;
	}

}
