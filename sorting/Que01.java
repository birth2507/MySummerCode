import java.util.*;
class Que01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element in a array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements in a array");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Que01 q = new Que01();
		q.sort(a,0,a.length-1);
		int j = a.length-1;
		System.out.println("sorted element of array i.e. first lowest then frist hishest and so on");
			for(int i =0;i<n/2;i++){
				System.out.print(a[i]+" "+a[j]+" ");
				j--;
			}
	}
	public void sort(int[] a,int l,int r){
		if(r>l){
			int mid = (l+r)/2;
			sort(a,l,mid);
			sort(a,mid+1,r);
			mergeArray(a,l,mid,r);
		}
	}
	public void mergeArray(int[] a,int l,int m,int r){
		int n1 = m-l+1,n2 = r-m;
		int[] sub1 = new int[n1];
		int[] sub2 = new int[n2];
		for(int i =0;i<n1;i++){
			sub1[i] = a[l+i];
		}
		for(int i =0;i<n2;i++){
			sub2[i] = a[m+i+1];
		}
		int i =0,j=0,k=l;
		while(i<n1&&j<n2){
			if(sub1[i]<=sub2[j]){
				a[k] = sub1[i];
				i++;
			}
			else
			{
				a[k] = sub2[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k] = sub1[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k] = sub2[j];
			j++;
			k++;
		}
	}
}