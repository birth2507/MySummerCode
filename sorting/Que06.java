import java.util.*;
class Que06{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
		System.out.println("Enter the elements of array");
	int[] a = new int[n];
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();
	}
	for(int i =0;i<n;i++){
		a[i] = i+1;
	}
		System.out.println("sorted array is: ");
	for(int i =0;i<n;i++){
		System.out.print(a[i]+" ");
	}
	}
}