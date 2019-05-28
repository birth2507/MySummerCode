import java.util.*;
class Que07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array A");
		int n =  sc.nextInt();
		System.out.println("Enter the elements of array A");
		int[] a = new int[n];
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the elements of array B");
		int[] b = new int[n-1];
		for(int i =0;i<n-1;i++)
			b[i] = sc.nextInt();
		for(int i =0;i<n-1;i++){
			if(b[i]==1 && a[i]!=i+1){
				int t = a[i+1];
				a[i+1] = a[i];
				a[i] = t;
			}
		}
		boolean bool = true;
		for(int i =0 ;i<n;i++)
		{
			if(a[i]!=i+1)
			{
				bool = false;
				break;
			}
		}
			if(bool==true)
				System.out.println("Array can be sorted");
			else
				System.out.println("Array can not be sorted");
	}
}