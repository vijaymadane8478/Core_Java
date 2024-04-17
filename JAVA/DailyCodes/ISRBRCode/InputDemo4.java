import java.io.*;

class InputDemo4{
	public static void main(String[]args){
		InputStreamReader isr = new InputStreamReader(System.in);
	       int x= isr.read();	  //read() method throws exception which must be caught or declared to be thrown     
	}
}
