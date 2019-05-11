package com.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWorkMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Shiva", 222);
		map.put("Sandish", 333);
		map.put("Asel", 555);
		map.put("Sumair", 666);

		Iterator otr = map.entrySet().iterator();
		while (otr.hasNext()) {
			Map.Entry me = (Map.Entry) otr.next();
			System.out.println(me.getKey());
		}
	}
}

//Teacher Example 
/*
 * Instructions from your teacher:
Add the following values to the Map
map.put("Shiva",222);
map.put("Sandish",333);
map.put("Asel",555);
map.put("Sumair",666);

Print all keys using iterator
 

 * class Main {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
         map.put("Shiva",222);
         map.put("Sandish",333);
         map.put("Asel",555);
         map.put("Sumair",666);
         int value = map.get("Asel");
         
         Set<String> keys=map.keySet();
         Iterator<String> it=keys.iterator();
         while(it.hasNext()){
           System.out.println(it.next());
         }
  }
}
*/