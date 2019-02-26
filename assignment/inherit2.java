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
    int experience;
  
    employee (String s2, int n2){
        code = s2;
        experience = n2;
    }
   
}
class manager extends employee{
    String add;
    int no;

    manager (String s1, int n1){
        add = s1;
        no = n1;
    }
     public void print(){
        System.out.println("Name : " + name + "Age : " + age + "code : " + code + "Years of experience : " + experience + " Address: " + add + "number : " + no);
    }
}
public class inherit2 {
    public static void main(String args[]){
        manager e1 = new manager("rakesh", 35);
        e1.print();
        employee e2 = new employee("rakesh", 35);
        /*e2.print();*/
        person e3 = new person("rakesh", 35);
        //e3.print();
        
    }
}