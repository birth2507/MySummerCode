import java.util.*;
class removeDuplicate{
	public ArrayList<String> remove(ArrayList<String> a){
		ArrayList<String> anew = new ArrayList<String>();
		for(String s : a){
			if(!anew.contains(s)){
				anew.add(s);
			}
		}
		return anew;
	}
}
class Que06{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("Enter number of String Object:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			a.add(s);
		}
		removeDuplicate r = new removeDuplicate();
		a = r.remove(a);
		System.out.println(a);
	}
}