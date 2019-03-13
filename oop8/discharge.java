import java.util.Scanner;

class hospital{
	String name = "Fortis Hospital";
	String add = "Sector 16, Noida";
	String num = "011-4125963";

}
class patient extends hospital{
	String pname;
	int age;
	String illness;
	String date;
	int fee;
	Scanner sc = new Scanner(System.in);
	void input(){
		pname = sc.next();
		age = sc.nextInt();
		illness = sc.next();
		date = sc.next();
		fee = sc.nextInt();
	}
	void output(){
		System.out.println("Hospital Details :");
		System.out.println("Hospital Name :" + name );
		System.out.println("Hospital Address :" + add );
		System.out.println("Hospital Phone number :" + num );
		System.out.println("Paitient Details :" + name );
		System.out.println("Name :" + pname );
		System.out.println("Age :" + age );
		System.out.println("Illness :" + illness );
		System.out.println("Discharge Date :" + date );
		System.out.println("Fees Charged :" + fee );
	}

}
class discharge{
	public static void main(String[] args){
		patient p = new patient();
		p.input();
		p.output();
	}
}