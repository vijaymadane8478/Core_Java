import java.io.*;

class InputDemo9{
	public static void main(String[]args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	        System.out.println("Enter Name: ");
		String name= br.readLine();                            
		System.out.println("Name: "+name);
	        
		System.out.println("Enter compName: ");
		String compname= br.readLine();                            
		System.out.println("commpName: "+compname);
	}
}
