package Lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LabTest {

	@Test
	void Borderline() {
		Lab Border = new Lab();
		assertEquals("A+", Border.getLetterGrade(100));
		assertEquals("A+", Border.getLetterGrade(90));
		
		assertEquals("A", Border.getLetterGrade(89));
		assertEquals("A", Border.getLetterGrade(80));
		
		assertEquals("B+", Border.getLetterGrade(79));
		assertEquals("B+", Border.getLetterGrade(75));
		
		assertEquals("B", Border.getLetterGrade(74));
		assertEquals("B", Border.getLetterGrade(70));
		
		assertEquals("C+", Border.getLetterGrade(69));
		assertEquals("C+", Border.getLetterGrade(65));
		
		assertEquals("C", Border.getLetterGrade(64));
		assertEquals("C", Border.getLetterGrade(60));
		
		assertEquals("D+", Border.getLetterGrade(59));
		assertEquals("D+", Border.getLetterGrade(55));
		
		assertEquals("D", Border.getLetterGrade(54));
		assertEquals("D", Border.getLetterGrade(50));
		
		assertEquals("E", Border.getLetterGrade(49));
		assertEquals("E", Border.getLetterGrade(45));
		
		assertEquals("F", Border.getLetterGrade(44));
		assertEquals("F", Border.getLetterGrade(40));
		
	}

}
