
 // Reference datatypes/Objects


class A{
	static int stA ;
	int a = 10;
	int b = 20;
	
	static void printA(){
		System.out.println("Static PrintA");
	}
	
	void printA1(){
		System.out.println("PrintB");
	}
		
	
}


class B{
	static int stB ;
	int a = 30;
	int b = 40;
	
	static void printB(){
		System.out.println("Static PrintB");
	}
	
	void printB1(){
		System.out.println("PrintB");
	}
		
	
}

class RefDatatype2
{
	
	public static void main(String[] args)
	{
	   A aa = new A();
	   B bb = new B();
	   aa.printA1();
	   A.printA();
	   bb.printB1();
	   B.printB();
		
	}

}
