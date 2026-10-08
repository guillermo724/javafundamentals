package basics.operator;

/**
 * @author$(USER)
 * @created$(DATE)
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());

    }
}
