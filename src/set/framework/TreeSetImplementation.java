package set.framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {

	public static void main(String[] args) {
		
		TreeSet s=new TreeSet();
		  
		   s.add(30);
		   s.add(50);
		   s.add(60);
		   s.add(20);
		   s.add(95);
		   s.add(130);
		   s.add(100);
		   s.add(100);
		   s.add(20);
		   s.add(20);
//		   s.add(40.5); //does not store homogenous data
//		   s.add("sow");
//		   s.add(true);
//		   s.add(null); // does not store null values
		   s.add(30); //does not store duplicates.
		 
		   
		   System.out.println( s);
		   System.out.println(  s.contains(40));
		   System.out.println("prints the first value");
		   System.out.println(s.getFirst());
		   System.out.println("print the last value of set");
		   System.out.println(s.getLast());
		   System.out.println("checks 100 is present or not if present it will return the value");
		   System.out.println(s.ceiling(100)); //checks value or not is value is present it will return the value
		   System.out.println("check 105 is present or not not present means print the next higher value than the given value");
		   System.out.println(s.ceiling(105)); // else higher than the given value
		   System.out.println("prints the higher value than the 30");
		   System.out.println(s.higher(30));
		   System.out.println("checks 100 is present or not if present it will return the value");
		   System.out.println(s.floor(100));
		   System.out.println("check 105 is present or not not present means print the next lower value than the given value");
		   System.out.println(s.floor(105)); // else higher than the given value
		   System.out.println("prints the lower value than the 30");
		   System.out.println(s.lower(30));
		   System.out.println("headset");
		  System.out.println( s.headSet(50));
		  System.out.println("tailset");
		  System.out.println(s.tailSet(50));
		  System.out.println("size of the set:"+s.size());
		  System.out.println(s.subSet(20, 90));
		  System.out.println("check set is empty or not"+s.isEmpty());
		  s.remove(30);
		  System.out.println(s);
//		  for(int i=0;i<s.size();i++) {
//			  System.out.println(s.get(i);        // we are not able access the elements using traditional for loop.
//		  }
		  
		  for(Object t:s) {
			  System.out.println(t);
		  }
		  Iterator itr=s.iterator();
		  while(itr.hasNext()) {
			  System.out.print(itr.next() + " ");
		  }
		  System.out.println();
		  //listiterator is not possible because it only possible for lists because of this reverse order is also not possible 
		  // if we need it we need to use DescendingItreator
		  
		    Iterator it=s.descendingIterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		  
	  
	       
	      
	}

}
