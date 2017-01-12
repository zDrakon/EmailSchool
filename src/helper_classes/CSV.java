package helper_classes;

public class CSV {
	private String[][] data;
	private String[] columnNames;

	/***
	 * Converts a .csv file into a CSV Object for code manipulation.
	 * 
	 * @param filepath
	 * @param startRow
	 */
	public CSV(String filepath) {
		String dataString = FileIO.readFileAsString(filepath);
		String[] lines = dataString.split("\n");
		columnNames = lines[0].split(",");

		int rows = lines.length; // Length of the first column
		int cols = columnNames.length; // Length of the first row

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
