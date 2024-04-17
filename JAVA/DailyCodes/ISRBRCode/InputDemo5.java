import java.io.*;

class InputDemo5{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
	        int x= isr.read();                             //if we give input Ashsish it will read its char value 65   
		System.out.println(x);
	}
}
