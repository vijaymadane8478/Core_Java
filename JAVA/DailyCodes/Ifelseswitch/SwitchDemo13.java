class SwitchDemo13{
	public static void main(String[]args){
		int x=50;
		//duplicate case label
		System.out.println("Before switch case");
		switch(x){
			case 20+30 :
				System.out.println("20+30");
				break;
			case 25+25 :
				System.out.println("25+25");
				break;
			case 50:
				System.out.println("50");
				break;
			default:
				System.out.println("default");
		}
		System.out.println("After Switch");
	}
}
