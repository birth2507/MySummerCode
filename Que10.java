import java.util.*;
class Que10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the sorted Array");
		for(int i =0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++){
			
			if(a[i]+1!=a[i+1])
			{
				System.out.println("Missing elements between index "+(i-1)+" and "+(i)+" are from "+ (a[i]+1)+" to "+(a[i+1]-1));
			}
		}
		
	}
}
