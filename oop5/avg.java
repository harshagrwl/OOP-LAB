import java.util.Scanner;

public class avg{
	public static void main(String[] args){
		double sum = 0;
		double[] numArray = { 65.0, 67.5, -45.0, 25.00, 33.0, 45.6 };
		for(int i =0; i < numArray.length; i++){
			sum +=numArray[i];
		}
		double avg = sum/numArray.length;
		System.out.println("The average of the terms of array is: " + avg);
	}
}