import java.util.*;
class stack{
	node head=null;
	class node{
		int data;
		node next;
		node(int data){
		this.data = data;
		this.next = null;
		}
	}
	public void push(int data){
		node m = new node(data);
		head = insert(m);
	}
	private node insert(node m){
		if(head==null)
		{
			head = m;
		}
		else{
			node h = head;
			while(h.next!=null){
				h = h.next;
			}
			h.next =  m;
		}
		return head;
	}
	public void print(){
		printelements(head);
	}
	private void printelements(node head){
		node m = head;
		while(m!=null){
			System.out.println(m.data);
			m = m.next;
		}
	}
	public void delete(){
		node p = head;
		while(p.next.next!=null){
			p = p.next;
		}
		p.next = null;
	}
}
public class Que02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		stack s = new stack();
		char c;
		//System.out.println("Enter the element in stack");
		do{
		System.out.println("Enter the element in stack");
			int data = sc.nextInt();
			s.push(data);
			System.out.println("If you want to insert more element press 'y' else 'n'");
			c = sc.next().charAt(0);
		}
		while(c=='y');
		System.out.println("Before poping an element");
		s.print();
		s.delete();
		System.out.println("After poping element");
		s.print();
	}
}