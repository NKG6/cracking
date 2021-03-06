class Base {
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Base {
    public void display() {
        System.out.println("Non-static method from Derived");
    }
    // Static is added here (Causes Compiler Error) 
    public static void print() {
        System.out.println("Static method from Derived");
   }
}
 
public class Overide {
    public static void main(String args[ ])  {
       Bases obj1 = new Deriveds();
       obj1.display();  
       obj1.print();     
    }
}