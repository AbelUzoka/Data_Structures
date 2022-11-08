import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		
		ArrayList<String> javaList = new ArrayList<>();
		MyArrayList<String> myList = new MyArrayList<>();
		
		/*
		myList.add("Alice");
		myList.add("Bob");
		myList.add("Carol");		
		*/
		
		/*
		System.out.println(myList);
		MyArrayList<String>.MyIterator myIter = myList.iterator();
		while(myIter.hasNext()) {
			System.out.println(myIter.next());
		}
		
		Iterator<String> myIter2 = myList.iterator();
		while(myIter2.hasNext()) {
			System.out.println(myIter2.next());
		}
		*/
		/*
		Iterator<String> myIter3 = myList.iterator();
		System.out.println(myList);
		System.out.println(myIter3.next());
		myIter3.remove();
		System.out.println(myList);
		*/
		
		javaList.add("Alice");
		javaList.add("Bob");
		javaList.add("Carol");		
		
		
		
		Iterator<String> javaIter = javaList.iterator();
		System.out.println(javaList);
		while(javaIter.hasNext()) {
			System.out.println(javaIter.next());
		}
		
		/*
		Iterator<String> javaIter2 = javaList.iterator();
		System.out.println(javaList);
		while(javaIter2.hasNext()) {
			if(javaIter2.next().equals("Bob")) {
				javaIter2.remove();
				break;
			}
		}
		
		Iterator<String> javaIter3 = javaList.iterator();
		System.out.println(javaList);
		javaIter3.next();
		javaIter3.remove();
		System.out.println(javaList);
		*/


		
		
		
		
	}

}
