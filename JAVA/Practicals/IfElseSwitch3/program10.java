class program10{
	public static void main(String[]args){
		String name="Vijjo";
		float Balance=5913.11f;
		String bankName="MahrashtraBank";
		String Actype="Savings";
		Balance=Balance+15.99f;
	       	int ch=1;
		switch(ch){
			case 1:
				System.out.println("Name is "+name);
				break;
			case 2:
				System.out.println("Balance is "+Balance);
				break;
			case 3:
				System.out.println("Account Type"+Actype);
				break;
			case 4:
				System.out.println("Bank Name "+bankName);
				break;
			case 5:
				System.out.println("updated Balance"+Balance);
				break;
			default:
				System.out.println("Ente valid input");
				break;
		}
	}
}

