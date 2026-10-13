package oopmodeling;

/**
 * @author$(USER)
 * @created$(DATE)
 */
public class Main {
    public static void main(String[] args) {
        //create three objects
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c3.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

    }
}
