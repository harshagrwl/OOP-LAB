import java.util.Scanner;

class details{
	String id,name;
	int salary;
	Scanner ip = new Scanner(System.in);
	public void output(){
		
		System.out.println("Employee ID : " + id + "Employee name :" + name + "salary : " + salary);
	}
	public void input(){
		
			id = ip.nextLine();
			name = ip.nextLine();
			salary = ip.nextInt();

	}
	
}
class employ{
	public static void main(String[] args){
		
		details d[] = new details[3];
		for (int i = 0;i<3;i++){
			d[i] = new details();
			d[i].input();
		}
		for (int i = 0;i<3;i++){
			d[i].output();
		}

	}
}