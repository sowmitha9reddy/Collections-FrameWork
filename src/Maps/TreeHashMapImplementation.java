package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashMapImplementation {

	public static void main(String[] args) {
	    	 TreeMap map=new TreeMap();
			map.put("virat", 18);
			map.put("rohit", 45);
			map.put("dhoni", 7);
			System.out.println(map);
			Set s=map.keySet();
			System.out.println(map.get("virat"));
			
			System.out.println(s);
			Collection t=map.values();
			Iterator itr1=t.iterator();	
			while(itr1.hasNext()) {
				System.out.print(itr1.next()+" ");
			}
			System.out.println();
			System.out.println(t);
			Iterator itr=s.iterator();	
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			System.out.println();
			for(Object st:s) {
				System.out.println(st);
			}
			
			Set set=map.entrySet();
			Iterator itr2=set.iterator();	
			while(itr2.hasNext()) {
				System.out.print(itr2.next()+" ");
			}
		      map.put("dhoni", 7); //keys cannot be duplicate
		      
		      System.out.println(map);
		      map.put("msdhoni", 7); // values can be duplicate 
		      System.out.println(map);
		  //    map.put(null,null); // only one null key can be stores
		      System.out.println(map);
		      map.put("siraj",null); // mutilpe values can be stored.
		      System.out.println(map);
		      map.put("ishanKishan",null);
		      System.out.println(map);
		      

	}

}
