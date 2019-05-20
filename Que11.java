import java.util.*;
class Que11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sizeof array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number or rotation:");
		int r = sc.nextInt();
		for(int k = 0;k<r;k++){									// -> r
			int t = a[0];
			for(int j =0 ;j<n-1;j++){							// -> n
				a[j] = a[j+1];
			}
			a = Arrays.copyOf(a,a.length-1);					// -> n
			a = Arrays.copyOf(a,a.length+1);					// ->  n	
			a[a.length-1] = t;
		}
		System.out.println("After " + n +" rotaion array is as follows:");
		for(int i =0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
	}
}
/*
	Time complexity = r * (n + n + n)
					= r * (3n)  (r is also a constant, so)
					= O(n)
*/