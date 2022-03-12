import java.util.Scanner;
class A212{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First No.");
		int n1 = sc.nextInt();
		System.out.print("Enter Second No.");
		int n2 = sc.nextInt();
		System.out.print("Enter Third No.");
		int n3 = sc.nextInt();
		System.out.print("Avg = "+((n1+n2+n3)/3));
		
	}
}