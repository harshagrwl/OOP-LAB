class person{
    String name;
    int age;
    person (String s, int n){
        name = s;
        age = n;
    }
}
class employee extends person{
    String code;
    String dept;
    int experience;
  
    employee (String s2, int n2){
        code = s2;
        experience = n2;
    }
    public void print(){
        System.out.println("Name : " + name + "Age : " + age + "code : " + code + " department : " + dept + "Years of experience : " + experience);
    }
}
public class const1 {
    public static void main(String args[]){
        employee e1 = new employee("rakesh", 35);
        e1.print();
        employee e2 = new employee("rakesh", "qwerty", 5);
        e2.print();
        employee e3 = new employee("qwerty", "research", 6);
        e3.print();
    }
}