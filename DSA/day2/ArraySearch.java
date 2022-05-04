

//Linear Search................
//Binary Search.....................

class ArraySearch{
	static int count;
	
	static int displayLinear(int a1[],int x){
		
		for(int i = 0;i<a1.length;i++){
			if(a1[i]==x){
			   return i;
			}
		} 
		return -1;
		
		
	}
	
	
	static int displayBinary(int a1[],int key,int low,int high){
		int mid = (low+(high-low))/2;
		
		if(low<=high){
		
		           // if found at mid 
				if(a1[mid]==key){
				return mid;
				}
				
				if(a1[mid]>key){
					 return displayBinary(a1,key,low,mid-1);
				}
				//if(a1[mid]<key)
				return displayBinary(a1,key,mid+1,high);
			  } 
		return -1;
	}
	
	public static void main (String...args){
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int n=displayLinear(arr,50);
		if (n<0)
			System.out.println("Not Found");
			
		else
			System.out.println("Found");
		

		int m = displayBinary(arr,50,0,arr.length);
		if (m==-1)
			System.out.println("Not Found");
			
		else
			System.out.println("Found");
		
		
		
		
		
	}
	
}