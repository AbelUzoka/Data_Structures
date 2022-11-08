
public class MyArrayList <E> {
	private E[] data;
	private int size;
	private int arraySize;
	
	public MyArrayList() {
		size = 0;
		arraySize = 3;
		data = (E[])new Object[arraySize];
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}	
	public E get(int index) {
		// Assume we have correct index. (for range)
		return data[index];
	}
	
	public E remove(int index) {
		E returnData = data[index];
		for(int i=index+1;i<size;i++) {
			data[i-1] = data[i];
		}
		size--;
		return returnData;
	}
	
	public boolean add(E element) {
		
			//return add(size, element);
		
		// if we need expand the current array
		
		 	if (size == arraySize) {
			arraySize = arraySize * 2;
			E[] newData = (E[]) new Object[arraySize];
			
			for (int i = 0; i < size; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		 	
		data[size] = element;
		size++;
		return true;
		
	}
	
	public boolean add(int index, E element) {
		if(index<0)
			return false;
		if(index>size)
			return false;
			
		// if we need expand the current array
		if(size == arraySize)
		{
			arraySize = arraySize * 2;
			E[] newData = (E[])new Object[arraySize];
			for(int i =0; i<size;i++) {
				newData[i] = data[i];
			}
			data = newData;			
		}
		// shift current elements if needed
		for(int i=size-1 ; i>=index;i--) {
			data[i+1] = data[i];
		}
		data[index] = element;
		size++;
		return true;
	}
	
	public String toString() {
		String str = "[";
		for(int i=0;i<size-1;i++) {
			str = str + data[i] + ", ";
		}
		str = str + data[size-1];
		return str+"]";
	}
	
	public MyIterator iterator(){
		return new MyIterator();
	}
	
	public class MyIterator implements java.util.Iterator<E>{
		private int nextIndex;
		private int lastReturned;
		MyIterator(){
			nextIndex = 0;
			lastReturned = -1;
		}
		
		public boolean hasNext() {
			return nextIndex < size;
		}
		public E next() {
			lastReturned = nextIndex;
			return data[nextIndex++];
		}
		public void remove() {
			if(lastReturned != -1) {
				// Call outerClass's remove with the index lastReturned;
				MyArrayList.this.remove(lastReturned);
				nextIndex --;
				lastReturned = -1;				
			}
			
		}
		
	}
}
