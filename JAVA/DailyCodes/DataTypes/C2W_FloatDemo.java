class C2W_FloatDemo{
	public static void main(String[]args)
	{
		int num1='Z';
		float num2 =num1;
		//float num2= num1;
		System.out.println(num2);

		int num3='z';
		float num4=num3;
		System.out.println(num4);

		/*
		 * Possible loosy converion from double to float
		double num5=90.89D;
		System.out.println(num5);
		float num6 = num5;
		System.out.println(num6);
		*/

		int num7= 959697;
		float num8 =959697.12345f;
		double num9=num8;
	        System.out.println(num7);
		System.out.println(num8);
		System.out.println(num3);

	}
}
