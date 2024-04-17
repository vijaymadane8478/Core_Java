class SwitchDemo6{
	public static void main(String[]args){
		int num=1;
		System.out.println("Before switch case");
		switch(num){
			case 1 :
				System.out.println("One");
				//break;
			case 2 :
				System.out.println("Two");
				break;
			case 3 :
				System.out.println("Three");
				break;
			case 4 :
				System.out.println("Four");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("After Switch");
	}
}
