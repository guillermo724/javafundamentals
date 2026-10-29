package oopmodeling;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

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

        long id;
        Book b1=
                new Book( 12, "Beyonf good and evil");
        System.out.println(b1.category);
        b1.category="science fiction";
        System.out.println(b1.category);


        // Objeto 1: constructor por defecto
        Book b2 = new Book();
        b1.category = "Terror";

        // Objeto 2: constructor con dos parámetros
        Book b3 = new Book(2, "El Quijote");
        b2.category = "Novela Histórica";

        // Objeto 3: constructor completo
        Book b4 = new Book(3, "La República",
                "Platón", "Editorial Clásica",
                "380", "Filosofía");

        // Mostrar las categorías por consola
        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}