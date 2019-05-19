import java.util.*;
class Que05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		 int max = Integer.MAX_VALUE;
		System.out.println("Enter a sorted array");
		for(int i=0;i<n;i++){                                    // -> n
			a[i]= sc.nextInt();
			//System.out.print(a[i] +" ");
		}
		Que05 q = new Que05();
		int count=0;
		for(int i=0;i<a.length-1;i++){                           // -> n
			if(a[i]==a[i+1])
			{
				a[i] = max;
				count++;
			}
		}
		Arrays.sort(a);                                         // -> (nlogn)       
		a = Arrays.copyOf(a,a.length-count);                    // -> (n)
		for(int i=0;i<a.length;i++){                            // ->  (n)
			System.out.println(a[i]);
		}
	}
}
/*
		Time Complexity = n + n + nlogn + n + n
				        = O(nlogn)
*/
