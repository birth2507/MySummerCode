// This ques, I am doing by insrtion sort method...so time Complexity will be O(n2)
import java.util.*;
class Que02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements");
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		Que02 q = new Que02();
		a=q.sort(a,n,k);
		System.out.println(k+" sorted array is as follows");
		for(int i =0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public int[] sort(int[] a,int n,int k){
		for(int i = 0;i<n-1;i= i+k){
			int count = 0;
			if((i+k)>n)
			{
				int w = i - a.length;
					k = k - w;
			}
			for(int j = i+1;count<k-1;j++){
				int v = a[j];
				int p = j;
				while(p>=i+1&&a[p-1]>v){
					a[p] = a[p-1];
					p--;
				}
				a[p] = v;
				count++;
			if(j+1>=n)
				break;
			}
		}
		return a;
	}
}