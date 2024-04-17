class program6{
	public static void main(String[]args){
		char ch=65;
		while(ch<=90){
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				continue;
			}else{
				System.out.println(ch+" ");
			}
			ch++;
		}
	}
}
