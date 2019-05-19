import java.util.*;
class LinkedList{
	node head = null;
	class node{
		String data;
		node next;
		node(String data){
			this.data = data;
			this.next = null;
		}
	}	
	public void insert(String data){
		node n = new node(data);
		head = insertValue(n);
	}
	private node insertValue(node n){
		if(head == null){
			head = n;
		}
		else{
			node p = head;
			while(p.next!=null){
				p = p.next;
				//System.out.println(p.data);
			}
			p.next = n;
		}
	return head;
	}
	public void print(){
		node p = head;
		int count =0;
		//System.out.println(head.data);
		while(p!=null){
			System.out.println(p.data);
			p = p.next;
			count++;
		}
	}
	public void removeDuplicate(){
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		node p = head,q = p;
		while(p!=null){									// ->  n
			if(h.containsKey(p.data)){					        // ->  1
				q.next = p.next;						// Time Complexity of removeDuplicate method is O(n);	
				p = q.next;
			}
			else
			{	h.put(p.data,1);                                                // -> 1
				q = p;        
				p = p.next;
			}
		}
	}
}
class Que06{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		System.out.println("Enter String object values:");
		char c;
		do{
			String data = sc.next();
			l.insert(data);
			System.out.println("Enter 'y' if you want to insert more string Object else 'n'");
			c = sc.next().charAt(0);
		}
		while(c=='y');
		System.out.println("Before removing duplicate values:");
		l.print();
		l.removeDuplicate();
		System.out.println("After removing duplicate values:");
		l.print();
	}
}
