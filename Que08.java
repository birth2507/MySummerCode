import java.util.*;
public class Que08{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string having opening and closing brackets");
	String s = sc.nextLine();
	Stack stack = new Stack();
	char start = s.charAt(0), last = s.charAt(s.length()-1);
	int p = 0;
	//condition for checking opening and closing bracket in start and last
	if((start == '(' || start == '{'|| start == '[') && (last == ')' || last == '}'|| last == ']') ){
		p = 1;
	}
	for(int i=0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(c == '('){
			stack.push(')');
		}
		if(c == '{'){
			stack.push('}');
		}
		if(c == '['){
			stack.push(']');
		}
		if(c == ')'){
			if(c == (char)stack.peek()){
				stack.pop();
			}
			else
				break;
		}
		if(c == '}'){
			if(c == (char)stack.peek()){
				stack.pop();
			}
			else
				break;
		}
		if(c == ']'){
			if(c == (char)stack.peek()){
				stack.pop();
			}
			else
				break;
		}
		
	}
	if(stack.isEmpty() && p == 1){
		System.out.println("valid");
	}
	else
		System.out.println("Invalid");
	//System.out.println(s);
	}
}