class program3{
	public static void main(String[]args){
		int num=13;
		//int num=8;
		//int num=10;
		if(num%2==1 && num>10){
			System.out.println(num+" is odd number and greater than 10 ");
		}else if(num%2==0 && num<10){
			System.out.println(num+"is even number and less 10 ");
		}else{
			System.out.println(num+" is even and equal to 10");
		}
	}
}
