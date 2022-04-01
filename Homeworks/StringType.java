


class StringType                            // String
{
	public static void main(String []args)
	{
		String a = "Ajmer";
        String b = "Ajmera";
       	System.out.println(a.toLowerCase());	// ajmer

		System.out.println(b.toUpperCase());   // AJMERA
		
		System.out.println(a.concat(b));       // AjmerAjmera
		System.out.println(a.length());        //  5
		
		String c = "   Space   ";
		String d = "";
		String e = "hello";
		
		System.out.println(c.trim());             // Space
		System.out.println(d.isEmpty());           // true
		System.out.println(e.isEmpty());           // false
		
		System.out.println(a.charAt(2));           // m
		System.out.println(a.indexOf('j'));
		
		System.out.println(a.equals(b));		// false
		System.out.println(e.replace('l','y'));   // heyyo
		
		
		
	}
}



