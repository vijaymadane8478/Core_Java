class program7{
	public static void main(String[]args){
		int sellingPrice =1200; //300 900
		int costPrice =1000;   //500  900
		int profit = sellingPrice-costPrice;
		int loss  = costPrice-sellingPrice;
		if(sellingPrice>costPrice){
			System.out.println("Profit of "+profit);
		}else if(costPrice>sellingPrice) {
			System.out.println("Loss of "+profit);
		}else{
			System.out.println("No profit no loss");
	}
	}
}
