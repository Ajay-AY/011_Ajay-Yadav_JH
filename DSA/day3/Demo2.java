	class Demo2{
     
	 static void display(String word,String ans){
		 if(word.length() == 0)
			 System.out.println(ans);
		 for(int i=0;i<word.length();i++){
														// How loop works....
		 char letter = word.charAt(i);         // A           //  B        // C             // if(true)
		 String left = word.substring(0,i);	   // null		  //  null	   // null	        // sop(ABC)
		 String right = word.substring(i+1);   // B C         //  C        // null
		 String newWord = left+right;          // B C         //  C        // null
		 display(newWord, ans+letter);         // (BC , A)    // (C , AB)   // (null, ABC)
		   
		 }
	 }
	 
	 
	 public static void main(String[] args){
		 String s = "ABC";                            //  A  B  C 
		 display(s,"");								  //  0  1  2
	 }

	}