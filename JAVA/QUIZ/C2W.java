class c2w2{
	c2w2(client obj){
		this(10);
		System.out.println(obj);
		System.out.println("In C@W");
	}

	c2w2(int x){
		this(null);
		System.out.println("in c2w"+x);
	}

	public static void main(String[]arg){
		c2w obj = new c2w(1);
		c2w obj1 = new c2w(obj1);
	}
}

