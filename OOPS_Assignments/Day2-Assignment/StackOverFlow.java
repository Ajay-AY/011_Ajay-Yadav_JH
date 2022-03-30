
 // #Stack Overflow Exception




class Demo2
{
	
	
	static void m01(){
		System.out.println("m01");
		
	}
	static void m02(){
		System.out.println("m02");
		
	}
	
	
	
	static void m1(){
		System.out.println("m1");
		m2();
	}
	static void m2(){
		System.out.println("m2");
		m1();
	}
	
	
	public static void main(String[] args)
	{
	      m01();   // m01
		  m02();   // m02
		  m1();   // Exception in thread "main" java.lang.StackOverflowError
		  m2(); 
	}

}
