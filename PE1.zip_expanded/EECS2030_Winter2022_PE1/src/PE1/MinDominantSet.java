package PE1;
import java.util.ArrayList;
/* PLEASE DO NOT MODIFY A SINGLE STATEMENT IN THE TEXT BELOW.
READ THE FOLLOWING CAREFULLY AND FILL IN THE GAPS

I hereby declare that all the work that was required to 
solve the following problem including designing the algorithms
and writing the code below, is solely my own and that I received
no help in creating this solution and I have not discussed my solution 
with anybody. I affirm that I have read and understood
the Senate Policy on Academic honesty at 
https://secretariat-policies.info.yorku.ca/policies/academic-honesty-senate-policy-on/
and I am well aware of the seriousness of the matter and the penalties that I will face as a 
result of committing plagiarism in this assignment.

BY FILLING THE GAPS,YOU ARE SIGNING THE ABOVE STATEMENTS.

Full Name:
Student Number:
Course Section:
*/

public class MinDominantSet {
	int [][] buildings; 
	ArrayList<Integer[]> combination; 
	private int size;

	public static void main(String[] args) {
		/*
		 * We don't need this method to solve the problem. I kept
	     * it here just in case you need to test your code differently.
		 */
	}
	
	
	public MinDominantSet () {
		// insert your code here for task 0
	}
	
	public MinDominantSet (int size, int [][] buildings) {
		// insert your code here for task 2
	}
	

	void combination(int n, int r) {
		// insert your code here for task1
		// Note: this method or its helper must be recursive. 
	}

	
	public boolean isEnough(int numMachine) {
		// insert your code here for task 3
		// you may want to change the return value
		return true;
	}

	
	/**
	 * This method prints the content of the combination.
	 * we don't need this method to solve this problem, 
	 * however it is there to help you see the content of 
	 * the list, when you check for the correctness of your
	 * code. 
	 */
	void print() {

		for (int i = 0; i < combination.size(); i++) {
			for (int j = 0; j < combination.get(i).length; j++) {
				System.out.print(combination.get(i)[j]+ "\t"); 
			}
			System.out.println(); 		
		}
	}
			 
} // end of MinDominantSet

