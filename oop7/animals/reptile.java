import animals.Animal;

public class reptile implements Animal {

   public void eat() {
      System.out.println("Reptile can eat");
   }

   public void travel() {
      System.out.println("Reptile can travel");
   } 


   public static void main(String args[]) {
      reptile r = new reptile();
      r.eat();
      r.travel();
   }
} 