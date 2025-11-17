import java.util.Scanner;
public class anhoBisiesto {
    public static void main(String[] args) {
        System.out.println("Introduce un año");
        Scanner lector = new Scanner(System.in);
        int anho = lector.nextInt();

        if (anho % 4 == 0) {
            if (anho % 100 != 0) {
                System.out.println("Es un año bisiesto");
            } else if (anho % 400 == 0) {
                System.out.println("Es un año bisiesto");

            } else {
                System.out.println("No es un año bisiesto");
            }
        }
        else{
            System.out.println("No es año bisiesto");
            }
        }
    }


