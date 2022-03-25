
// WAP to print tables of 1-30 using 2 for loops
// and also print tables of 1-30 using single for loops
// and also print tables of 1-30 using 2 while loops
// and also print tables of 1-30 using single while loops




class Table{                 // using double WHILE loop anf for loop
	static int i = 1;
    static int j = 1;
	public static void main(String []args){
		
		while(i<=30){

			while(j<=10){
			 System.out.println(i+"*"+j+" = "+(i*j));
			j++;
		}
			i++;
			j=1;
			System.out.println("===============");
		}
	}
}







/*


class Table{                 // using Double FOR loop for loop
	
	public static void main(String []args){
		
		for( int i =1;i<=30;i++){

			for(int j=1;j<=10;j++){
				System.out.println(i+"*"+j+" = "+(i*j));
			}
				System.out.println("===============");
		                 
		}
	}
}

*/


/*
class Table{  			// Using single FOR loop
	
	public static void main(String []args){
		
		
		for(int j=1,i=1;j<=10;j++){
			if(i==1 && j==1){
					System.out.println("Table of 1");
			}
			System.out.printf("%3d * %2d = %3d \n",i,j,(i*j));
			
		  if(j==10 && i<30){
				i++;
			    j=0;
				System.out.println("=================");
				System.out.println("Table of "+i+"");
				
		       }
		                    
		}
	}
}
*/


/*
class Table{           // Using Single FOR loop
	//static int i = 1;
	public static void main(String []args){
		
		
		for(int j=1,i=1;j<=11;j++){

		if(j<11){
	     System.out.println(i+"*"+j+" = "+(i*j));
			
		   }else if(j==11 && i<20){
				i++;
			    j=0;
				System.out.println("===============");
				
		       }
		                    
		}
	}
}*/

/*
class Table{                 // using Single WHILE loop anf for loop
	static int i = 1;
    static int j = 1;
	public static void main(String []args){
		
		while(j<=11){

				if(j<11){
			System.out.println(i+"*"+j+" = "+(i*j));
			
		}
		else if(j==11 && i<20){
				i++;
			    j=0;
				System.out.println("===============");
				
		}
		j++;
		                    
		}
	}
}*/
