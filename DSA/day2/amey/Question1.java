//1. Write a program to print a series of numbers with recursive Java methods 
import java.util.Scanner;
class Question1{
	static void numbers(int n){
		if(n>=1)
		{
			numbers(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		System.out.print("Series of Numbers : ");
		numbers(num);
	}
}