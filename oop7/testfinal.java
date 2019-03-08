import java.util.Scanner;

class Circle
{
    float rad;
    final float PI = 3.14F;

    Circle()
    {
        Scanner inp = new Scanner(System.in);
        rad = inp.nextFloat();
    }

    final float area()
    {
        return PI * rad * rad;
    }

    /*void try_PI_change()
    {
        PI = 2;
    }*/
}

class Derived_Circle extends Circle
{
    /*float area()
    {
        return 2 * PI * rad;
    }*/
}

public class testfinal
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        System.out.println("Area of the circle is: " + c.area());
    }
}