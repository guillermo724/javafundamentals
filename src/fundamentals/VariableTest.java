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
    }

}