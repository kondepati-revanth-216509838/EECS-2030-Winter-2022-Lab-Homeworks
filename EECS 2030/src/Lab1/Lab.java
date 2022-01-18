package Lab1;


/**@pre The input grade is a double number between zero and 100
inclusive.
/
 /
 * 
 * @author Revanth Kondepati
 *
 */
public class Lab {

	public static String getMyID() {
		return "216509838";
	}
	
	public static String getLetterGrade(double grade) {
		String letterGrade = new String("");
		
		if(grade >= 90) {
			letterGrade = "A+";
		} else if (grade >= 80 && grade < 90) {
			letterGrade = "A";
		} else if (grade >= 75 && grade < 80) {
			letterGrade = "B+";
		} else if (grade >= 70 && grade < 75) {
			letterGrade = "B";
		} else if (grade >= 65 && grade < 70) {
			letterGrade = "C+";
		} else if (grade >= 60 && grade < 65) {
			letterGrade = "C";
		} else if (grade >= 55 && grade < 60) {
			letterGrade = "D+";
		} else if (grade >= 50 && grade < 55) {
			letterGrade = "D";
		} else if (grade >= 45 && grade < 50) {
			letterGrade = "E";
		} else if (grade < 45) {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
}
