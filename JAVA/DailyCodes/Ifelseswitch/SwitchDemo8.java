class SwitchDemo8{
	public static void main(String[]args){
		float num=1.5f;
		System.out.println("Before switch case");
		//selector type flost is not allowed
		//posible loossy conversion from double to float
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
