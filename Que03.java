/* unit test case :- amankumarsingh*/
import java.util.*;
class Que03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			if(h.containsKey(c)){
				Integer p = h.get(c);
				p = p+1;
				h.put(c,p);
			}
			else{
				h.put(c,1);
			}
		}
		System.out.println(h);
	}
}
