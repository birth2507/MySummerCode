//In this Question, i have used Arrays.sort() method
import java.util.*;
class Que04{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for(int i =1;i<n;i++){
			int t = a[i-1];
			a[i-1] = a[i];
			a[i] = t;
			i++;
		}
		for(int i =0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}