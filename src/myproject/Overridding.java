package myproject;


class Animals {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Cat extends Animals {
   public void move() {
      super.move();   // invokes the super class method
      System.out.println("Cats can walk and run");
   }
}

public class Overridding{

   public static void main(String args[]) {
      Animals b = new Cat();   // Animal reference but Dog object
      b.move();   // runs the method in Dog class
   }
}

