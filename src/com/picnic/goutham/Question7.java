package com.picnic.goutham;

import java.util.HashMap;
import java.util.Map.Entry;
public class Question7 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Key 1", "TestVal1");
		map.put("Key 2", "TestVal2");
		map.put("Key 3", "TestVal1");
		map.put("Key 4", "TestVal2");
		map.put("Key 5", "TestVal2");
		map.put("Key 6", "TestVal3");
		
		HashMap<String,String> tempmap = new HashMap<String,String>();
		for (Entry<String, String> me : map.entrySet()) {
          if(!tempmap.containsValue(me.getValue())) {
        	  tempmap.put(me.getKey().toString(), me.getValue().toString());
          }else {
        	  tempmap.put(me.getKey().toString(), "");
          }
        }
        
        map = tempmap;
        for (Entry<String, String> me : map.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        
        
        
	}

}

/* Output
Key: Key 1 & Value: TestVal1
Key: Key 2 & Value: TestVal2
Key: Key 3 & Value: 
Key: Key 4 & Value: 
Key: Key 5 & Value: 
Key: Key 6 & Value: TestVal3
*/
