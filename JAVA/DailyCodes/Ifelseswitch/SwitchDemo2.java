class SwitchDemo2{
	public static void main(String[]args){
		int num=5;
		System.out.println("Before switch case");
		switch(num){
			case 1 :
				System.out.println("One");
			case 2 :
				System.out.println("Two");
			case 3 :
				System.out.println("Three");
			case 4 :
				System.out.println("Four");
			default:
				System.out.println("In default State");
		}
		System.out.println("After Switch");
	}
}
