import java.util.Scanner;

class owner{
	String name;
	String add;
	
}
class vehicle extends owner{
	String date;
	String num;
	String color;
	String class1;
	String fuel;
	String mdate;
	Scanner sc = new Scanner(System.in);
	void input(){
		name = sc.next();
		add = sc.next();
		date = sc.next();
		num = sc.next();
		color = sc.next();
		class1 = sc.next();
		fuel = sc.next();
		mdate = sc.next();
	}
}
public class rto{
	public static void main(String[] args){
	int i,j,p;
	vehicle v[] = new vehicle[2];
	Scanner sc1 = new Scanner(System.in);
	public void search(){
		for (i=0;i<2;i++){
			v[i].input();
		}

		System.out.println(" Enter the vehicle number you want to find : ");
		String no = sc1.next();
		for (j = 0;j<2;j++){
			if(no == v[j].num){
				j = p;
				System.out.println("Vehicle found!");
			}
			
		}
				System.out.println("Vehicle found!");
				System.out.println("Owner Details: " + " Name :" + v[p].name + " Address:" + v[p].add);
				System.out.println("Vehicle details: ");
				System.out.println("Reg. Date " + v[p].date);
				System.out.println("Reg. num " + v[p].num);
				System.out.println("color " + v[p].color);
				System.out.println("class " + v[p].class1);
				System.out.println("fuel " + v[p].fuel);
				System.out.println("manufacturing date " + v[p].mdate);
			}
		}
}
	

