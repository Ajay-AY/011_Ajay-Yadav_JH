class Binary                           //two numbers binary
{
	public static void main(String[]args)
	{
		int a = 1010;
		int b = 100;
		int []arr = new int[6];
		int dig1=0;
		int dig2=0;
		int sum=0;
		int carry=0;
		int count = 0;
		
		for(int j = arr.length-1;j>=0;j--)
		{		sum=0;
				count++;
				dig1 = a%10;
				
				dig2 = b%10;
				
				a = a/10;
			
				b = b/10;
				
				sum = dig1 + dig2 + carry;
				
				//conditions for carryout 
				if(sum==0)
				{
					arr[j]=0;
					 carry = 0;
				}
				else if(sum==1)
				{
					arr[j]=1;
					carry= 0;
				}
				else if(sum==2)
				{
					arr[j]=0;
					carry=1;
				}
				else if(sum==3)
				{
					
					arr[j]=1;
					carry=1;
				}
		}
		
		// print array of binary numbers
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	
	}
}
