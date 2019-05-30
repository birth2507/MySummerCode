/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Que01{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    StringBuilder sb = new StringBuilder(s);
		    String s1 = sb.reverse().toString();
		    if(s.equals(s1))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}