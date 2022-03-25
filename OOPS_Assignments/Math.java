
// WAP to access/invoke Static variable and static method

class Mathoperation{
	static int num1 = 20;
	static int num2 = 10;
	
}

class Math{
	
	static int num1 = 44;
	static int num2 = 22;
	static void add(int a, int b){
		System.out.println(" Addition : "+(a+b));
	}
	static void sub(int a, int b){
		System.out.println(" Substraction : "+(a-b));
	}
	static void mul(int a, int b){
		System.out.println(" Multiplication : "+(a*b));
	}
	static void div(int a, int b){
		System.out.println(" Division : "+(a/b));
	}
	static void mod(int a, int b){
		System.out.println(" Modulus : "+(a%b));
	}
	
	public static void main(String []args){
		System.out.println(" Add : "+(num1+num2));
		add(10,30);
		sub(30,20);
		mul(20,40);
		div(50,20);
		mod(20,11);
		System.out.println(" Addition of other class : "+(Mathoperation.num1+Mathoperation.num2));
		
	}
}

