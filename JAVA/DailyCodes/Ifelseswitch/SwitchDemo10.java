class SwitchDemo10{
	public static void main(String[]args){
		char data='B';
		System.out.println("Before switch case");
		//error duplicate case label
		switch(data){
			case 'A' :
				System.out.println("A");
				break;
			case 65 :
				System.out.println("65");
				break;
			case 'B' :
				System.out.println("66");
				break;
			case 'C' :
				System.out.println("67");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("After Switch");
	}
}
