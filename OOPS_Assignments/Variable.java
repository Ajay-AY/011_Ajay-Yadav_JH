
//Assign a decimal,octal,hexadecimal values to variables and print.
// Asssign unicode value to char variable and print.

class Variable{
		public static void main(String []args){
			int a = 020;
			int b = 0x20;
			int c = 0X10;
			int d = 020;
			int a1 = (char)'\ucdac';
			char ch = '\u0061';
			int e = 0B1010;
			System.out.println(a+" "+b+" "+c+" "+d+" "+a1+" "+e+" "+ch);
		
			
		}
}