//I have completed this program by selection sort
import java.util.*;
class Que03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
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
		for(int i =0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}