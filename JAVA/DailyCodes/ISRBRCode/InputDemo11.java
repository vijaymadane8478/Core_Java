import java.io.*;

class InputDemo11{
	public static void main(String[]args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	        
		System.out.println("Enter Name: ");
		String name= br.readLine();                            
		System.out.println("Name: "+name);
	        
		//br.close(); //IOException Stream Closed

		System.out.println("Enter compName: ");
		String compname= br.readLine();                            
		System.out.println("commpName: "+compname);
	}
}
