	// array implementation..... linear queue....
	
	class Queue{
	  
	  int max = 5;
	  int arr[] = new int[max];
	  int front,rear;
	  
	  
	
	  Queue(){
		  front = rear =-1;
		  
	  }
	  
	  
	  //check if array is full.........
	  
	  boolean isFull(){
		 //return (front == 0 && rear == max-1);
		 return ( rear == max-1);
	  } 
	  
	  
	  
	  
	  
	  
	  
	  boolean isEmpty(){
		 return (front == -1 && rear == -1);
	  }
	  
	  
	  
	
	
	void enqueue(int element){
		//1. check queue is full
		
		if(isFull()){
			System.out.println("Queue is full..!!!");
			return;
		}
		else{
			
			// 2. if queue is empty.......
			if(front==-1){
				front = 0;
			}
			//3. if queue is not empty....
			 rear++;
			arr[rear] = element;
			
		}
		
		
	}
	
	
	int dequeue(){
		int element;
		//1.if queue is empty.......
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		//2. if queue is not empty.....
		else{
			element = arr[front];
			// incrementing front....
			front++;
			if(front>rear){
				front = rear = -1;
			}
			
			System.out.println("Element deleted : "+element);
			
			
			return element;
		
		}
		
	}
	
	
	
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}else{
			for(int i =front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
			
	}
	
	
	
	void peek(){
		
	}
	
	
	
	
	
	
	public static void main (String[] args){
	    Queue q1  = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.dequeue();
		q1.enqueue(50);
		q1.enqueue(60);
		
		q1.display();
		
	    q1.display();
	
	 }
	
	}