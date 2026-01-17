package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70));
		
		int start = 0;
		int end = al.size() - 1;
		
		while(start < end) {
			
			int temp = al.get(start);
            al.set(start, al.get(end));
            al.set(end, temp);
            
           
            temp = ll.get(start);
            ll.set(start, ll.get(end));
            ll.set(end, temp);

			start += 1;
			end -= 1;
		}
		
		System.out.println(al);
		System.out.println(ll);
	}

}
