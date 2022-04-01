class Palindrome                           // Palindrome Number

{
	public static void main(String []args)
	{
		int num = 2334;
			int res = 0,rem = 0;
			int q = num;
			while (q!=0)
			{
			rem = q%10;
			 res = res*10 + rem;
			 q =q/10;
			}
			if (num == res)
				System.out.println("This is the Palindrome number");
			else
				System.out.println("This is not a Palindrome number");
	
	}
}
