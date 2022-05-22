import java.util.*;

class MusicProject {


       String f_name;
       String l_name;
       String email;
	   long mob_number;
	   Node head;
	   int countfixed;
	
	
	    Scanner sc = new Scanner(System.in);

       MusicProject(){
		
		  System.out.println();
          System.out.println("\t\t\t\t\t\t\t========================================================");
          System.out.println();
          System.out.println("\t\t\t\t\t\t\t            Customer Registration Process   ");
		   System.out.println();
          System.out.println("\t\t\t\t\t\t\t========================================================");
     

          System.out.println();
		  System.out.print("\t\t\t\t\t\t\t      Enter the Customer's First Name : ");
		  //System.out.println();
          this.f_name = sc.next();
		
		  System.out.println();
          System.out.print("\t\t\t\t\t\t\t      Enter the Customer's Last Name : ");
		  
          this.l_name = sc.next();
		
		  System.out.println();
          System.out.print("\t\t\t\t\t\t\t      Enter the Customer's email Id :");
		  
          this.email = sc.next();
		
		  System.out.println();
         
		  
           
          do{
			  try{System.out.println();
				  sc.nextLine();
				  
				System.out.print("\t\t\t\t\t\t\t    Enter the Customer's Mobile number : ");  
			  this.mob_number = sc.nextLong();
			  break;
		  }
		  catch(Exception e){
			  System.out.println("\t\t\t\t\t\t\t   Enter correct Contact number !!!!");
		  }
		  }while(true) ;
		  
		  
		  
		  
}

        public void display(){
             
			 System.out.println("\t\t\t\t\t\t\t Customer's Name           : " + f_name +" "+ l_name );
             System.out.println("\t\t\t\t\t\t\t Customer's Email id       : " + email);
		     System.out.println("\t\t\t\t\t\t\t Customer's Mobile Number  : " + mob_number);

        }
	
	
	    static class Node{
		   
		   String data;
		   Node next;
		   Node prev;
		   
		    Node(String a){
			  
			  data=a;
			  next=null;
			  prev=null;
		    }
	    }
	
	    void insertSongs(String songName){
		 
		    Node newNode = new Node(songName);
		    newNode.next = head;
		    head = newNode;
			
	    }
	
	    
		// insertion sort algorithm ........................
	    void insertionAscendSort(Node head){
		    Node trav  = head;
		    for(Node i = trav.next; i!=null ; i=i.next){
			String val = i.data;
			Node j = i;
			
			
		while(j.prev!=null && j.prev.data.compareTo(val)>0){
			j.data = j.prev.data;
			j=j.prev;
		  }
		  
		  j.data = val;
		  
		   }
	    }
		 void insertionDecendSort(Node head){
		    Node trav  = head;
		    for(Node i = trav.next; i!=null ; i=i.next){
			String val = i.data;
			Node j = i;
			
			
		while(j.prev!=null && j.prev.data.compareTo(val)<0){
			j.data = j.prev.data;
			j=j.prev;
		  }
		  
		  j.data = val;
		  
		   }
	    }
	
	// linear search algorithm................
	
	    void search(Node head, String key){
		    for(Node n = head;n!=null;n=n.next){
			    if(0==key.compareToIgnoreCase(n.data)){
				   System.out.println("\t\t\tThe Song "+key+" is present in List ");
				   return;
		        }
		    }
			System.out.println();
		    System.out.println("\t\t\tThe song "+key+" is not found in the List \n We are working on updates Stay Tuned...!");
	    }

	    void addFirst(String data){
			  Node newNode = new Node(data);
			  newNode.next=head;
			  newNode.prev=null;
			  if(head!=null)
			  head.prev=newNode;
			  head=newNode;
			  countfixed++;
		}
	   
	    void addAtPos(String data,int pos){
		  
		   Node newNode = new Node(data);
		   Node n= head;
		   if(pos==1){
			   addFirst(data);
		    }
		   else{
			   for(int i=1;i<pos-1;i++){
				   
				   if(n.next==null)
					   break;
				   n=n.next;
			    }
			   newNode.next=n.next;
			   n.next=newNode;
			   n.next.prev=newNode;
			   newNode.prev=n;
		    }
	    }
	   
	    void addLast(String data){
			Node newNode = new Node(data);
		    if(head==null)
			   addFirst(data);
		   
		   Node n= head;
		   while(n.next!=null){
			   n=n.next;
		    }
		     n.next=newNode;
		     newNode.prev=n;  
	    }
		
		void deleteFirst(){
		if(head == null)
			return;
		if(head.next==null){
			head = head.next;
				countfixed--;	

		   return;
		}
		head = head.next;
		head.prev = null;
		countfixed--;
		
	}
	
		void deleteAtPos(int pos){
			if(pos<=countfixed)
			{		int count= 0;
		int key = pos-1;
		if(key == 0){
			deleteFirst();
			return;
		}
		Node temp = null;
		Node n= head;
		while(n!=null){
			count++;
			temp = n;
			n = n.next;
			if(count == key){
				temp = temp;
				break;
			}
		}
		if(n.next!=null){
		temp.next = n.next;
		n.next.prev = temp;
		countfixed--;
		return;
		}if(temp.next==null){
			deleteLast();
			
		}
			}
		
		
	}
	

	
	

	void deleteLast(){
		if(head==null){
			return;
		}
		
		Node n = head;
		
		while(n.next!=null){
			n=n.next;
		}
		if(n.next == head.next){
			head = null;
			countfixed--;
			
			return;
		}
		n.prev.next = null;
		n.prev = null;
		countfixed--;
	}
	
		
		  
		
	
		
		
	  
	
	    void displaySongs(){
		   int count = 1;
		   
		      System.out.println();
			  System.out.println("\t\t\t\t\t\t\t                 Your PlayList is as   :");
			  System.out.println("\t\t\t\t\t\t\t=================================================");
	          System.out.println();
			  			
			  Node n=head;
			  Node p=null;
			
			   while(n!=null){
				  p=n;
				  System.out.println("\t\t\t\t\t\t\t"+count+") "+n.data);
				  count++;
				  n=n.next;
			    }
			System.out.println("");	
		
			
	    }
		
		void displaySortedSongs(int num){
			
			if(num==1){
		     int count = 1;
			 if(head==null){
				 return;
			 }
		     insertionAscendSort(head);
		
			 System.out.println("\t\t\t\t\t\t\t                 Sorted PlayList is as   : ");
			  System.out.println("\t\t\t\t\t\t\t=================================================");
	          System.out.println();
			
			Node n=head;
			Node p=null;
			
			    while(n!=null){
				  p=n;
				  System.out.println("\t\t\t\t\t\t\t"+count+") "+n.data);
				  count++;
				  n=n.next;
			    }
		    System.out.println("");
			
			}
			else if(num==2)
			{
		     int count = 1;
			  if(head==null){
				 return;
			 }
		     insertionDecendSort(head);
		
			 System.out.println("\t\t\t\t\t\t\t                 Sorted PlayList is as   : ");
			  System.out.println("\t\t\t\t\t\t\t=================================================");
	          System.out.println();
			
			Node n=head;
			Node p=null;
			
			    while(n!=null){
				  p=n;
				  System.out.println("\t\t\t\t\t\t\t"+count+") "+n.data);
				  count++;
				  n=n.next;
			    }
		    System.out.println("");
			
			}
				
			
			
	    }
		
		
	
	    void removeSongs(String key){
		     Node temp=head;
		     Node prev = null;
           //if sigle element...
		    if(temp.data == key && temp!= null){
			  head = temp.next;
			  return;
		    }
		  
		 
            // traverse 
		
					  
			    while(temp.next!=null && temp.data != key){
				    prev = temp;
					temp = temp.next;
						  
				}
					  if(temp==null)
						return	;
					  prev.next = temp.next;
	    }
	
}


class Playlist{
	Scanner sc = new Scanner(System.in);
		   
     
	String A_R_Rehmaan[] = {"Tu Hi Re","Yeh Haseen Vaadiyaan","Jai Ho","Rehnaa Tu","Kun Faaya Kun",
	                          "Dil Se Re","Jashna E Bahaara","Masakali","Tum Tak","Ishq Binaa" ,
							  "Chaiyaan Chaiyaan", "Taal Se Taal","Satrangi re","Yun Hi Chala Chal","Aga Tum Saath Ho",
							  "Yeh Jo Des Hai Tera","Saathiyaa","Enna Sonaa","Mukaala Mukaabala","Tum Ho"};
							  
    String Lata_Mangeshkar[] = {"Lag Ja Gale Se Phir","Bheegi Bheegi Raaton Mein","Tere Bina Zindagi Se","Ajib Dastan Hai Yeh","Gum Hai Kisi Ke Pyar Mein",
	                          "Ek Pyar Ka Naghma Hai","Bahon Mein Chale Aao","Gaata Rahe Mera Dil","Tujhse Naraz Nahin Zindagi","Chup Gaye Sare Nazare",
							  "Chup Gaye Sare Nazare", "Aap Ki Nazron Ne Samjha","Salame Ishq Meri Jaan","Achha To Hum Chalte Hain","Aap Ki Ankhon Mein Kuch",
							  "Kora Kagaz Tha Yeh Man Mera","Are Re Are","Tere Chehre Se Nazar Nahin","Hum Dono Do Premi","Tere Liye"};
	 	 
	String Kishor_Kumar[] = {"O Mre Dil Ke Chain","Yeh Shaam Mastaani","Roop Tera Mastaana","Pyaar Diwaana Hota Hai","Mere Sapnon Ki Raani",
	                           "Meri Bheegi Bheegi Si","Zindagi Ek Safar"," Chala Jaata Hoon ","Aanewaala Pal","O Saathi Re","Pal Pal Dil Ke pass",
							   "Ek Ladki Bheegi Bhaagi Si","Mere Mehboob","O Hansini","Mere Saamne Wali Khidki Mein","Kehna Hai",
							   "Ek Ajanabi Haseena Se","Dilbar Mere","Yeh Raatein Yeh Mausam","Neele Neele Ambar Par","Raat Kali EK Kwaab mein Aayi"};
	 	 
	String Kumar_Sanu[] =   {"Mera Dil Bhi Kitna Pagal Hai","Tere Dar Par Sanam","Ek Ladki Ko Dekha","Tujhe Dekha To","Jab Koi Baat Bigad Jaye",
	                           "Ek Din App","Aankhon Ki Gustakhiyan","Ek Sanam Chahiye Aashiqui Ke Liye","Chura Ke Dil Mera","Do Dil Mil Rahe Hain",
							   "Aankhon Ki Gustakhiyan","Kuchh Na Kaho","Raah Mein Unse Mulaqat Ho Gayi","Meri Mehbooba","Dil Hai Ke Manta Nahin",
							   "Mera Chand Mujhe Aaya Hai Nazar","Dil Kaa Aalam","Dheere Dhheere Se","Jab Se Main","Nazar Ke Samne"};
		
	String Udit_Narayan[] =  {"Kuch Kuch Hotaa Hai","Aye Mere Humsafar","Jaadu Tri Nazar","Dil To Pagal Hai","Tu Cheez Badi hai",
	                           "Jo Bhi Kasamein","Ruk Ja O Dil Diwaane","Pehla Nahha","Tere Naam","Dil Ne Ye Kaahan Hai","koi Mil Gayaa",
							   "Hum Tumhaare Hai Sanam","Bin Tere Sanam","Tu Mere Saamne","Aaye Ho Meri Zindagi Mein","Raja Ko Rani Se",
							   "Bholi Si Surat","Mere Mehboob Mere Sanam","Chan Chupaa Badal Mein","Tumse Milnaa","Meraa Maan"};
	 		   
	String Shreyaa_Ghoshal[] = {"Agar Tum Mil Jao","Jaadu Hai Nasha Hai","Dola Re Dola","Bairi Piya","Teri Meri",
	                           "Teri Ore","Manwa Laage","Param Sundari","Kehte Hain Khuda Ne","Rehnuma","Dil Dooba",
							   "Saathiyaa","Leja Leja Re","Ghoomar","Deewani Mastaani","Sunn Raha Hai",
							   "Yeh Ishq Hai","Tere Naina Maar Hi Daalenge","Silsilaa Ye Chaahat Kaa","Salaam Aaya","Saans"};
	 		  
 	String Dance_Songs[] = {"Swag Se Swagat","Disco Disco","Tamma Tamma Again","High Heels Te Nachche","Sooraj Dooba Hain Yaaron",
	                           "Chammak Challo","It's the Time to Disco","Dhinka Chika","Party All Night","Lungi Dance",
							   "Akh Lad Jaave","Aankh Marey","Illegal Weapon 2.0","Lagdi Lahore Di","O Saki Saki",
							   "Gali Gali","Dilbar","Coca Cola","Kala Chashma","Bdtameez Dil"};
	 
	String Workout_Songs[] = {"Chak De India","Zinda","Get Ready to Fight", "Bhag Milkha Bhag","Sooraj Dooba Hain Yaaron",
	                           "Ziddi Dil","Dhakad","Dhinka Chika","Kar Har Maidaan Fateh","Dangal",
							   "The Jawani Song","Apna Time Aayega","Illegal Weapon 2.0","I Don't Care","Blood Sweat & Tears",
							   "Machayenge","Dilbar","Don't Stop the Music","God Is a Dancer","Raising Hell"};
	 
	 
	String Mixtape_Songs[] = {"Tose Naina-Tum Jo Aaye","Soch Na Sake-Sab Tera","Dua-Saware", "Tu Jo Mila-Raabta","Pee Loon-Ishq Sufiyana",
	                           "Agar Tum Saath Ho-Maahi Ve","Mera Mann-Yahin Hoon Main","Sunn Raha Hai-Rozana","Gazab Ka Hai Din-Bawara Mann","Kabira-Naina",
							   "Kabhi Jo Badal Barse-Dil De Diya Hai","O Saathi-Humsafar","Tum Hi Ho-Rehnuma","Ik Vaari Aa-Nadaan Parindey","Teri Meri-Phir Se",
							   "Aaoge Jab Tum-Jag Soona Soona","Main Rahoon Ya Na Rahoon-Dil Kyun Yeh Mera","Galliyan-Dil Mein Ho Tum","Sanam Re-Phir Mohabbat","Darkhaast-Aankhon Mein Teri"};
	 
	String Latest_Releases[] = {"Bhool Bhulaiyaa 2 Title Track","Kahani","Whistle Baja 2.0", "Bechari","Pehli Baar",
	                           "Buhe Bariyan","Mera Yaar","Heer Raanjhana","Kya Yehi Pyaar Hai","Rehna Tere Paas"};
	 
	 
	 
	 
	 int count2 = (A_R_Rehmaan.length+Lata_Mangeshkar.length+Kishor_Kumar.length
			                        +Kumar_Sanu.length+Udit_Narayan.length+Dance_Songs.length+Workout_Songs.length
									 +Mixtape_Songs.length+Latest_Releases.length+Shreyaa_Ghoshal.length);
	 
	 
	 
	 public void display_All_Song(){
		 int count = 1;
		 for (int a=0; a < A_R_Rehmaan.length; a++){
			System.out.println(" \t\t\t\t\t\t\t "+count+") "+A_R_Rehmaan[a]);
			count++;
		}
		for (int b=0; b < Lata_Mangeshkar.length; b++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Lata_Mangeshkar[b]);
			count++;
		}
		for (int c=0; c < Kishor_Kumar.length; c++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Kishor_Kumar[c]);
			count++;
		}
		for (int d=0; d < Kumar_Sanu.length; d++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Kumar_Sanu[d]);
			count++;
		}
		for (int e=0; e < Udit_Narayan.length; e++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Udit_Narayan[e]);
			count++;
		}
		
		
		for (int g=0; g < Dance_Songs.length; g++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Dance_Songs[g]);
			count++;
		}
		for (int h=0; h < Workout_Songs.length; h++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Workout_Songs[h]);
			count++;
		}
		
		for (int i=0; i < Mixtape_Songs.length; i++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Mixtape_Songs[i]);
			count++;
		}
		for (int j=0; j < Latest_Releases.length; j++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Latest_Releases[j]);
			count++;
		}
		for (int f=0; f < Shreyaa_Ghoshal.length; f++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Shreyaa_Ghoshal[f]);
			count++;
		}
	}
	 
	public void A_R_Rehmaan(){
	   int count = 1;
	  
	  System.out.println("\t\t\t\t\t\t\t\t   A R REHMAAN PLAYLIST SONGS   ");
	  System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int a=0; a < A_R_Rehmaan.length; a++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+A_R_Rehmaan[a]);
			count++;
		}
		
	}
	
	public void Lata_Mangeshkar(){
	    int count = 1;
	  
	  System.out.println("\t\t\t\t\t\t\t\t   LATA MANGESHKAR PLAYLIST SONGS   ");
	 System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int b=0; b < Lata_Mangeshkar.length; b++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Lata_Mangeshkar[b]);
			count++;
		}
		
	}
	
	public void Kishor_Kumar(){
	   
	   int count = 1;
	  System.out.println("\t\t\t\t\t\t\t\t   KISHOR KUMAR PLAYLIST SONGS  ");
	   System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int c=0; c < Kishor_Kumar.length; c++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Kishor_Kumar[c]);
			count++;
		}
		
	}
	
	
	public void Kumar_Sanu(){
	    int count = 1;
	  
	  System.out.println("\t\t\t\t\t\t\t\t   KUMAR SANU PLAYLIST SONGS  ");
	   System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int d=0; d < Kumar_Sanu.length; d++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Kumar_Sanu[d]);
			count++;
		}
	}
	
	public void Udit_Narayan(){
	    int count = 1;
	  
	  System.out.println("\t\t\t\t\t\t\t\t   UDIT NARAYAN PLAYLIST SONGS  ");
	  System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int e=0; e < Udit_Narayan.length; e++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Udit_Narayan[e]);
			count++;
		}	
	}
	
	public void Shreyaa_Ghoshal(){
	   
	   int count = 1;
	  System.out.println("\t\t\t\t\t\t\t\t   Shreyaa Ghoshal PLAYLIST SONGS  ");
	   System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int f=0; f < Shreyaa_Ghoshal.length; f++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Shreyaa_Ghoshal[f]);
			count++;
		}
		
	}
	
	public void Dance_Songs(){
	    int count = 1;
	  
	  System.out.println("\t\t\t\t\t\t\t\t   DANCE SONGS PLAYLIST   ");
	  System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int g=0; g < Dance_Songs.length; g++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Dance_Songs[g]);
			count++;
		}
	}
	
	public void Workout_Songs(){
	   
	   int count = 1;
	  System.out.println("\t\t\t\t\t\t\t\t   WORKOUT AND GYM SONGS PLAYLIST   ");
	   System.out.println("\t\t\t\t\t\t\t==================================================");
		
		for (int h=0; h < Workout_Songs.length; h++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Workout_Songs[h]);
			count++;
		}
	} 
	
	public void Mixtape_Songs(){
		
	   int count = 1;
	  System.out.println("\t\t\t\t\t\t\t\t   T TERIES MIXTAPE SONGS PLAYLIST   ");
	   System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int i=0; i < Mixtape_Songs.length; i++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Mixtape_Songs[i]);
			count++;
		}
	}
	
	public void Latest_Releases(){
	   
	   int count = 1;
	  System.out.println("\t\t\t\t\t\t\t\t   Latest Released SONGS PLAYLIST   ");
	  System.out.println("\t\t\t\t\t\t\t==================================================");
	  System.out.println();
		
		for (int j=0; j < Latest_Releases.length; j++){
			System.out.println("\t\t\t\t\t\t\t "+count+") "+Latest_Releases[j]);
			count++;
		}
	} 
	
	
	
	public String A_R_Rehmaan(int val){
		int key = val-1;
	   return A_R_Rehmaan[key];
	   
	       
		}
		
		public String Lata_Mangeshkar(int val){
	      int key = val-21;
		  return Lata_Mangeshkar[key];
		  
		}
		
		
		public String Kishor_Kumar(int val){
	   int key = val - 41;
     return Kishor_Kumar[key]  ; 
	   
		}
		
		public String Shreyaa_Ghoshal(int val){
	             int key = val - 173;
             return Shreyaa_Ghoshal[key] ; 
	   
		}
		
	
	public String Kumar_Sanu(int val){
	    int key = val - 62;
		return Kumar_Sanu[key];
	}
	
	
	
	public String Udit_Narayan(int val){
	    int key = val-82;
		return Udit_Narayan[key];
	}
	
	public String Dance_Songs(int val){
	    int key = val-103;
		return Dance_Songs[key];
	}
	
	public String Workout_Songs(int val){
	   int key = val-123;
	   return Workout_Songs[key];
	   
	} 
	
	public String Mixtape_Songs(int val){
		int key = val-143;
		return Mixtape_Songs[key];
	  
	}
	
	public String Latest_Releases(int val){
	   int key = val-163;
	   return Latest_Releases[key]; 
	  
	} 
	
	
	public int A_R_Rehmaan(String name){
	 
	  
		for (int a=0; a < A_R_Rehmaan.length; a++){
			if(0==name.compareToIgnoreCase(A_R_Rehmaan[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Lata_Mangeshkar(String name){
	 
	  
		for (int a=0; a < Lata_Mangeshkar.length; a++){
			if(0==name.compareToIgnoreCase(Lata_Mangeshkar[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Kishor_Kumar(String name){
	 
	  
		for (int a=0; a < Kishor_Kumar.length; a++){
			if(0==name.compareToIgnoreCase(Kishor_Kumar[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Kumar_Sanu(String name){
	 
	  
		for (int a=0; a < Kumar_Sanu.length; a++){
			if(0==name.compareToIgnoreCase(Kumar_Sanu[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Udit_Narayan(String name){
	 
	  
		for (int a=0; a < Udit_Narayan.length; a++){
			if(0==name.compareToIgnoreCase(Udit_Narayan[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	
	public int Dance_Songs(String name){
	 
	  
		for (int a=0; a < Dance_Songs.length; a++){
			if(0==name.compareToIgnoreCase(Dance_Songs[a])){
				
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Workout_Songs(String name){
	 
	  
		for (int a=0; a < Workout_Songs.length; a++){
			if(0==name.compareToIgnoreCase(Workout_Songs[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	
	public int Mixtape_Songs(String name){
	 
	  
		for (int a=0; a < Mixtape_Songs.length; a++){
			if(0==name.compareToIgnoreCase(Mixtape_Songs[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	
	public int Latest_Releases(String name){
	 
	  
		for (int a=0; a < Latest_Releases.length; a++){
			if(0==name.compareToIgnoreCase(Latest_Releases[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	public int Shreyaa_Ghoshal(String name){
	 
	  
		for (int a=0; a < Shreyaa_Ghoshal.length; a++){
			if(0==name.compareToIgnoreCase(Shreyaa_Ghoshal[a])){
				return 1;
			}
		}
		return 0;
		
	}
	
	
	
	
	
	int  searchSong(String name){
		
		for(int num = 1;num<=count2;num++){
			 if(num>=1 && num<=20){if(0==name.compareToIgnoreCase(A_R_Rehmaan(num))){
				 System.out.println("\t\t\t\t\t\t\tSong Name : "+A_R_Rehmaan(num)+"\n\t\t\t\t\t\t\tPlaylist Name : A_R_Rehmaan Playlist..");
			 return A_R_Rehmaan(name);}
									}
									else if(num>=21 && num<=40){
										if(0==name.compareToIgnoreCase(Lata_Mangeshkar(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Lata_Mangeshkar(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Lata_Mangeshkar Playlist..");
									return Lata_Mangeshkar(name);}
									}
									 else if(num>=41 && num<=61){
										 if(0==name.compareToIgnoreCase(Kishor_Kumar(num))){
											 System.out.println("\t\t\t\t\t\t\tSong Name : "+Kishor_Kumar(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Kishor_Kumar Playlist..");
										 return Kishor_Kumar(name);}
										 }
									else if(num>=62 && num<=81){
										if(0==name.compareToIgnoreCase(Kumar_Sanu(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Kumar_Sanu(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Kumar_Sanu Playlist..");
									return Kumar_Sanu(name);}
									}
									else if(num>=82 && num<=102){
										if(0==name.compareToIgnoreCase(Udit_Narayan(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Udit_Narayan(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Udit_Narayan Playlist..");
									return Udit_Narayan(name);}
									}
									else if(num>=103 && num<=122){
										if(0==name.compareToIgnoreCase(Dance_Songs(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Dance_Songs(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Dance_Songs Playlist..");
									return Dance_Songs(name);}
									}
									else if(num>=123 && num<=142){
										if(0==name.compareToIgnoreCase(Workout_Songs(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Workout_Songs(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Workout_Songs Playlist..");
									return Workout_Songs(name);}
									}
									else if(num>=143 && num<=162){
										if(0==name.compareToIgnoreCase(Mixtape_Songs(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Mixtape_Songs(num)+"\n\t\t\t\t\t\t\tPlaylist Name :Mixtape_Songs Playlist..");
									return Mixtape_Songs(name);}
									}else if(num>=163 && num<=172){
										if(0==name.compareToIgnoreCase(Latest_Releases(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Latest_Releases(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Latest_Releases Playlist..");
										return Latest_Releases(name);}
									}else if(num>=173 && num<=193){
										if(0==name.compareToIgnoreCase(Shreyaa_Ghoshal(num))){
											System.out.println("\t\t\t\t\t\t\tSong Name : "+Shreyaa_Ghoshal(num)+"\n\t\t\t\t\t\t\tPlaylist Name : Shreyaa_Ghoshal Playlist..");
										return Shreyaa_Ghoshal(name);}
									}
		 
								}		return 0;
	             }
	
	
	
	public String nameOfSong(int num){
	if(num>=1 && num<=20){
		return   A_R_Rehmaan(num);
		}
		else if(num>=21 && num<=40){
		return Lata_Mangeshkar(num);
		}
        else if(num>=41 && num<=61){
		 return Kishor_Kumar(num);
		}else if(num>=62 && num<=81){
		return Kumar_Sanu(num);
		}
		else if(num>=82 && num<=102){
		 return  Udit_Narayan(num);
		}
	  else if(num>=103 && num<=122){
		return   Dance_Songs(num);
		}
		else if(num>=123 && num<=142){
		return Workout_Songs(num);
		}
	   else if(num>=143 && num<=162){
		return  Mixtape_Songs(num);
		}else if(num>=163 && num<=172){
	   return  Latest_Releases(num);
		}else if(num>=173 && num<=193){
	   return  Shreyaa_Ghoshal(num);
		}
		else
		{
		System.out.println("\t\t\t\t\t\t\t    Enter your Song Name .....");
		
	    String name = sc.nextLine();
		return name;
		}
		 
	}
	
	
	
	
	
	
}


class MusicPlayer{
	
	static Scanner sc = new Scanner(System.in);
	
	static void registration(){
		String user_id;
        String pass;
		
        Scanner sc1 = new Scanner(System.in);
		System.out.println();
        System.out.println("\t\t\t\t\t\t\t   Press 1 to Log in ");
		int button;
        do{ try{
				   sc.nextLine();
				    System.out.print("\n\t\t\t\tPlease 1 to login .....");
					 button = sc.nextInt();
					break;
			   }catch(Exception e){
				   System.out.println("\n\t\t\t\tInput Didn't matched \n\n\t\t\t\tPlease  Observe  carefully while entering !!!!!\n");
			   }
			   }while(true);
                        
		
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t====================================");
        System.out.println("\t\t\t\t\t\t\t      Customer Login Process...    ");
        System.out.println("\t\t\t\t\t\t\t====================================");
        System.out.println();

        System.out.print("\t\t\t\t\t\t\t Enter your User Id :    ");
        user_id = sc1.nextLine();
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t Enter your password :    ");
        pass = sc1.nextLine();

	}

    public static void main(String[] args){
       
       
        Scanner sc = new Scanner(System.in);
        MusicProject mp = new MusicProject();
		Playlist p = new Playlist();
		System.out.println();
		System.out.println();
		System.out.println("\n\t\t\t\t\t\t\t                 WelCome " + mp.f_name +" "+ mp.l_name+" \n" );
		
		
		 System.out.println("\t\t\t\t\t\t\t========================================================");
		 System.out.println();
        System.out.println("\t\t\t\t\t\t\t              Customer's details are  :");
		System.out.println();
        System.out.println("\t\t\t\t\t\t\t========================================================");
        System.out.println();

		mp.display();
       
        System.out.println();
		
		System.out.println();
        System.out.println("\t\t\t\t\t\t\t********************************************************");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t             WelCome to ADDA Music Store  ");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t********************************************************");
        System.out.println();	
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t         Press any Key to enter in Music App");
        System.out.println("\t\t\t\t\t\t\t--------------------------------------------------------");
		System.out.println();
		
		
        char condition = sc.next().charAt(0);
        int flag =1;
		int flag1 = 0;
	 char flag2;
        char  choise1 = '1';
		int num = 0;
   
    


	        do{
				System.out.println();
			    System.out.println("\t\t\t\t\t\t\t========================================================");
			    System.out.println();
			    System.out.println("\t\t\t\t\t\t\t         Press 1   :    All Songs              ");
	            System.out.println("\t\t\t\t\t\t\t         Press 2   :    View Playlists         ");
	            System.out.println("\t\t\t\t\t\t\t         Press 3   :    Creat your Playlist    ");
				System.out.println("\t\t\t\t\t\t\t         Press 4   :    Search songs           ");
			    System.out.println("\t\t\t\t\t\t\t         Press 5   :    Play Song from List    ");
				System.out.println("\t\t\t\t\t\t\t         Press 6   :    Exit                   ");
					  
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t========================================================");
			    System.out.println();
			    System.out.println("\t\t\t\t\t\t\t             Please Select the Option...");	
				System.out.println("\t\t\t\t\t\t\t-------------------------------------------------------");
                System.out.println();					  
			   
				
			    int Playlist = 0; 
			         
		       do{ try{System.out.println();
				     sc.nextLine();
				    System.out.print("\n\t\t\t\tPlease Select the Option...");
					Playlist = sc.nextInt();
					break;
			   }catch(Exception e){
				   System.out.println("\n\t\t\t\tInput Didn't matched  \n\t\t\t\tPlease Observe the Number carefully while entering !!!!!\n");
			   }
			   }while(true);
				System.out.println("\t\t\t\t------------------------------------------");
                System.out.println();	
				
				
			switch (Playlist){
				
				case 1 :
				       {p.display_All_Song();}
					   break;
				
				case 2 :{
				
				        System.out.println();
			            System.out.println("\t\t\t\t\t\t\t*******************************************************");
						System.out.println();
		                System.out.println("\t\t\t\t\t\t\t          WelCome to ADDA Music Playlists...");
						System.out.println();
			            System.out.println("\t\t\t\t\t\t\t*******************************************************");
					
			        while( choise1 == '1'){
					   
					  System.out.println();
			          System.out.println("\t\t\t\t\t\t\t========================================================");
					  System.out.println();
	                  System.out.println("\t\t\t\t\t\t\t      Press 1   :   A R REHMAAN PLAYLIST              ");
	                  System.out.println("\t\t\t\t\t\t\t      Press 2   :   LATA MANGESHKAR PLAYLIST          ");
					  System.out.println("\t\t\t\t\t\t\t      Press 3   :   KISHOR KUMAR PLAYLIST             ");
	                  System.out.println("\t\t\t\t\t\t\t      Press 4   :   KUMAR SANU PLAYLIST               ");
					  System.out.println("\t\t\t\t\t\t\t      Press 5   :   UDIT NARAYAN PLAYLIST             ");
					  System.out.println("\t\t\t\t\t\t\t      Press 6   :   Shreyaa Ghoshal PLAYLIST          ");
	                  System.out.println("\t\t\t\t\t\t\t      Press 7   :   PARTY DANCE SONGS PLAYLIST        ");
					  System.out.println("\t\t\t\t\t\t\t      Press 8   :   WORKOUT AND GYM SONGS PLAYLIST    ");
	                  System.out.println("\t\t\t\t\t\t\t      Press 9   :   T TERIES MIXTAPE SONGS PLAYLIST   ");
	                  System.out.println("\t\t\t\t\t\t\t      Press 10  :   Latest Released SONGS PLAYLIST    ");
					  System.out.println();
					  System.out.println("\t\t\t\t\t\t\t========================================================");
			          System.out.println();
					  System.out.println();
			          System.out.println("\t\t\t\t\t\t\t              Please Select the Option...");	
                      System.out.println("\t\t\t\t\t\t\t--------------------------------------------------------\n");
					  System.out.println();
                         int choise;
                          do{ try{
				   sc.nextLine();
				    System.out.print("\n\t\t\t\tPlease Select the Appropriate Option...");
					 choise = sc.nextInt();	
					break;
			   }catch(Exception e){
				   System.out.println("\n\t\t\t\tInput Didn't matched \n\n\t\t\t\tPlease  Observe the Number carefully while entering !!!!!\n");
			   }
			   }while(true);
                        
			switch(choise){
				
				case 1 :     
						p.A_R_Rehmaan();
						
						break;
					
				case 2 :
						p.Lata_Mangeshkar();
						
						break;
						
				case 3 :
						p.Kishor_Kumar();
						break;
					
				case 4 :
					    p.Kumar_Sanu();
						break;
				case 5 :
						p.Udit_Narayan();
						break;	
						
				case 6 :
						p.Shreyaa_Ghoshal();
						break;
			
				case 7 :
					    p.Dance_Songs();
					    break;
						
				case 8 :
						p.Workout_Songs();
						break;
						
			    case 9 :
						p.Mixtape_Songs();
						break;
			
				case 10 :
						p.Latest_Releases();
						break;
						
				default :
						System.out.println();
		                System.out.println("\t\t\t\t\t\t\t========================================================");
		                System.out.println("\t\t\t\t\t\t\t           INVALID ENTRY...   ");
		                System.out.println("\t\t\t\t\t\t\t========================================================");
		                break;
					
			}
						
				        System.out.println();
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t********************************************************");
					    System.out.println();
                        System.out.println("\t\t\t\t\t\t\t         Press 1 to view more  playlist ....");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t         Press 2 to return to main Menu...");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t********************************************************");
						System.out.println();
		
						choise1 = sc.next().charAt(0);
					    
						}
                        
			}  break;
				   
				   
				   
				case 3 :{
					 
						System.out.println();
			            System.out.println("\t\t\t\t\t\t\t********************************************************");
						System.out.println();
		                System.out.println("\t\t\t\t\t\t\t        To creat own playlist please Log in ...");
						System.out.println();
			            System.out.println("\t\t\t\t\t\t\t********************************************************");
					
					
					    System.out.println();
			            System.out.println("\t\t\t\t\t\t\t========================================================");
						System.out.println();
	                    System.out.println("\t\t\t\t\t\t\t                 User Login Process...    ");
						System.out.println();
	                    System.out.println("\t\t\t\t\t\t\t========================================================");
	                    System.out.println();
						
						System.out.print("\t\t\t\t\t\t\t         Enter your User Id :    ");
						System.out.println();
	                    String user_id = sc.next();
	                    System.out.println();
	                    System.out.print("\t\t\t\t\t\t\t         Enter your password :    ");
						System.out.println();
                        String pass = sc.next(); 
			   
                        System.out.println();
						System.out.println();
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t********************************************************");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t     WelCome to Custom Playlist of ADDA Music Store  ");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t********************************************************");
                        System.out.println();
					  
				 
		 
			do{        int choice;  
						System.out.println("\t\t\t\t\t\t\t======================================================");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t         Press 1  :    Add Songs                 ");
                        System.out.println("\t\t\t\t\t\t\t         Press 2  :    Remove Songs              ");
                        System.out.println("\t\t\t\t\t\t\t         Press 3  :    Display Playlist Songs    ");
			            System.out.println("\t\t\t\t\t\t\t         Press 4  :    Search Song               ");

			            System.out.println("\t\t\t\t\t\t\t         Press 5  :    Sort the Songs            ");
						System.out.println("\t\t\t\t\t\t\t         Press 6  :    Exit                       ");
                        System.out.println("\t\t\t\t\t\t\t         Press 7  :    Return to Main Menu       ");
						
                        System.out.println();
					    System.out.println("\t\t\t\t\t\t\t======================================================");
						System.out.println();
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t                Enter your choice...");
					    System.out.println("\t\t\t\t\t\t\t------------------------------------------------------\n");
                          do{ try{
				          //sc.nextLine();
				    System.out.print("\n\t\t\t\tPlease Select the Appropriate Option...");
					 choice = sc.nextInt();	
					break;
			   }catch(Exception e){
				   System.out.println("\n\t\t\t\tInput Didn't matched \n\n\t\t\t\tPlease  Observe the Number carefully while entering !!!!!\n");
			   }
			   }while(true);
					    
			            sc.nextLine();
			   
                switch(choice){
	   
	                case 1 :do{
									  int choose;
									System.out.println();
									System.out.println("\t\t\t\t********************************************************************************************************");
									System.out.println("\t\t\t\t Press 1 to add songs from playlist OR Press 0  To enter the Song Mannualy  from your Internal/External storage ");
									System.out.println("\t\t\t\t********************************************************************************************************");
									  do{ try{
											   System.out.println();
												System.out.print("\n\t\t\t\tPlease Select the Appropriate Option : ");
												 choose = sc.nextInt();	
												break;
										   }catch(Exception e){
											   System.out.println("\n\t\t\t\tInput Didn't matched \n\n\t\t\t\tPlease  Observe the Number carefully while entering !!!!!\n");
										   }
										   }while(true);
									
									
								
										
										switch(choose){
										
										case 1 :{

													int limit = 1;
											p.display_All_Song();
										System.out.println("\t\t\t\t\t\t\t   (Recommended) Enter the Song Number from List(Only 5 songs are allowed at a time)\n Also you can add songs by entering their name");
										      do{ try{
											   sc.nextLine();
												System.out.print("\n\t\t\t\tselect int val :");
												  num = sc.nextInt();
												  if(num>0 &&num<194){
												String name = p.nameOfSong(num);
									
								           flag1 = p.searchSong(name);
										   mp.addFirst(name);
												 }
												 else{
													 limit = 6;
												 }
                                           									   
												
										   }catch(Exception e){
											   System.out.println("\n\t\t\t\tInput Didn't matched \n\n\t\t\t\tPlease  Observe the Number carefully while entering !!!!!\n");
										   }
										   
										   limit++;	
										   }while(limit<6);
										  
										}break;
										  
										        
										      
							default :  
							
										System.out.println("\n\t\t\t\tEnter the Song Mannualy\nYou can Add one Song only !!!!");
										
										sc.nextLine();
											
										    String name = sc.nextLine();
											mp.addFirst(name);
							
										}
									   
									
								System.out.println();
								System.out.println("\t\t\t\t\t\t\t******************************************************");
										System.out.println();
								System.out.println("\t\t\t\t\t\t\t       Press Y to add more songs to playlist : \n ");
								System.out.println("\t\t\t\t\t\t\t       Press N to return to Playlist Menu    : \n ");
								System.out.println();
									System.out.println("\t\t\t\t\t\t\t******************************************************");
			                        flag2 = sc.next().charAt(0);
									if(flag2=='N'|| flag2=='n'){
										flag2 = 'N';
									}
						}while(flag2!='N'); break;
					
	                case 2 :
					        System.out.println();
					        System.out.println("\t\t\t\t\t\t\t********************************************************");
							System.out.println();
		                    System.out.println("\t\t\t\t\t\t\t                  To Remove Songs     ");
							System.out.println();
							System.out.println("\t\t\t\t\t\t\t********************************************************");
							 mp.displaySongs();
							System.out.println("\n\t\t\t\t\t\t\t     Enter the Song Number to be deleted  :");
							System.out.println("\t\t\t\t\t\t\t--------------------------------------------------------\n");
							int key;
							do{System.out.println("");
								try {//
								 
								 key = sc.nextInt();break;}
										catch(Exception e){
											System.out.println("Wrong input\n Enter correct input please\n");
										}
										}while(true);
							
							if(key==mp.countfixed){
								mp.deleteLast();
							}else{
							
							mp.deleteAtPos(key);
							}
					 System.out.println("\t\t\t\t\t\t\t Song is Deleted successfully");
                 
							System.out.println();
							break;
					   
	                case 3 :
					        System.out.println();
					        System.out.println("\t\t\t\t\t\t\t********************************************************");
							System.out.println();
		                    System.out.println("\t\t\t\t\t\t\t             To Display Playlist Songs ");
							System.out.println();
						    System.out.println("\t\t\t\t\t\t\t********************************************************");
							
							System.out.println();
						    mp.displaySongs();
			                break;
				 
			        case 4 :
					        System.out.println();
					       System.out.println("\t\t\t\t\t\t\t********************************************************");
							System.out.println();
	                        System.out.println("\t\t\t\t\t\t\t                 To Search Song  ");
							System.out.println();
							System.out.println("\t\t\t\t\t\t\t********************************************************");
							System.out.println();
							String name1 = sc.nextLine();
							mp.search(mp.head,name1);
			                break;
					   
	                case 5 :
					        System.out.println("\t\t\t\t\t\t\t********************************************************");
							System.out.println();
		                    System.out.println("\t\t\t\t\t\t\t             To Sort the Songs  ");
							System.out.println();
							System.out.println("\t\t\t\t\t\t\t********************************************************");
						    System.out.println();
								System.out.println("\t\t\t\t\t\t\t      Press 1 to sort from A-Z \n");
								System.out.println("\t\t\t\t\t\t\t      Press 2 to sort from Z-A ");
								int sort;
		                   
								// int key;
							do{try {System.out.println("Enter correct input  \n");
								//sc.nextLine(); 
								 sort = sc.nextInt();
		                        break;
						          }
										catch(Exception e){
											System.out.println("Wrong input\n Enter correct input please\n");
										}
										}while(true);
							
								
								
								
								
							mp.displaySortedSongs(sort);
			                break;
							
					case 6 :
					
					        System.out.println();
                            System.out.println("\t\t\t\t\t\t\t======================================================");
						    System.out.println();
                            System.out.println("\t\t\t\t\t\t\t               Thanks For Visit...");
						    System.out.println();
                            System.out.println("\t\t\t\t\t\t\t======================================================");
			                return;
					        
					
				    case 7 :
							flag = 0;
							break;
							
				    default :
					         
						    System.out.println();
                            System.out.println("\t\t\t\t\t\t\t======================================================");
						    System.out.println();
                            System.out.println("\t\t\t\t\t\t\t                 INVALID ENTRY...");
						    System.out.println();
                            System.out.println("\t\t\t\t\t\t\t======================================================"); 
					 
			
							
							}
						}while(flag !=0);
						 System.out.println("\t\t\t\t\t\t\t               Returning to main Menu....");
							 
							}break;
							
				  
				case 4 :
				        System.out.println("\t\t\t\t\t\t\t********************************************************");
						System.out.println();
	                    System.out.println("\t\t\t\t\t\t\t                    To Search Song  ");
						System.out.println();
					   System.out.println("\t\t\t\t\t\t\t********************************************************");
						System.out.println("\n\t\t\t\t\t\t\t                Enter the name of song \n");
						System.out.println();
						sc.nextLine();
						String name1 = sc.nextLine();
						System.out.println("\t\t\t\t\t\t\t\t\t +++++++++Songs Details++++++++++         \n");
						flag1 = p.searchSong(name1);
						
						if(flag1==1)
							System.out.println("\n\t\t\t\t\t\t\t                  Search found...");
						else{
							System.out.println("\t\t\t\t\t\t\tSong you are searching is not found in list ");
							System.out.println("\t\t\t\t\t\t\tWe are working on updates please stay tuned..!!!");
						}break;
						
						
						
						
						
						
				case 5 :p.display_All_Song();
				        do{System.out.println("\t\t\t\t\t\t\t\t\t Enter the number of the song");
						System.out.println("\t\t\t\t\t\t\t--------------------------------------------------------");
									
									 num = sc.nextInt();
								
					              	 String name = p.nameOfSong(num);
									System.out.println("\t\t\t\t\t\t\t\t +++++++++Songs Details++++++++++         \n");
									
								      flag1 = p.searchSong(name);
									  if(flag1!=0){
										
										 System.out.println("\n\t\t\t\t\t\t\t======================================================"); 
									     System.out.println("\n\t\t\t\t\t\t\t\t         Now Playing song : "); 
										
									    System.out.println("\n\t\t\t\t\t\t\t\t     ==> " +name);
										System.out.println();
										 System.out.println("\t\t\t\t\t\t\t======================================================\n"); 
									  }
								
								
								
								
								else{
									System.out.println("\n\t\t\t\t\t\t\t!!!Cannot find any Song with this name!!!");
									System.out.println("\t\t\t\t\t\t\t!!Please stay tuned for new updates....!!!");
								}
								System.out.println("\t\t\t\t\t\t\tPress any key to play another Song from playlist\n\n\t\t\t\t\t\t\tPress X to return to Main Menu :");
			                        flag2 = sc.next().charAt(0);
									if(flag2=='X'||flag2=='x'){
										flag2 = 'X';
									}
									}while(flag2!='X');
								break;
						
						
						
						
						
						
				case 6 :
				
				        System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t               Thanks For Visit...");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
			            return;
				
				
				
				default :  
				        
						
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t                 INVALID ENTRY...");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
				
				       
		
		        }	
        
	    }while(condition !=0);
                        sc.close();

                        System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t               Thanks For Visit...");
						System.out.println();
                        System.out.println("\t\t\t\t\t\t\t======================================================");
				
    }
	
 }

	
