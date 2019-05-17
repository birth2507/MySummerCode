import java.util.*;
class Que05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter a sorted array");
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
			//System.out.print(a[i] +" ");
		}
		Que05 q = new Que05();
		for(int i=0;i<a.length-1;i++){
			if(a[i] == a[i+1])
			{
				a = q.delete(a,i);
				i = i - 1;
			}
		}
		System.out.print("After removing duplicate values, Array is: ");		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] +" ");
		}

		
	}
	public int[] delete(int[] a,int loc){
		for(int i = loc;i<a.length-1;i++){
			a[i] = a[i + 1];
		}
		a = Arrays.copyOf(a,a.length-1);

		return a;
	}
}