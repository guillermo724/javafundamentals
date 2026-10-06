package fundamentals;

public class AutomatizationLoop {
	public static void main(String[] args) {
        int acumulador =10;
        int contadorPares=0;
        int paso=0;
        for(int i=0;i<6;i++) {

            if (i % 2 == 0) {
                acumulador = acumulador + i;
                contadorPares++;
            } else {
                acumulador = acumulador - 1;
            }
        }
            System.out.println("fin del programa");

        }
    }