	
	class DLL{
	
	 static Node head;
	 
	
	static class Node{
		
		int data;
		Node next;
		Node prev;  // for storing previous 
		
		// constructor ...
		Node(int data){
			this.data = data;
			next = null;
			prev = null;         
		}
	}
	
	
	void insert(int val){
		
		Node newNode = new Node(val);
		
		// if list is empty....
		if(head==null){
			head = newNode;
			newNode.prev = null;     
			
			return;
		}
		
		// atFirst .......
		if(head != null){
		head.prev = newNode;
		newNode.next= head;
		head=newNode;
		return;
		}
		 
		 // atMiddle....
		 
		 // atLast.......
		
		
	}
	
	
	
	
	void display(Node temp){
		Node rev = null  ;
		System.out.println("Forward Display : ");
		while(temp!=null){
			System.out.print(temp.data+"  ");
			rev = temp;
		 temp = temp.next;
		}
		System.out.println();
		System.out.println("Reverse Display : ");
		while(rev!=null){
		System.out.print(rev.data+"  ");
		
	    rev = rev.prev;
		}
		   
	}
	
	public static void main(String[] args){
		DLL list = new DLL();
		list.head = new Node(10);
		Node s = new Node(20);
		s.prev = list.head;
		Node t = new Node(30);
		t.prev = s;
		list.head.next = s;
		s.next = t;
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.display(list.head);
		
	}
	
	
	
	}