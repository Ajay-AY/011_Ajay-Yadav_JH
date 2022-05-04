
	/* 
	class Assign1{
		static int i=1;
		static void display(int till){
		if(1<=till){
		
			
			display(till-1);
			System.out.print(till+" ");
		}
			
		}
		
		
	public static void main(String[] args){
	 display(10);
	 
	 
	}
	
	
	} */
	
	
	
	class Q1{
		
		static int display(int val){  //2    | 1     | 0
			if(val==0)               // false |false  | true
				return val;                             
			
			display(val-1);           // display (2-1)  | display (1-1) 
			System.out.print(val+"  "); // 2            |       1  |        
  			return val;                 // 2            |       1  |        
		}
		
		public static void main(String[] args){
			display(2);
		}
	}