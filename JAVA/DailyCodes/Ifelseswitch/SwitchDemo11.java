class SwitchDemo11{
	public static void main(String[]args){
		String friends="kanha";
		System.out.println("Before switch case");
		switch(friends){
			case "Ashish" :
				System.out.println("Barclays");
				break;
			case "kanha" :
				System.out.println("BMC Software");
				break;
			case "badhe" :
				System.out.println("IBM");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("After Switch");
	}
}
