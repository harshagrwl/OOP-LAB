import java.util.Scanner;

class area1{
	double r,l,b,a;
	area1(double rad){
		r = rad;
		a = (2)*(3.141)*r;
		System.out.println("Area of circle is: " + a);
	}
	area1(double len, double bre){
		l = len;
		b = bre;
		a = l*b;
		System.out.println("Area of rectangle is: " + a);
	}

}
class area{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double rad = s.nextDouble();
		double len = s.nextDouble();
		double bre = s.nextDouble();
		area1 x = new area1(rad);
		area1 y = new area1(len,bre);
		
	}
}