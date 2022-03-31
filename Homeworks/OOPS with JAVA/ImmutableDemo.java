class Immutable{
	final int a;
	final int b;
	{
	
	}
	Immutable(int a, int b){
		this.a = a;
		this.b = b;
	}
	
}

class ImmutableDemo{
	public static void main(String[] args){
		Immutable i1 = new Immutable(10,20);
		//i1.a = 30;//Not allowed
		//i1.b = 40;//Not allowed
		i1 = null;//allowed
		
		final Immutable i2 = new Immutable(10,20);
		//i2 = null;//Not allowed
		//i2.a = 100; //Not allowed
		//i2.b = 200; //Not allowed
		
		
		
	}
}