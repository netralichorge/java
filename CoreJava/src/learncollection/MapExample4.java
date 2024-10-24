package learncollection;

import java.util.TreeMap;

public class MapExample4 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
		
		map.put(101, "A");
		map.put(102, "B");
		map.put(209, "C");
		map.put(211, "D");
		map.put(500, "E");
		map.put(501, "F");
		map.put(503, "G");
		
		System.out.println(map);
		
		System.out.println("-----------------------------");
		
		System.out.println(map.keySet());
		
		System.out.println(map.higherKey(102)); // higherKey display only key
		
		System.out.println(map.higherEntry(102)); // higherEntry display key and value both
		
		System.out.println("---------------------------------");
		
		System.out.println(map.lowerKey(500));
		
		System.out.println(map.lowerEntry(211));
		
		System.out.println("----------------------------------");
		
		System.out.println(map.ceilingKey(501));
		
		System.out.println(map.ceilingEntry(503));
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.floorKey(103));
		
		System.out.println(map.floorEntry(500));
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.headMap(211));
		
		System.out.println(map.headMap(211,true));
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.tailMap(209));
		
		System.out.println(map.tailMap(209,false));
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.subMap(102, 500)); // display in range
		
		System.out.println(map.subMap(102,true, 500,true));
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.firstEntry());
		System.out.println(map.firstKey());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
		System.out.println("----------------------------------");
		
		System.out.println(map.pollFirstEntry());  // remove first entry
		
		System.out.println(map.pollLastEntry());  // remove last entry
		
		
		
		

	}

}
