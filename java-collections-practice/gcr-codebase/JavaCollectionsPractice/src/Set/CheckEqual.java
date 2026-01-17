package Set;

import java.util.*;

public class CheckEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));
		
		System.out.println(s1.equals(s2));
	}

}
