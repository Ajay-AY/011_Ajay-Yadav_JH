class Calculator{
	static double powerInt(double num1,double num2){
		return (Math.pow(num2,num1));
	}
}


class Practise2{
	public static void main(String[]args){
		System.out.println("Ans is : "+(Calculator.powerInt(3,4)));
	}
}