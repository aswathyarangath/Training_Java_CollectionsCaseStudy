import java.util.*;
class UniqueCollection{
	LinkedHashSet getCollection(String []a){
		List<String> list=Arrays.asList(a);
		System.out.println("Before sorting :"+list);
		Collections.sort(list);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.addAll(list);
		
		
		return(lhs);
	}
}
	
class Collection3{
	public static void main(String args[]){
		String a[]=new String[]{"a","b","p","a","c","b","p","u","i","e","i"};
		UniqueCollection ob=new UniqueCollection();
		
		System.out.println(" Unique elements :"+ob.getCollection(a));
	}
} 