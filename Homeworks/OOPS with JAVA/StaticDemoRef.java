	
	
	// class Math1......................
	class Math1{
	double a;
	double b;
	
	static double res;
	
	
	// Math1 constructor .........................
	 Math1(int a,int b){
	 
		 this.a = a;
		 this.b = b;
		 System.out.println("This is Constructor");
	    
	 }
	 
	 // Math1 constructor .........................
	 Math1(double a,double b){
		 this.a = a;
		 this.b = b;
		 System.out.println("This is Constructor");
	}
	
	
	
	// static method ............................
	 static void ref1(Math1 mth1,Math1 mth2){
		 
	     mth1.a = 1000;
		 mth1.b = 2000;
		mth2.a = 100000;
		 mth2.b = 200000;
		 
	 }
	 
	
	 // instance method ...................
	 void ref(Math1 mth1){
		 this.a = 100000;
		 this.b = 200000;
	     mth1.a = 1000;
		 mth1.b = 2000;
			 
		 
	 }
	 
	 
	 
	 
	 void add(){
		 this.res = a+b;
		 System.out.println("Add : "+res);
	 }
	 
	
	
	}
	
	
	// Main function...............................
	class StaticDemoRef{
	
	public static void main(String...args){
		Math1 mt1 = new Math1(10.0,20.0);
		Math1 mt2 = new Math1(100,200);

		System.out.println(mt1.a +"   "+mt1.b);
		System.out.println(mt2.a +"   "+mt2.b);
		
		mt1.ref(mt2);
		
		System.out.println(mt1.a +"   "+mt1.b);
		System.out.println(mt2.a +"   "+mt2.b);
		
		Math1.ref1(mt1,mt2);
		System.out.println(mt1.a +"   "+mt1.b);
		System.out.println(mt2.a +"   "+mt2.b);
	
	}
	
	}