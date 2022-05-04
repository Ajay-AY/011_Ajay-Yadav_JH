

class ArrayDs{
	public static void main(String...args){
	
	int k;
	int[]arr = new int[100];
	arr[0] = 10; //0
	arr[1] = 11; //1
	arr[2] = 22;// 2
	arr[3] = 33;// 3
	arr[4] = 44;// 4
	arr[5] = 55;// 5
	arr[6] = 66;//6
	arr[7] = 77;//7
	arr[8] = 33;//8    9
	arr[9] = 80;//9    10
	
	
	// display()
	int n = 10;
	for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	//search()
	int key = 66;
	for( k=0;k<n;k++){
		if(arr[k]==key)
			break;
		
	}
	if(arr[k]==n)
		System.out.println("Not Found......");
	else
		System.out.println("Found......");
	
	//delete
	key =66;
	for( k=0;k<n;k++){
		if(arr[k]==key)
			break;
	}
	for(int j = k;j<n;j++){
		arr[j]= arr[j+1];
		
	}
		n--;
		
	
	for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	
	
	
	}

}

