/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Que02{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test Cases");
		int t= sc.nextInt();
		for(int i =0;i<t;i++){
			System.out.println("Enter two strings");
		    String s1 = sc.next();
		    String s2 = sc.next();
		    Que02 g = new Que02();
		    boolean b = g.checkAnagram(s1,s2);
		    if(b==true)
		        System.out.println("String ara anagram");
		    else
		        System.out.println("String ara not anagram");
		}
	}
	public boolean checkAnagram(String s1,String s2){
	    if(s1.length()!=s2.length())
	        return false;
	        boolean b = true;
	    HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
	    HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
	    for(int i =0;i<s1.length();i++){
	        char c1 = s1.charAt(i),c2 = s2.charAt(i);
	        if(h1.containsKey(c1)){
	            int p = h1.get(c1);
	            p++;
	            h1.put(c1,p);
	        }
	        else{
	            h1.put(c1,1);
	        }
	        if(h2.containsKey(c2)){
	            int p = h2.get(c2);
	            p++;
	            h2.put(c2,p);
	        }
	        else{
	            h2.put(c2,1);
	        }
	    }
	    for(Character x : h1.keySet()){
	        if(h2.containsKey(x)){
	            if(h1.get(x)!=h2.get(x))
	               {
	                   b=false;
	                   break;
	               }
	        }
	        else
	           {
	               b = false;
	               break;
	           }
	    }
	    return b;
    }
}