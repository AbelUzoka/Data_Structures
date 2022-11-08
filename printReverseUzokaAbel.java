// Class: CS 5040
// Term: Spring 2022
// Name: Uzoka Abel
// Program Number: Assignment 1 - Recursion #1
// IDE:  Eclipse, JDK 17.0.2

package abel;
import java.util.Scanner;
public class printReverseUzokaAbel {

	public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        while (true) {
            System.out.println("");
        System.out.print("Entered String:  ");
        String word = str.nextLine();
        
        if(word == null || word == "")
        {
        	return;
        }
        String result = printCharsReverse(word);
        
        System.out.println("Number of vowels: " + result); 
        
        System.out.print("Try Again (Y/N):    ");
        String option = str.nextLine();
        		
        		if (option.equals("N"))
        		{
        		    System.out.print("");    
        			System.exit(1);	
        		}
            }
	}      
    static String printCharsReverse(String str)
        {
            if(str.length() == 1)
            {
                return str;
            }
            var firstLetter = str.charAt(0);
            var sub = str.substring(1);

            return printCharsReverse(sub) + firstLetter;
        }
}
