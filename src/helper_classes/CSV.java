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

		int rows = lines.length;
		int cols = lines[0].length();

		this.setData(new String[rows][cols]);

		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			String[] coords = line.split(",");
			for (int j = 0; j < cols; j++) {
				if (coords[j].endsWith("#") || coords[j].endsWith("\n"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
			}
		}
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
