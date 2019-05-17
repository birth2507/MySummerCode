import java.util.*;
class Que10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the sorted Array");
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
			if(i>=1){
				if(a[i-1]+1!=a[i])
				{
						System.out.print("Missing elements between index "+(i-1)+" and "+(i)+" are: ");
					for(int j = a[i-1];j<a[i]-1;j++){
						System.out.print((j+1)+" ");
					}
					System.out.println();
				}
			}
		}
		
	}
}