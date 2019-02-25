class person{
    String name;
    int age;
    public void setdata(String s, int n){
        name = s;
        age = n;
    }
    public void setdata2(String s2, int n2){
        name = s2;
        age = n2;
    }
}
class employee extends person{
    String code;
    String dept;
    int experience;
    public void setdata(String s, String s1, int n){
        code = s;
        dept = s1;
        experience = n;
    }
    public void setdata2(String s2, int n2){
        code = s2;
        experience = n2;
    }
    public void print(){
        System.out.println("Name : " + name + "Age : " + age + "code : " + code + " department : " + dept + "Years of experience : " + experience);
    }
}
class inheritance{
    public static void main(String[] args){
        employee e1 = new employee();
        e1.setdata("rakesh", 35);
        e1.print();
        employee e2 = new employee();
        e2.setdata("qwerty123", "Researchdev", 4);
        e2.print();
        employee e3 = new employee();
        e3.setdata2("Rakesh" , 36);
        e3.print();
    }
}