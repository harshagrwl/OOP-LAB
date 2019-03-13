import java.util.Scanner;

public class revarr{
	static void reverse(int []a, int n){
		int [] b = new int [n];
		int k = n;
		for(int i = 0; i<n;i++){
			b[k-1] = a[i];
			k = k-1;
		}
		System.out.println("The reversed array is: ");
		for (int j = 0; j<n ; j++){
			System.out.println(b[j] );
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for (int p = 0; p<n;p++){
			a[p] = sc.nextInt();
		}
		reverse(a,n);
	}
}