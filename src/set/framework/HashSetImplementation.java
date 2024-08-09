package set.framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
  public static void main(String[] args) {
	  HashSet set=new HashSet();
	  set.add(20);
	  set.add(30);
	  set.add(50);
	  set.add(50);
	  set.add(50);
	  set.add(50);
	  set.add(50);
	  set.add(50);
	  
	  set.add(50);
	  set.add(50);
	  System.out.println(set);
	  set.add(40.5);
	  System.out.println(set);
	  set.add("sowmitha");
	  System.out.println(set);
	  set.add(true);
	  System.out.println(set);
	  System.out.println(set.isEmpty());
	  System.out.println(set.size());
	  set.remove(20);
	  set.add(null); // null will stored.
	  
	  System.out.println(set);
//	  for(int i=0;i<set.size();i++) {
//		  System.out.println(s);           //using traditional we cannot access the hashset elements.
//	  }
	  for(Object s:set) {
		  System.out.println(s);
	  }
	 Iterator itr= set.iterator();
	 while(itr.hasNext()) {
		 System.out.print(itr.next()+" ");
	 }
	
  }
}
