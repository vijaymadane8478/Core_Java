import java.io.*;

class InputDemo6{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
	        char x= isr.read();                             //possible lossy converion from int to char
		System.out.println(x);
	}
}
