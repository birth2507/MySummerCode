import java.util.*;

class LinkedList{
	LLNode head;
	class LLNode{
	int data;
	LLNode next;
	LLNode(int data){
		this.data = data;
		this.next = null;
	}
	}
	void insert(LinkedList l, int data) 
    {  
        LLNode n = new LLNode(data); 
        n.next = null; 
        if (l.head == null) { 
            l.head = n; 
        } 
        else { 
            LLNode last = l.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = n; 
        } 
    }
		void print(LinkedList l){
			LLNode n = l.head;
			System.out.println();
			while(n!= null){
				System.out.println(n.data+" ");
				n = n.next;
			}
		}
		
		void makeloop(LinkedList l){
			LLNode last = l.head;
			while(last.next!=null){
				last = last.next;
			}
			last.next = l.head;
		}
		void length(LinkedList l){
			LLNode p = l.head,q = l.head;
			int count = 0;
			while(q.next!=p){
				count++;
				q = q.next;
			}
			count++;
			System.out.println("Length = "+count);
		}
}
public class Que09{
	public static void main(String [] args){
				Scanner sc = new Scanner(System.in);
				LinkedList l = new LinkedList();
				char c;
				do{
					System.out.println("insert value");
					int data = sc.nextInt();
					l.insert(l,data);
					System.out.println("Enter 'y' if you want to insert more element else 'n'");
					c = sc.next().charAt(0);
				}
				while(c=='y');
				l.makeloop(l);
				System.out.println("Linked List is in Loop now and length of the LL in as follows");
				l.length(l);
	}
}