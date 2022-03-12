class prmd4
{
		
		public static void main(String[]args){
			
		for(int i=1;i<=9;i++)
		{  
			for(int j=i;j<9;j++)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)
				{ 
					System.out.print(l+" ");
					
				}
				for(int k=i-1;k>=1;k--)
				{ 
					
						System.out.print(k+" ");
					
				}
				
				
				System.out.println();
		}
		
	}
}	   		
		/*					1
						  1 2 1
						1 2 3 2 1
					  1 2 3 4 3 2 1
					1 2 3 4 5 4 3 2 1
				  1 2 3 4 5 6 5 4 3 2 1
				1 2 3 4 5 6 7 6 5 4 3 2 1
			  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
			1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1	 */
