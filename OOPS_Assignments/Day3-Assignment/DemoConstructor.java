// HW of DAY4 
class MathOperate{
	int num1;
	int num2;
	static int  num3;
	static double res;
	
	
	//init block1........................
			{
				
				
				
				System.out.println("This is init block1 values num1 :"+num1+" num2 : "+num2);
				
			}
			
		MathOperate(){
		System.out.println("This is the Parameterless Constructor!!!!!");
		System.out.println();
	}	
	
	// Constructor Parameterized.......................
	MathOperate(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
		
		System.out.println("This is the Parameterized Constructor!!!!!");
		System.out.println();
	}
			// init block2........................
			{
				num1 = 456;
				num2 = 654;
			
				System.out.println("This is init block2 values num1 :"+num1+" num2 : "+num2);
                System.out.println();				
			}
			
			
	//  static block1.......................................... 
	static{
			num3 = 222;
		
		System.out.println("This is Static block!!!!!!!!!!!");
			System.out.println("Static num3 value is : "+num3);
			System.out.println();
	}
	//  instance Method.............................
	void add(){
		res = num1+num2;
		System.out.println("Addition is : "+res);
		sub();
	}
	
	void sub(){
		res = num1-num2;
		System.out.println("Subtraction is : "+res);
		mul();
	}
	
	void mul(){
		res = num1*num2;
		System.out.println("Multiple is : "+res);
		div();
	}
	
	void div(){
		res = num1/num2;
		System.out.println("Division is : "+res);
		mod();
	}
	
	void mod(){
		res = num1%num2;
		System.out.println("Modulus is : "+res);
		
	}
	
	// static block2....................................
	static{
		System.out.println("This is static2 block");
		System.out.println("Result value is : "+res);
		System.out.println();
		
	}
	
	// static method...............................
	static void display(){
		System.out.println("Result is : "+res);
		System.out.println();
		
	}
	
}

   // main class ............................
class DemoConstructor{
	public static void main(String []args){
		MathOperate m1 = new MathOperate(25,30);
		MathOperate m2 = new MathOperate(40,30);
		MathOperate m3 = new MathOperate();
		
		
		m3 = m1;
		// content copying binary representation from m1 to m3
		System.out.println(m3.num1);
		m3.add();
		
		
	}
}