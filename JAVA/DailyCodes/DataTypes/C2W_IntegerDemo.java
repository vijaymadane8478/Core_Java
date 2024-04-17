class C2W_IntegerDemo{
	public static void main(String[]args)
	{
		int numInt='a';
		float numFloat=numInt;
		System.out.println(numFloat);
		//Possible lossy converion from double to float
		numFloat=20.005;
		System.out.println(numFloat);
	}
}
