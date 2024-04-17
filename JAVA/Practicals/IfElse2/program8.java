class program8{
	public static void main(String[]args){
		float per=83.67f;
		if(per>=75){
			System.out.println("first class with distinction");
		}else if(per<75.00 && per>=60.00){
			System.out.println("First Class");
		}else if(per<60.00 && per>=50.00){
		       System.out.println("Pass");
		}else if(per<50 && per>=35.00){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}	
