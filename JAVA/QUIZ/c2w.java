class c2w{
	c2w(client obj){
		c2w(1000);
	}
	c2w(int x){
		System.out.println(x);
	}
	c2w(){
	}
}
class client{
	public static void main(String[]arg){
		c2w obj1 = new c2w();
		c2w obj = new c2w(obj1);
	}
}

