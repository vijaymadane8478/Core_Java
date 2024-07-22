//take user inpput
//find factors of number
//e.g  12 (1,2,3,4,6,12)

import java.util.*;

class findfactors{

	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number: ");
	int num= sc.nextInt();
	System.out.print("Factors of"+num+"are: ");
	for(int i=1;i<=num;i++){
		if(num%i==0){
			System.out.print(i+", ");
			}

		}
	}
}

