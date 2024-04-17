class program9{
	public static void main(String[]args){
		int num=150;
		int sum=0;
		while(num>=101){
			if(num%2==1){
				sum+=num;
			}
			num--;
		}
		System.out.println("Sum of odd num from 150 to 101 is "+sum);
	}
}
