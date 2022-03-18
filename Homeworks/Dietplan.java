import java.util.*;

class  Dietplan
{
	String gender;
	int age;
	float weight,height;
	
	Dietplan()
	{
		this(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data for Dietplan");
		System.out.print("Enter the Gender M/F: ");
		String s = sc.next();
		System.out.print("Enter the Age : ");
		int a = sc.nextInt();
		System.out.print("Enter the Weight in Kg: ");
		double d1 = sc.nextDouble();
		System.out.print("Enter the Height in cm: ");
		double d2 = sc.nextDouble();
		setdata(s,a,d1,d2);
		
	}
	Dietplan(int a )
	{ 
		
		System.out.println("Welcome to The Dietplan Program of 2 Months");
		System.out.println("Note: Enter the data in meters and kgs where required!!");
		System.out.println("=======================================================================");
		
		
	}
	
	Dietplan(String gender,int age,double weight,double height)
	{
		this();
		this.gender = gender;
		this.age = age;
		this.weight = (float)weight;
		this.height = (float)height;
	}
	
	void setdata(String gender,int age,double weight,double height)
	{
		this.gender = gender;
		this.age = age;
		this.weight =(float) weight;
		this.height =(float) height;
	}
	
	void getdata()
	{
		System.out.println("Data Entered..............");
		System.out.println("Gender is : "+gender);
		System.out.println("Age is : "+age);
		System.out.println("Weight is : "+weight);
		System.out.println("Height is : "+height);

	}
	
	void calculateBmi()
	{
		float bmi = (float) (weight/(height*height/10000));
		System.out.printf("Body Mass Index is : %.2f %n",bmi);
		checkbmi(bmi);
		
	}
	
	void checkbmi(float x)
	{
		if(x<=18.5)
		{
			System.out.println("You comes in the  Underweight Range !!!!!!!!!!!!!!!!!!");
			maintenance();
		}
		else if(x>18.5&&x<=25)
		{
			System.out.println("You comes in the Normal Range .................. ");
		}
		else if(x>25)
		{
			System.out.println("You comes in the Overweight Range !!!!!!!!!!!!!!!!!!");
			maintenance1();
		}
	}
	
	void maintenance()
	{
		float wtarget = (float)(height*height/10000)*25;
		float rtarget = (float)(weight-wtarget);
		int bmr = (int)((10*weight)+(6.25*height/100)-(5*age)+5);
		int mcal = (int)(bmr + 400);
		int redrate = 2;
		int tframe = (int)(rtarget/redrate);
		int required = (int) (bmr/tframe);
		int dailydiet = 2000-required;
		System.out.println("Your Daily Diet should contain atleast "+dailydiet+" Calories per day for 2 months");
		
	}
	
	void maintenance1()
	{
		float wtarget = (float)(height*height/10000)*25;
		float rtarget = (float)(wtarget-weight);
		int bmr = (int)((10*weight)+(6.25*height/100)-(5*age)+5);
		int mcal = (int)(bmr + 400);
		int redrate = 2;
		int tframe = (int)(rtarget/redrate);
		int required = (int) (bmr/tframe);
		int dailydiet = 2000-required;
		System.out.println("Your Daily Diet should not exceed  "+dailydiet+" Calories per day for 2 months");
		
	}
	
	
	
	public static void main(String []args)
	{
	    Dietplan d = new Dietplan();
		d.getdata();
		d.calculateBmi();
	}
}
