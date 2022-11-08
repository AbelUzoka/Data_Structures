package abel; 
import java.util.Scanner;
public class StarPatternYourName {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Number of Rows:  ");
            int n = s.nextInt();
         
            if(n == 0)
            {
            	return;
            }
        printPattern(n, n);
               
        System.out.print("Try Again (Y/N):   ");
        String option = p.nextLine();
        		
        if (option.equals("N"))
		{
		    System.out.print("");    
			System.exit(1);	
		}
      }
	}
    
    static void printAsterisks(int num)
        {
            if(num == 0)
            {
                return;
            }
            System.out.print("* ");
            printAsterisks(num - 1);
        }
        
        static void printSpace(int num)
        {
            if (num == 0)
            	return;
            System.out.print(" ");
            printSpace(num - 1);
        }
        
        static void printPattern(int n, int i)
        {
            if (n == 0) return;
            printSpace(i - n + 1);
            printAsterisks(n);

            System.out.println();

            printPattern(n - 1, i);
        }
}
