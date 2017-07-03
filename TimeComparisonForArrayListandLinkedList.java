// Done By Krishna Kanth.

/**This program prints out the time taken to perform following operations.
 * 1) Time taken to insert thousand elements into an ArrayList
 * 2) Time taken to insert thousand elements into a LinkedList
 * 3) Time taken to insert an element in middle of the ArrayList
 * 4) Time taken to insert an element in middle of the LinkedList
 * 5) Time taken to search an element in ArrayList
 * 6) Time taken to search an element in LinkedList
 * 7)Time taken to delete an element from ArrayList
 * 8) Time taken to delete an element from LinkedList */



import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparisonForArrayListandLinkedList {
	
	public static void main(String[] args){
		
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll= new LinkedList<>();
		System.out.println("********** All time values displayed is in micro seconds *****");
		
		
		//time taken to insert thousand elements into arraylist.
		long StartTime = System.nanoTime()/1000;
		for(int i=0;i<1000;i++)
			al.add(i);
		long EndTime = System.nanoTime()/1000;
		long ExecTime= EndTime-StartTime;
		System.out.println("TIme taken to insert thousand elements into arrayList is: "+ ExecTime);
		
		
		// time taken to insert thousand elements into LinkedList
		long StartTime1 = System.nanoTime()/1000;
		for(int i=0;i<1000;i++)
			ll.add(i);
		long EndTime1 = System.nanoTime()/1000;
		long ExecTime1= EndTime1-StartTime1;
		System.out.println("TIme taken to insert thousand elements into LInkedList is: "+ ExecTime1);
		
		
		//time taken to insert element into middle of existing ArrayList.
		long StartTime2 = System.nanoTime()/1000;
		al.add(500, 101613);
		long EndTime2 = System.nanoTime()/1000;
		long ExecTime2= EndTime2-StartTime2;
		System.out.println("TIme taken to insert element into middle of Arraylist is: "+ ExecTime2);
		
		
		//time taken to insert an element into middle of existing LinkedList
		long StartTime3 = System.nanoTime()/1000;
		ll.add(500, 101613);
		long EndTime3 = System.nanoTime()/1000;
		long ExecTime3= EndTime3-StartTime3;
		System.out.println("TIme taken to insert element into middle of LinkedList is: "+ ExecTime3);
		
		
		//time taken to search an element in the ArrayList
		long StartTime4 = System.nanoTime()/1000;
		if(al.contains(101613)){
			long EndTime4 = System.nanoTime()/1000;
			long ExecTime4= EndTime4-StartTime4;
			System.out.println("TIme taken to search element from ArrayList is: "+ ExecTime4);			
		}else{
			long EndTim4=System.nanoTime()/1000;
			long ExecTim4= EndTim4-StartTime4;
			System.out.println("Element not found. time taken to search complete arraylist is "+ ExecTim4);
		}
		
		
		//time taken to search an element in the LinkedList
		long StartTime5 = System.nanoTime()/1000;
		if(ll.contains(101613)){
			long EndTime5 = System.nanoTime()/1000;
			long ExecTime5= EndTime5-StartTime5;
			System.out.println("TIme taken to search element from LinkedList is: "+ ExecTime5);			
		}else{
			long EndTim5=System.nanoTime()/1000;
			long ExecTim5= EndTim5-StartTime5;
			System.out.println("Element not found. time taken to search complete arraylist is "+ ExecTim5);
		}
		
		
		//time taken to remove an element from ArrayList
		long StartTime6 = System.nanoTime()/1000;
		int rmv =500;
		al.remove(rmv);
		long EndTime6 = System.nanoTime()/1000;
		long ExecTime6 = EndTime6-StartTime6;
		System.out.println("Time taken to delete an element from ArrayList is: "+ExecTime6);
		
		
		//time taken to remove an element from LinkedList
		long StartTime7 = System.nanoTime()/1000;
		int rmv1 =500;
		ll.remove(rmv1);
		long EndTime7 = System.nanoTime()/1000;
		long ExecTime7 = EndTime7-StartTime7;
		System.out.println("Time taken to delete an element from LinkedList is: "+ExecTime7);
	
		
		
	}

}
