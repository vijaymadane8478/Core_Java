import java.io.*;

class InputDemo14{
	public static void main(String[]args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	        
		System.out.println("Enter emp Name: ");
		String empname= br.readLine();                            
		System.out.println("Name: "+empname);
	        
		//br.close(); //IOException Stream Closed

		System.out.println("Enter emp id: ");
		int empid= Integer.parseInt(br.readLine());                             
		System.out.println("Name: "+empid);
		
		System.out.println("Enter comp Name: ");
		String compname= br.readLine();                            
		System.out.println("commpName: "+compname);
	}
}
