import java .util.*;
class OnedArray{
	public static void main(String[]args){
		int empId = new int[3]; //Incompatible types int[] cannot converted to int
		empId[0]=10;
		empId[1]=20;
		empId[3]=30;
		System.out.println(empId[0]); 
		System.out.println(empId[1]); 
		System.out.println(empId[2]);
	}
}	
