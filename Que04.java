import java.util.*;
class Que04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		Que04 q = new Que04();
		boolean b = q.checkPrime(n);
		if(b==true){
		System.out.println("Number is Prime");
		}
		else
		System.out.println("Number is not prime");
	}
	public boolean checkPrime(int n){
		boolean b = false;
		if(n==2 || n == 3 || n==5)
			return true;
		if(n%2!=0){
			for(int i=3;i<=n/2;i=i+2){
				if(n%i==0){
					break;
				}
				else{
					b =true;
				}
			}
		}
		return b;
	}
}