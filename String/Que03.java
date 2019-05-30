/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Que03{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++){
		    String s = sc.next();
		    HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		    for(int i =0;i<s.length();i++){
	            char c1 = s.charAt(i);
	           if(h.containsKey(c1)){
	             int p = h.get(c1);
	                p++;
	                h.put(c1,p);
	            }
	            else{
	                h.put(c1,1);
	            }
		   }
		   int flag =0;
		   boolean b = true;
		   for(Character c : h.keySet()){
		       int p = h.get(c);
		       if(p%2!=0 && flag == 0){
		           flag = 1;
		       }
		       else if(p%2!=0 && flag == 1){
		           b = false;
		           break;
		       }
		   }
		   if(b==true)
		    System.out.println("Yes");
		   else
		    System.out.println("No");
		}
		
	}
}