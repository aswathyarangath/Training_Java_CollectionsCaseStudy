import java.util.*;


class Collection1{
	public static void main(String args[]){
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(3,4,5,6));
		System.out.println("List1 :"+a);
		System.out.println("List2 :"+b);
		List<Integer> c= new ArrayList<Integer>(b);
		c.retainAll(a);
		System.out.println("List2:"+c);
		
	}
}