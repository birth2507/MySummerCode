//I have completed this Question by merge operation in mergeSort
import java.util.*;
class Que05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] a1 = new int[m];
		int count=0;
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i =0;i<m;i++)
		{
			a1[i] = sc.nextInt();
			if(a1[i]!=-1)
				l.add(a1[i]);
		}
		int n = sc.nextInt();
		int[] a2 = new int[n];
		for(int i =0;i<n;i++)
			a2[i] = sc.nextInt();
		int p = m - l.size(),k=0;
		for(int i =0;i<m;i++){
			if(i>=p){
				a1[i] = l.get(k);
			//	System.out.println(l.get(k)+" "+k);
				k++;
			}
			else{
				a1[i] = a2[i];
			}
		}
		
		int mid = m/2;
		Que05 q = new Que05();
		q.sort(a1,0,a1.length-1);
		for(int i =0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
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