package examples;

public class StudentScores
{
	/**********************************************
	*      Section 4 Lab - Student Scores         *
	**********************************************/
	
    public static void main(String[] args) 
	{
		// declare variables //
		float score1, score2, score3, score4;
		float average;
		
		// assign variables //
		score1 = 80.5f;
		score2 = 92.5f;
		score3 = 89.7f;
		score4 = 95.9f;
		
		average = (score1 + score2 + score3 + score4)/4;
		
		// print scores and average//
		
		System.out.println("Student Florey scored:");
        System.out.println("Test 1: " + score1);
		System.out.println("Test 2: " + score2);       
		System.out.println("Test 3: " + score3);
		System.out.println("Test 4: " + score4);
		System.out.println("\tAverage Score: " + average);
    }
}
