package fundamentals;
/**
 * 
11 sept 2026
Guillermo
 */
public class VariableTest {
	
	public static void main(String[] args) {
		
	//the structure of the declaration of a variable:
	//type of the variable + name of the variable;
	// = is the assignment operator
       String name = "Guille";
       System.out.println(name);
       System.out.println(1223123);
       System.out.println("Hola java");
       name = "Asier";
       System.out.println(name);
       //Declaration of an integer variable
       //an integer has 4 bytes
       //1 byte is 8 bits
       int age = 23432432;
       long weight = 234324234324l;//a long variable has 8 bytes
       float height = 23.3f;// a float variable holds 4 bytes
       double b = 324.24234234;//a double has 8 bytes
       byte a = -127;// a byte has only one byte of capacity
       
       //increase the value of "age" by 10
       age = age + 10;
       System.out.println(age);
       age = age * 10;// * multiplication operator
       System.out.println(age);
       weight = weight - 1000000;
       System.out.println(weight);
       height = height / 100;// division
       System.out.println(height);
       
       a = 3;
       b = 4;
       System.out.println("the square of a =" + a * a);
       System.out.println("the square of b =" + b * b);
       System.out.println("the square of c =" + a * a + b * b);
       
       final int SPEED_OF_LIGHT = 300000000;
       float mass = 2.5f;
//     SPEED_OF_LIGHT = 234;
       
       a = 4;
       b = 6;
       System.out.println("the square of b =" + b * b);
       System.out.println("the square of c =" + a * b * b);
    }




    public static void main(String[] args) {

        // Declaración de variables
        int edad = 18;
        double dinero = 50.50;
        String nombre = "Guillermo";
        boolean estudiante = true;

        // Modificación de variables
        edad = 18;
        dinero = dinero + 25.50;
        nombre = "Guillermo López";
        estudiante = false;

        // Nuevas modificaciones
        edad = edad + 1;
        dinero = dinero - 10;
        estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dinero: " + dinero);
        System.out.println("Estudiante: " + estudiante);
    }
}