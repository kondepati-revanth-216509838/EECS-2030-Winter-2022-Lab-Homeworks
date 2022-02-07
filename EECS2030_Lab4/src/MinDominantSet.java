import java.util.ArrayList;

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
		this.size = 0;
		combination = new ArrayList<Integer[]>();
	}
	
	public MinDominantSet (int size, int [][] buildings) {
		// insert your code here for task 2
		this.size = size;
		this.buildings = buildings;
		combination = new ArrayList<Integer[]>();
	}
	

	void combination(int n, int r) {
		// insert your code here for task1
		// Note: this method or its helper must be recursive.
		
	}

	
	public boolean isEnough(int numMachine) {
		// insert your code here for task 3
		// you may want to change the return value
		return false;
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

