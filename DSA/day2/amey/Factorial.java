//3. Write a program to calculate a factorial in Java with recursion 
import java.util.Scanner;
class Factorial{
	
	static int fact(int n){
		if(n<=1)
			return 1;
		else
			return (n*fact(n-1));
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" : "+fact(n));
	}
}

/*
Enter Number : 7
Factorial of 7 : 5040
*/