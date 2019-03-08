import java.util.Scanner;

class Student
{
    int roll;
    String name;
    String branch;
    String dob;
    Student(int roll, String name, String branch){
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        dob = null;
    }
    Student(int roll, String name, String branch, String dob){
        this(roll, name ,branch);
        this.dob = dob;
    }
}

public class testthis
{
    public static void main(String args[])
    {
        Student a = new Student(23, "akash", "IT");
        Student c = new Student(23, "akash", "IT", "14/12/2000");
        System.out.println(c.name);
        System.out.println(c.roll);
        System.out.println(c.branch);
        System.out.println(c.dob);
    }
}