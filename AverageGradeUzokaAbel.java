// Class: CS 5040  
// Term: Spring 2022
// Name: Uzoka Abel
// Program Number: Assignment 1 - Recursion #2
// IDE:  Eclipse, JDK 17.0.2

package abel;
import java.util.Scanner;

public class AverageGradeUzokaAbel {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //while(true) {
        	System.out.println("");
        System.out.print("Class size:	");
        
        int n=s.nextInt();
        
        int nums[]=new int[n];
        System.out.print("Entered grade:	 ");

        for(int i=0;i<n;i++){
        	
            nums[i]=s.nextInt();
        }
        
        double result = findAverage(nums, n);
        System.out.printf("Class average:  %.2f", result) ; 
        System.out.println(""); 
     //S   }
	}
	
    static double findAverage(int[] nums, int n)
        {
            if(n == 1)
            {
                return nums[n - 1];
            }
            return ((nums[n - 1] + (n - 1) * findAverage(nums, n - 1)) / n);
        }
}