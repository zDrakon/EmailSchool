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

	/***
	 * Sets a specific String value to a coord of 2D Data Array.
	 * 
	 * @param r
	 * @param c
	 * @param value
	 */
	public void setEntry(int r, int c, String value) {
		data[r][c] = value;
	}

	/***
	 * Returns the contents of a specified column.
	 * 
	 * @param colIndex
	 *            - Index of a column
	 * @return
	 */
	public String[] getColumn(int colIndex) {
		int colLength = data.length;
		int rowLength = data[0].length;

		String[] output = new String[colLength];

		for (int r = 0; r < rowLength; r++) {
			output[r] = data[r][colIndex];
		}

		return output;
	}

	/***
	 * Overridden method to find the column index of a specified columnName
	 * 
	 * @param columnName
	 * @return
	 */
	public String[] getColumn(String columnName) {
		int colIndex = 0;
		for (int i = 0; i < columnNames.length; i++) {
			if (columnNames[i].equals(columnName)) {
				colIndex = i;
			}
		}

		return getColumn(colIndex);
	}

	/***
	 * Returns a row with specified index of desired row.
	 * 
	 * @param rowIndex
	 * @return
	 */
	public String[] getRow(int rowIndex) {
		return data[rowIndex];
	}

	/***
	 * Returns all columnNames
	 * 
	 * @return
	 */
	public String[] getColumnNames() {
		return columnNames;
	}

}
