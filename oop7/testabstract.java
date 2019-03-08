import java.util.Scanner;

abstract class Figures
{
    float dim1, dim2;

    Figures()
    {
        Scanner inp = new Scanner(System.in);
        dim1 = inp.nextFloat();
        dim2 = inp.nextFloat();
    }

    abstract float area();
}

class Rectangle extends Figures
{
    float area()
    {
        return dim1 * dim2;
    }
}

class Triangle extends Figures
{
    float area()
    {
        return dim1 * dim2 * 0.5F;
    }
}

public class testabstract
{
    public static void main(String args[])
    {
        Triangle t = new Triangle();
        System.out.println("Area of the triangle is :" + t.area());
        Rectangle r = new Rectangle();
        System.out.println("Area of the rectangle is :" + r.area());
    }
}