interface Drawable{ 

    void draw();  

}  
class Rectangle implements Drawable{  

    public void draw(){System.out.println("drawing a rectangle");}  

}  
class Circle implements Drawable{

    public void draw(){System.out.println("drawing a circle");}  

}  
class testinterface{  

    public static void main(String args[]){  

        Drawable d=new Circle();
        Drawable d1=new Rectangle();
        d.draw();
        d1.draw();
    }
}  