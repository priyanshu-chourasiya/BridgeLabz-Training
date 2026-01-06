package LinerSearch;

public class WordinaListofSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Hey how are you I am priyanshu";
		
		String[] str = sentence.split(" ");
		
		String k = "priyanshu";
		
		for(String e : str) {
			if(e.equals(k)) {
				System.out.println("YES");
			}
		}
	}

}
