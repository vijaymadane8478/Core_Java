class SwitchDemo12{
	public static void main(String[]args){
		Boolean X=true;
		//incompatible types boolean cannot be conveted to int
		System.out.println("Before switch case");
		switch(true){
			case true :
				System.out.println("true");
				break;
			case false :
				System.out.println("false");
				break;
			default:
				System.out.println("default");
		}
		System.out.println("After Switch");
	}
}
