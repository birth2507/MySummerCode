/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Que08 {
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	Stack stack = new Stack();
	    char start = s.charAt(0), last = s.charAt(s.length()-1);
	    int p = 0;
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
		        if(!stack.isEmpty()){
			        if(c == (char)stack.peek()){
				        stack.pop();
			        }
			        else
			            break;
		        }
		  }
    		if(c == '}'){
    		    if(!stack.isEmpty()){
			        if(c == (char)stack.peek()){
				        stack.pop();
			        }
			        else
			            break;
    		    }
		    }
		    if(c == ']'){
		        if(!stack.isEmpty()){
			        if(c == (char)stack.peek()){
				        stack.pop();
			        }
			        else
			            break;
		        }
		    }
	//	System.out.println(stack);
	    }
	    if(stack.isEmpty() && p == 1){
		    System.out.println("balanced");
	    }
	    else
		    System.out.println("not balanced");
	    }
}
