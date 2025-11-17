import java.util.Scanner;
public class edadesIf {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuántos años tienes?");
        int edad = lector.nextInt();

        if (edad < 5) {
            System.out.println("\nTienes entrada gratis");
        }
        if (edad >= 5 && edad <= 12) {
            System.out.println("\nTienes un 50% de descuento");
        }
        if (edad >= 13 && edad <= 64) {
            System.out.println("\nNo tienes descuento");
        } else {
            System.out.println("\nTienes un 75% de descuento");
        }
    }
}
