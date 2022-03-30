
 // Static variable and Static Block


class StaticMethod{
	static byte a;
	static short b;
	static char c;
	static int d;
	static long e;
	static float f;
	static double g;
	static boolean h;
	
	static{
		System.out.println("This is Static Block of C1 class");
		a = 100;
		b = 200;
		c = 'A';
		d = 400;
		e = 50010101010l;
		f = 600.54658745f;
		g = 700.256458795463215487;
		h = true;
	}
	
	  static void print(){
		System.out.println(a);  // 100
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	}
	
	void print1(){
		
	}
}

class Static
{
	public static void main(String[] args)
	{
		System.out.println(StaticMethod.a);  // 100
		System.out.println(StaticMethod.b);  // 200
		System.out.println(StaticMethod.c);  
		System.out.println(StaticMethod.d);  
		System.out.println(StaticMethod.e); 
		System.out.println(StaticMethod.f);  
		System.out.println(StaticMethod.g);  
		System.out.println(StaticMethod.h);

		StaticMethod.a = 10;
		StaticMethod.b = 20;
		StaticMethod.c = 'B';
		StaticMethod.d = 420;
		StaticMethod.e = 5054876220l;
		StaticMethod.f = 245.987548745f;
		StaticMethod.g = 4870.2987456321159875487;
		StaticMethod.h = false;	
		System.out.println();
		System.out.println(StaticMethod.a);  //10
		System.out.println(StaticMethod.b);  // 20                              
		System.out.println(StaticMethod.c);   
		System.out.println(StaticMethod.d);  
		System.out.println(StaticMethod.e); 
		System.out.println(StaticMethod.f);  
		System.out.println(StaticMethod.g); 
		System.out.println(StaticMethod.h);	
		
		// Calling Static method
		
		System.out.println();
		StaticMethod.print();
		
		// Calling non static method
		
		StaticMethod.print1(); // Demo1.java:75: error: non-static method print() cannot be referenced from a static context
                               //    StaticMethod.print();
	}

}
