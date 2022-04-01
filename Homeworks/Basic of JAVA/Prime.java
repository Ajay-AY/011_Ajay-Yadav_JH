class Prime                          // Prime Number

{
	public static void main(String []args)
	{
		for(int j = 2;j<=100;j++)
		{
			int temp=0;
			for(int i=2;i<j;i++)
				{
					if(j%i==0)
					{
						temp++;
					}
				}
			
			if (temp==0)
				System.out.print(j+" ");
		
		}
	}
}
