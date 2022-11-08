import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		ArrayList<String> javaList = new ArrayList<>();
		MyArrayList<String> myList = new MyArrayList<>();
		/*
		System.out.print("Enter a String: ");
		String inputStr = sc.nextLine();
		javaList.add(0,inputStr);
		myList.add(0, inputStr);
		System.out.println("javaList: " + javaList);
		System.out.println("myList: " + myList);
		*/
		
		javaList.add(0,"Alice");
		myList.add(0, "Alice");
		System.out.println("javaList: " + javaList);
		System.out.println("myList: " + myList);
		
		javaList.add(0,"Bob");
		myList.add(0, "Bob");
		System.out.println("javaList: " + javaList);
		System.out.println("myList: " + myList);
		
		
		javaList.add("Dave");
		myList.add("Dave");
		System.out.println("javaList: " + javaList);
		System.out.println("myList: " + myList);

		javaList.remove(1);
		myList.remove(1);
		System.out.println("javaList: " + javaList);
		System.out.println("myList: " + myList);
		
	}

}
