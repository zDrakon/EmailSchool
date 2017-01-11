import java.util.ArrayList;

public class Placeholders {
	ArrayList<String> placeholders;

	public Placeholders() {
		placeholders = new ArrayList<String>();

	}

	/***
	 * Adds a placeholder to the list of placeholders.
	 * 
	 * @param placeholder
	 *            - %example_placeholder_format%
	 */
	public void addPlaceholder(String placeholder) {
		placeholders.add(placeholder);
	}

	/***
	 * Adds all the student related placeholders.
	 */
	public void addStudentPlaceholders() {
		addPlaceholder("%student_firstname%");
		addPlaceholder("%student_lastname%");
		addPlaceholder("%student_id%");
		addPlaceholder("%student_adv_classes%");
		addPlaceholder("%student_email%");
	}

	/***
	 * Adds all the parent/guardian related placeholders.
	 */
	public void addParentPlaceholders() {
		addPlaceholder("%guardian1_email%");
		addPlaceholder("%guardian2_email%");
		addPlaceholder("%guardian1_firstname%");
		addPlaceholder("%guardian2_firstname%");
		addPlaceholder("%guardian1_lastname%");
		addPlaceholder("%guardian2_lastname%");
		addPlaceholder("%guardian1_formality%");
		addPlaceholder("%guardian2_formality%");
	}

}
