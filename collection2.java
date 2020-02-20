import java.util.*;
class ListManager{
	List getArrayList(String []a){
		List<String> list=Arrays.asList(a);
		System.out.println("The list is  :" +list);
		Collections.sort(list);
		return(list);
	}
}

		
class Collection2{
	public static void main(String args[]){
		String a[]=new String[]{"a","p","b","f","i","c","d","e","f"};
	
		ListManager ob=new ListManager();
		
		System.out.println("The list after sorting is  :" +ob.getArrayList(a));


	}
}