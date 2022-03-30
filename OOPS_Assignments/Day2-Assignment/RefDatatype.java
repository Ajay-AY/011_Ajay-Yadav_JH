
 // Reference datatypes/Objects




class Printer{
	int x = 2;
	int y = 3;
	
	void print1(){
		System.out.println("Print1 "+(Demo3.num));
		
	}
}

class RefDatatype
{
	static int num = 25;
	int a =10;
	int b = 20;
	void print(){
		System.out.println("Print");
	}
	
	public static void main(String[] args)
	{
	    Demo3 d    =   new Demo3();
		Demo3 d2   =   new Demo3();
//  LHS Reference  =    RHS Object  
// (STACK Memory)       (HEAP Memory)
		System.out.println(d.a +" "+d.b);
		d.a = 20;
		d.b = 10;
		System.out.println(d.a +" "+d.b);
		d.print();
		System.out.println(d2.a +" "+d2.b);
		Printer p = new Printer();
		p.print1();
		System.out.println(p.x +" "+p.y);
		
	}

}
