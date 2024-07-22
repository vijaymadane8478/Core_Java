class Demo1{
	Demo1(){
		System.out.println("1");
	}
}
class Demo2 extends Demo1{
}
class Demo3 extends Demo2{
	Demo3(){
		super();
		System.out.println("3");
	}
}
class program3{
	public static void main(String[]arg){
		Demo1 obj = new Demo3();
	}
}
