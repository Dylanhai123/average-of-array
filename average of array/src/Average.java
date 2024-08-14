import java.util.Arrays;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [] {6, 6, 9, 4, 2};// declare an integer array with values
		//Average: 1. sum 2. number of elements
		
		double sum = 0.0; 
		
		//loop : to iterate through all the elements
		
	   for (int i = 0; i<arr.length; i++) { 
		  sum=sum+ arr[i]; 
	   }
	   
	double average = sum/arr.length;
	System.out.println(average);
	
	System.out.println(Arrays.toString(arr));
	}

}
