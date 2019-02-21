import java.util.Scanner;

class car1{
  int no;
  car1(){
    System.out.println("Enter the model number :");
    Scanner sc = new Scanner(System.in);
    no = sc.nextInt();
  }


}
class car{
  public static void main(String[] args){
    car1 c1 = new car1();
    car1 c2 = new car1();
    int temp;
    temp = c1.no;
    c1.no = c2.no;
    c2.no = temp;
    System.out.println("After Swapping :" + "Car1 : " + c1.no + " Car2 : " + c2.no);
  }
}
