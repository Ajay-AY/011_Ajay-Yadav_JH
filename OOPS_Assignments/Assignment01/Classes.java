class MathOperation{
	static int a = 50;
	static int b = 40;
	static void add1(){
		System.out.println("Add : "+(a+b));
	}
	
}

public class Classes{
	static void add(){
		System.out.println("Add : "+(a+b));
	}
	
	static int a = 10;
	static int b = 5;
	public static void main(String []args){
		MathOperation.add1();
		add();
	}
}
