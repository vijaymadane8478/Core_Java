class SwitchDemo7{
	public static void main(String[]args){
		float num=1.5;
		System.out.println("Before switch case");
		//posible loossy conversion from int to float
		switch(num){
			case 1.5 :
				System.out.println("1.5");
				break;
			case 2.0 :
				System.out.println("2.0");
				break;
			case 2.5 :
				System.out.println("2.5");
				break;
			case 3.0 :
				System.out.println("3.0");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("After Switch");
	}
}
