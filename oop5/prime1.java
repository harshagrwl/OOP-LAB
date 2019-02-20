import java.util.Scanner;


public class prime1{
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean flag = false;
		for(int i = 2 ; i < num/2 ; i ++){
			if(num == 1){
				System.out.println(num + " is neither prime nor composite.");
			}
			else if(num%i==0 && num!=1){
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
