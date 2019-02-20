import java.util.Scanner;

public class gcd{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int n1 = ip.nextInt();
		int n2 = ip.nextInt();
		int gcd = 1;
		int l = n1;
		if(l > n2)
			l = n2;
		for(int i=1;i<=l;i++){
			if(n1%i == 0 && n2%i == 0)
				gcd = i;
		}
		System.out.println("The GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
}
