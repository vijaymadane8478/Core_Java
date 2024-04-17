class SwitchDemo9{
	public static void main(String[]args){
		char data='B';
		System.out.println("Before switch case");
		switch(data){
			case 'A' :
				System.out.println("A");
				break;
			case 'B' :
				System.out.println("B");
				break;
			case 'C' :
				System.out.println("C");
				break;
			case 'D' :
				System.out.println("D");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("After Switch");
	}
}
