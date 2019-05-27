//I have completed this program by selection sort
import java.util.*;
class Que03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements");
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		int x= sc.nextInt();
		for(int i = 0;i<n;i++){
			int w = i;;
			int min = Math.abs(x-a[i]);
			for(int j = i+1;j<n;j++){
				int p = Math.abs(x-a[j]);
				if(min>p){
					w = j;
				}
			}
			int t = a[w];
			a[w] = a[i];
			a[i] = t;
		}
		System.out.println("Sortd array according to absolute difference with given value "+x);
		for(int i =0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
