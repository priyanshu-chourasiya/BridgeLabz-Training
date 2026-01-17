package ListInterface;

import java.util.*;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
		Map<String,Integer> map = new HashMap<>();
		
		for(String s : list) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s) + 1);
			}
			else {
				map.put(s,1);
			}
		}
		
		System.out.println(map);
	}

}
