
class TwoDarray11{
	public static void main(String[]args){
		int arr1[][]={{10,20},{30,40,50}};

		System.out.println(arr1[0][0]); //10
		System.out.println(arr1[1][0]); //30
		System.out.println(arr1[1][2]); //50
		System.out.println(arr1[0][2]); //ArrayindexoutofBoundException
	}
}
