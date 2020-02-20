import java.util.*;
class  MapManager{
	Set getKeys(HashMap<Integer,String> map){
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()){
			Integer key=itr.next();
			
			Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(key));
		}
		
	}
}
			
		
class Collection4{
public static void main(String args[]){
	HashMap<Integer,String> map=new HashMap<>();
	map.put(1,"A");
	map.put(5,"B");
	map.put(3,"C");
	map.put(4,"D");
	System.out.println("Iterating over keys......................");
	MapManager ob=new MapManager();
	
			
			System.out.println(ob.getKeys(map));
		
	
	}
}
	
