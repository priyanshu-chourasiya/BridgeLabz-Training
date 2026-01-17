package ListInterface;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
		
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> seen = new ArrayList<>();
		
		for(Integer i : list) {
			if(!seen.contains(i)) {
				seen.add(i);
				result.add(i);
			}
		}
		
		System.out.println(result);
	}
}
