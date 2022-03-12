class prmd5
{
		
		public static void main(String[]args){
			
		for(int i=9;i>=1;i--)
		{  
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int l=i;l<=9;l++)
				{ 
					System.out.print(l+" ");
					
				}
				for(int k=8;k>=i;k--)
				{ 
					
						System.out.print(k+" ");
					
				}
				
				
				System.out.println();
		}
		
	}
}	   		
	/*					9
					  8 9 8
					7 8 9 8 7
				  6 7 8 9 8 7 6
				5 6 7 8 9 8 7 6 5
			  4 5 6 7 8 9 8 7 6 5 4
			3 4 5 6 7 8 9 8 7 6 5 4 3
		  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
		1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1       */
													
