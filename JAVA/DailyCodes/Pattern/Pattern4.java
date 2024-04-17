//1 8 9 64 25 216
class Pattern4{
	public static void main(String[]args){
		int num=10;
		for(int i=1;i<num;i++){
			if(i%2==0){
				System.out.print(i*i*i+" ");
			}else{
				System.out.print(i*i+" ");
			}
		}
	System.out.println();
	}
}
