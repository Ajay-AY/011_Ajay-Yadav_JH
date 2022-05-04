
 // 2 assign

import java.util.Scanner;
class HighArray{
	int k;
	int[]arr;
	int n;
	
	public HighArray(){
		arr=new int[100];
		
		
	}
	
	public void insert(int n){
		this.n = n;
		
		System.out.println("Please add elements upto size "+n+" : ");
		System.out.println("Enter the Value : ");
		for(int i = 0;i<n;i++){
			Scanner sc = new Scanner(System.in);
			System.out.print(" arr["+i+"] = ");
			arr[i]= sc.nextInt();
			
		}
	}
	
	public void display(){
		for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	
	
	public boolean find(int key){
		
			for( k=0;k<n;k++){
				if(arr[k]==key)
					break;
				
			}
			if(k==n)
				return false;
			else
			return true;
	
		}
		
		
		public boolean delete(int key){
			
			for( k=0;k<n;k++){
			if(arr[k]==key){
			n--;
			break;
			}
		}
		if(arr[k]==key){
	   for(int j = k;j<n;j++){
	   arr[j]= arr[j+1];
	   }
		return true;
	}else
	return false;
		
	}
	
	
}


class HighArrayApp{
	public static void main(String...args){
		
	int n = 1;	
	 HighArray a = new HighArray();
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println("Enter choice 1) Add 2)Display 3)Find 4)Delete 5) Exit");
		int cases = sc.nextInt();
	
	
	switch(cases){
	case 1:a.insert(10);break;
	case 2 :a.display();break;
	
	 case 3 :{
		System.out.println("Enter element to find "); 
		 int val = sc.nextInt();
		 System.out.println(a.find(val));};break;
	
	case 4 :{
		
		System.out.println("Enter element to delete ");
	
	int val = sc.nextInt();
	
	System.out.println(a.delete(val));};break;
	
	case 5 :n=0;
	}
	
	}while(n!=0);
	
	}
	
}
