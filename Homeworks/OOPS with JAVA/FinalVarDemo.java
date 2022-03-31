class FinalVar{
	// static final//2 options : a) Same line b) in static block
	final static int i;
	static{
		i = 10;
	}
	
	final static boolean b = false;
	
	//instance var 
	//3 options : a) Same line b) init block 3) constructor
	final int x;
	{
		//x = 10;
	}
	FinalVar(int x){
		this.x = x;
	}
}

class FinalVarDemo{
	
	public static void main(String... args){
		System.out.println(FinalVar.i);
		System.out.println(FinalVar.b);
		
		FinalVar fv = new FinalVar(10);
	}
}

// local, static, instance