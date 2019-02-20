import java.util.Scanner;

public class avg1{
	public static void main(String[] args){
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		double[] numArray = new double[len];
		for(int i = 0;i<len;i++){
			numArray[i] = scan.nextDouble();
		}
		for(int i =0; i < numArray.length; i++){
			sum +=numArray[i];
		}
		double avg = sum/numArray.length;
		System.out.println("The average of the terms of array is: " + avg);
	}
}