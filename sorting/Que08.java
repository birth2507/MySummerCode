import java.util.*;
class Que08{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n =  sc.nextInt();
		System.out.println("Enter the elements of array ");
		int[] a = new int[n];
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		int j = n-1;
		for(int i =0;i<j;i++){
			if(a[i]==1){
				int t= a[i];
				a[i] = a[j];
				a[j] = t;
				j--;
				i--;
			}	
		}
		System.out.println("Sorted array is:");
		for(int i =0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}