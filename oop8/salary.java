import java.util.Scanner;

class employee{
	int basesalary = 10000;
	int hourlysalary = 250;
	int share = 8000;
}
class salaried extends employee{
	int spay = basesalary;
}
class hourly extends employee{
	int hours;
	int hpay;
	Scanner sc = new Scanner(System.in);
	hourly(){
		System.out.println("Enter the no. of hours :");
		hours = sc.nextInt();
	
	if (hours <= 40){
		hpay = hours*hourlysalary;
	}
	else
		hpay = (hours*hourlysalary + (hours-40)*100);
	}

}
class commision extends employee{
	int cpay = share;
}
class scomm extends employee{
	int scpay = (share + (11*basesalary)/10);
}

public class salary{
	public static void main(String[] args){
		salaried s = new salaried();
		System.out.println("Salaried Employee :" + "Rs." + s.spay);
		hourly h = new hourly();
		System.out.println("Hourly Employee :" + "Rs." + h.hpay);
		commision c = new commision();
		System.out.println("Commisioned Employee :" + "Rs." + c.cpay);
		scomm sc = new scomm();
		System.out.println("Salaried-Commisioned Employee :" + "Rs." + sc.scpay);
	} 
}