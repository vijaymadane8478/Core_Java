class program4{
	public static void main(String[]args){
		float per=83.67f;
		if(per>85){
			System.out.println("medical");
		}else if(per<=85.00 && per>=75.00){
			System.out.println("Engineering");
		}else if(per<=75.00 && per>=65.00){
		       System.out.println("pharmacy or bachelor in science");
		}else{
			System.out.println("study hard");
		}
	}
}	
