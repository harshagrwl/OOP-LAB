import java.util.Scanner;

class father{
	String name;
	int age;
	father(){
		Scanner inp = new Scanner(System.in);
		age = inp.nextInt();
		name = inp.next();
		//name = name1;
		//age = age1;
	}
}
class son extends father{
	String name;
	int age;
	son(){
		super();
		Scanner inp1 = new Scanner(System.in);
		age = inp1.nextInt();
		name = inp1.next();
		//name = name2;
		//age = age2	;
	}
	public void disp(){
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
class testsuper{
	public static void main(String[] args){
		son s = new son();
		s.disp();
	}
}