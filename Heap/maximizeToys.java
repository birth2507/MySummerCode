import java.util.*;
import java.lang.*;
import java.io.*;
class Heap{
    public int[] a;
    public int count,size;
    Heap(int n){
        this.size = n;
        a = new int[n];
        this.count=0;
    }
    public int leftchild(int i){
        if(this.count==0)
        return -1;
        else
            return 2*i+1;
    }
    public int rightchild(int i){
        if(this.count==0)
        return -1;
        else
            return 2*i+2;
    }
    public int parent(int i){
        if(this.count==0)
        return -1;
        else
            return i-1/2;
    }
    public void insert(int data){
            if(this.count==this.size){
                int[] a2 = new int[this.size];
              for(int i =0;i<this.size;i++)
                a2[i] = this.a[i];
            this.a = new int[this.size+1];
            for(int i =0;i<this.size;i++){
                this.a[i] = a2[i];
               // System.out.println(this.a[i]);
            }
            this.size++;
            a2 = null;
        }
            this.count++;
            int i = this.count-1;
            while(i>0 && this.a[(i-1)/2]<data){
                this.a[i] = this.a[(i-1)/2];
                i = (i-1)/2;
            }
            this.a[i] = data;
    }
    public void delete(){
        deleteElement(this.count);
    }
    public void deleteElement(int c){
        if(c==0)
            return ;
        int i = c-1;
        int t = this.a[c-1];
        this.a[c-1] = this.a[0];
        this.a[0] = t;
        int j =0;
        while(j<=c-1 && j*2+2<c-1 && (this.a[2*j+1]>this.a[j] || this.a[2*j+2]>this.a[j])){
            //int max = 0;
            if(this.a[2*j+1] > this.a[2*j+2])
            {
                int p = this.a[j];
                this.a[j]=this.a[2*j+1];
                this.a[2*j+1] = p;
                j = 2*j+1;
            }
            else
            {
                int p = this.a[j];
                this.a[j]=this.a[2*j+2];
                this.a[2*j+2] = p;
                j = j*2+2;
            }
            
        }
        deleteElement(c-1);
    }
    public void print(){
        for(int i =0;i<this.size;i++)
            System.out.print(this.a[i]+" ");
        System.out.println();
    }
}
class maximizeToys{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++){
		int n = sc.nextInt(), k = sc.nextInt();
		Heap h = new Heap(n);
		for(int i =0;i<n;i++)
		   h.insert(sc.nextInt());
	//	h.print();
		 h.delete();
		 if(h.a[0] > h.a[1])
		  {
		      int p = h.a[0];
		      h.a[0] = h.a[1];
		      h.a[1] = p;
		  }
		  int cost =0,count=0;
		  for(int i =0;i<n;i++){
		      cost = cost + h.a[i];
		      if(cost<=k)
		        count++;
		  }
		 System.out.println(count);
		}
	}
}
