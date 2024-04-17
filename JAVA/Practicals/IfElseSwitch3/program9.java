class program9{
	public static void main(String[]args){
		int sub1=95;
		int sub2=95;
		int sub3=95;
		int sub4=95;
		int sub5=95;
		if(sub1<35 || sub2<35||sub3<35||sub4<35||sub5<35){
			System.out.println("Your failed exam");
		}
		int totalSum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total is "+totalSum);
		int choice=1;
		switch(choice){
			case 1:
				if(totalSum>=75){
					System.out.println("Firstclass With Distinction");
				break;
				}
			default:
				System.out.println("invalid input");
				break;
				}
	}
}
