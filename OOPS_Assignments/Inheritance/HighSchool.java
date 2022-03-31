	import java.util.Scanner;
	
	class Person{
		String name;
		String gender;
		int age;
		
		
		
		Person(){
			System.out.println("Enter the Details...........");
			System.out.println("=============================");
		}
	}
	class Student extends Person {
		String id;
		{
			System.out.println("Enter Student's Details");
		}
		Student(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			this.name = sc.next();
			System.out.println("Enter Gender:");
			this.gender = sc.next();
			System.out.println("Enter Age:");
			this.age = sc.nextInt();
			System.out.println("Enter ID:");
			this.id = sc.next();
			
		}
	}

	class Teacher extends Person{
	  double salary;
	  String subject;
	   {
			  System.out.println("Enter Teacher's data ............. ");
		  }
	  Teacher(){
		 
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			this.name = sc.next();
			System.out.println("Enter Gender:");
			this.gender = sc.next();
			System.out.println("Enter Age:");
			this.age = sc.nextInt();
		  System.out.println("Enter Salary :");
		  this.salary = sc.nextDouble();
		  System.out.println("Enter Subject :");
		  this.subject =sc.next();
	  }
	  
	  void printDetails(){
		  System.out.println("Teacher's Name :"+this.name);
		  System.out.println("Teacher's Gender :"+this.gender);
		  System.out.println("Teacher's age :"+this.age);
		  System.out.println("Teacher's Salary :"+this.salary);
		  System.out.println("Teacher's Subject :"+this.subject);
		  System.out.println();
	  }
	}

	class CollegeStudent extends Student{
		int year;
		String major;
		
		
		CollegeStudent(){
			
			super();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Current Year :");
			this.year = sc.nextInt();
			System.out.println("Enter Major :");
			this.major = sc.next();
		}
		
		void printDetails(){
			System.out.println("Student's Name :"+this.name);
		  System.out.println("Student's Gender :"+this.gender);
		  System.out.println("Student's age :"+this.age);
		  System.out.println("Student's ID :"+this.id);
		  System.out.println("Student's Current Year  :"+this.year);
		  System.out.println("Student's major :"+this.major);
		  System.out.println("==============================");
	} 
	}
	
	
	class HighSchool{
		public static void main(String[]args){
			Teacher t = new Teacher();
			t.printDetails();
			CollegeStudent s = new CollegeStudent();
			s.printDetails();
			CollegeStudent t2 = new CollegeStudent();
			t2.printDetails();
		}
	}
