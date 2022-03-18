		import java.util.Scanner;
		class Array
{	
				static int a[][] = new int [3][3];
				static int b[][] = new int [3][3];
				int c[][] = new int [3][3];
				static int t[][] = new int [3][3];
			   
				Array()
				{
					System.out.println("Please provide Two Matrix datas of 3 X 3 Matrix ......");
				}
			
		   void input()
		   {
			   System.out.println("Enter data for First Matrix :");
			   for(int i = 0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						Scanner sc = new Scanner(System.in);
						 
						System.out.print("Enter element a["+i+"] ["+j+"] : ");
						a[i][j]=sc.nextInt();
					}
				
				}
				
				System.out.println("Enter data for Second Matrix :");
				 for(int i = 0;i<b.length;i++)
				{
					for(int j=0;j<b.length;j++)
					{
						Scanner sc = new Scanner(System.in);
						 
						System.out.print("Enter element b["+i+"] ["+j+"] : ");
						b[i][j]=sc.nextInt();
					}
					System.out.println();
				}
				
				
		   }
		   
		   public static void display(int[][]a)
				   {
					  
					  for(int i = 0;i<a.length;i++)
						{	
							
							for(int j=0;j<a.length;j++)
							{
								
								System.out.print(a[i][j]+"  ");
							}
							System.out.println();
						} 
						
				   }
		   
		   
		   void addition()
				   {
					   System.out.println("Addition of Matrix obtained is : ");
					  for(int i = 0;i<c.length;i++)
						{	
							
							for(int j=0;j<c.length;j++)
							{
								c[i][j] = a[i][j]+b[i][j];
								System.out.print(c[i][j]+" ");
							}
							System.out.println();
						} 
						
				   }
		   
		  void subtract()
				   {  System.out.println("Subtraction of Matrix obtained is : ");
					  for(int i = 0;i<c.length;i++)
						{
							for(int j=0;j<c.length;j++)
							{
								c[i][j] = a[i][j]-b[i][j];
								System.out.print(c[i][j]+" ");
							}
							System.out.println();
						} 
						
				   }
		   
		  void multiply()
				   {  System.out.println("Multiplication of Matrix obtained is : \n");
					  for(int i = 0;i<c.length;i++)
						{
							for(int j=0;j<c.length;j++)
							{
								c[i][j] = a[i][j]*b[i][j];
								System.out.print(c[i][j]+" ");
							}
							System.out.println();
						} 
						System.out.println("\n");
				   } 
		   
		   public static void addelement(int [][] a)
				   {
					   System.out.println("Below is the given Matrix : \n");
					   display(a);
					   int sum = 0;
					   for(int i=0;i<a.length;i++)
					   {
						   for(int j=0;j<a.length;j++)
						   {
							   
							   sum+=a[i][j];
						   }
						   
					   }
					   System.out.println("Sum of all elements is : "+sum+"\n");
					   
				   }
		   
		   public static void transpose(int a[][])
		   { 
			
				
				System.out.println("Transpose of Matrix .......\n ");
				System.out.println("Before : \t After : ");
			
			  for(int i = 0;i<a.length;i++)
				{
					
					for(int j=0;j<a.length;j++)
					{
						
						System.out.print(a[i][j]+"  ");
					}
					System.out.print("\t ");
					for(int j=0;j<a.length;j++)
					{
						t[i][j] = a[j][i];
						System.out.print(t[i][j]+"  ");
					}
					
					System.out.println(" ");
				} 
				System.out.println("---------------------------------");
		   }
		   
		   
		   
		   public static void digonal(int [][] a)
		   {
			    System.out.println("Matrix of which the sum of digonal element to be calculated \n ");
			display(a);
			   int sum = 0;
			   int x = 0;
			   for(int i=0;i<a.length;i++)
			   {
				  
					System.out.println();
				   for(int j=0;j<a.length;j++)
				   {	
					   if(x%4==0)
					   {sum+=a[i][j];}
					x++;
				   }
			 }
			  
			   System.out.println("Sum of digonal elements is : "+sum+"\n");
		   }
		   
		   
		   
		   
	public static void main(String[]args)
			{   
				Array abc = new Array();
				abc.input();
				abc.addition();
				abc.subtract();
				abc.transpose(a);
				abc.transpose(b);
				abc.multiply();
			    abc.addelement(a);
				abc.digonal(a);
				
			}
			
}


