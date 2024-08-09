package set.framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(40.5);
		set.add("sow");
		set.add('5');
		set.add(true);
		set.add(null);
		set.add(20);
		 System.out.println(set);
		 System.out.println(set.isEmpty());
		 System.out.println(set.contains(100));
		 System.out.println(set.size());
		set.remove(20);
		 System.out.println(set.getFirst());
		 System.out.println(set.getLast());
		 System.out.println(set);
		 for(Object t:set) {
			 System.out.println(t);
		 }
		 Iterator tr=set.iterator();
		 while(tr.hasNext()) {
			 System.out.print(tr.next()+" ");
		 }
		 

	}

}
