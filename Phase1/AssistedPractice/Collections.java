import java.util.*;
public class Collections {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Hyderabad");//
	      city.add("Vizag");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(2); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      List<String> names=new java.util.LinkedList<String>();
	      names.add("Vedanth");  
	      names.add("Ashfak");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(456);  
	       set.add(123);  
	       set.add(789);
	       set.add(741);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(3);  
	       set2.add(2);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 
	      }  

}
