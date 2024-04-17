class program8{
	public static void main(String[]args){
		int num1=5;
		int num2=6;
		if(num1<0 || num2<0){
			System.out.println("Entered number are negative");
		}
		int product=num1*num2;
		System.out.println("product is "+product);
		int choice=1;
		switch(choice){
			case 1:
				if(product%2==0){
					System.out.println("The product is even");
				}else {
					System.out.println("The product is odd");
				}
				break;
			default:
				System.out.println("invalid input");
				break;
				}
	}
}
