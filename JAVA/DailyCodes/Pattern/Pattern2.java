//1 4 3 16 5 36 7 64 9
class Pattern2{
	public static void main(String[]args){
		int num=10;
		for(int i=1;i<num;i++){
			if(i%2==0){
				System.out.print(i*i+" ");
			}else{
				System.out.print(i+" ");
			}
		}
	System.out.println();
	}
}
