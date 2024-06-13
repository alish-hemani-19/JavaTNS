package javafullstackcourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		
		List list1 = new ArrayList(); 
		
		System.out.println("Size:"+list1.size());
		System.out.println("Is list empty? "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5,"Hii");
		list1.add(10);
		System.out.println("List is: "+list1);
		
		System.out.println("Is list contains 15: "+list1.contains(15) );
		list1.remove(false);
				
		System.out.println("List is: "+list1);
		
		System.out.println("Element at 5th location is:"+list1.get(5) );
		System.out.println("Element removed: "+list1.remove(list1.lastIndexOf(10))); 
		System.out.println("Element removed: "+list1.remove(list1.indexOf(10))); 
		
		System.out.println("List is: "+list1);		
		
		list1.clear();
		System.out.println("List is: "+list1);
		
		
	}
	
	

}
