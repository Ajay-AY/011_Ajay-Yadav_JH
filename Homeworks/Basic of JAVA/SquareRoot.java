class SquareRoot                             // SquareRoot without Math.sqrt()
{
	public static void main(String []args)
	{
		int num = 16;
		double temp;
		double sq = num/2;
		do
		{
			temp = sq;
			sq=(temp+(num/sq))/2;
		}
		while((temp-sq)!=0);
		
		System.out.println("Square Root of number is : "+sq);
	}
}

