class Box{
	double width,height,depth;
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	double volume(){
		
	return (this.width*this.height*this.depth);
	}
	
	
}


class Practise1{

	public static void main(String[]args){
	Box b = new Box(10,20,15);
	System.out.println("Volume of Box is : "+b.volume());
	
	}
}
