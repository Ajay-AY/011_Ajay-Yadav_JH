class Patient{
	String name;
	double weight,height;
	
	Patient(double weight , double height){
		this.weight = weight;
		this.height = height;
	}
	
}




 class newPatient extends Patient{
	 
	 newPatient(double weight , double height){
		 super(weight,height);
		 
	 }
	 
	 double BMI(){
		 return (((this.weight)/(this.height*this.height))*703);
	 }
 }
 
 
 
 class Health{
	public static void main(String[]args){
		newPatient p = new newPatient(10.0,20.0);
		System.out.println("BMI of Patient is : "+p.BMI());
		
		
		/*OUTPUT 
		
		BMI of Patient is : 17.575
		
		
	}
}