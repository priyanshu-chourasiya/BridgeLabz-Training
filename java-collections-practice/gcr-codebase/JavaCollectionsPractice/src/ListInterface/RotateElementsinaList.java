package ListInterface;

import java.util.*;

public class RotateElementsinaList {

	public static void reverse(ArrayList<Integer> ll,int start,int end) {
		while(start < end) {
			int temp = ll.get(start);
            ll.set(start, ll.get(end));
            ll.set(end, temp);
            start++;
            end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		int k = 2;
		int n = al.size();
		reverse(al,0,n-1);
		reverse(al,0,k);
		reverse(al,n,k-1);
		System.out.println(al);
		
	}

}
