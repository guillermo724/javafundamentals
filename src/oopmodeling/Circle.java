package oopmodeling;

/**
 * @author$(USER)
 * @created$(DATE)
 */
public class Circle {
    //main properties or attributes of the objects of a class
    private float radius;

    public final float PI = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    float area() {
        return PI * radius * radius;
    }

    public float circumference() {
        return 2 * PI * radius;
    }

}
