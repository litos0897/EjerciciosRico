import java.util.Scanner;

public class SalidaNoche {
    public static void main(String[] args) {
        System.out.println("Vamos a tomar el aire. Bienvenido");
        Scanner lector = new Scanner(System.in);

        double nivelAlcohol = 0.0;
        double precioChupito = 3;
        double precioCanha = 1.8;
        double precioCombinado = 8;
        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;
        boolean salir = false;

        System.out.println("\nIntroduce el nombre de un cliente");
        String nombreCliente = lector.next();

        System.out.println(("\nIntroduce la edad del cliente"));
        int edadCliente = lector.nextInt();

        System.out.println("\nIntroduce la cantidad de dinero de dicho cliente");
        double dineroCliente = lector.nextDouble();

        System.out.println("\nEl cliente de nombre: " + nombreCliente + ", con edad " + edadCliente + " años, tiene " + dineroCliente + " euros");

        if (edadCliente < 18) {
            System.out.println("\nNo puedes entrar, eres menor, fuera de aquí");
            salir=true;

        } else if (nivelAlcohol > 1.2) {
            System.out.println("\nNo puedes entrar, estás muy bebido, fuera de aquí");
            salir=true;

        } else {
            System.out.println("\n¡Disfruta!");
        }


        while (!salir) {
            System.out.println("\nEsta es la carta de bebidas:");
            System.out.println("1: Un chupito: " + precioChupito + " €");
            System.out.println("2: Una caña: " + precioCanha + " €");
            System.out.println("3: Un combinado: " + precioCombinado + " €");
            System.out.println("4: No quiero beber nada, quiero salir");
            System.out.println("¿Qué quieres pedir(del 1 al 3)?");

            int eleccion = lector.nextInt();

            if (eleccion == 1) {
                if (dineroCliente >= precioChupito) {
                    dineroCliente -= precioChupito;
                    nivelAlcohol += nivelChupito;
                    System.out.println("Ahora tienes " + nivelAlcohol + " litros de alcohol en sangre y " + dineroCliente + "€ restantes");

                } else {
                    System.out.println("No tienes para un chupito");
                }
            } else if (eleccion == 2) {
                if (dineroCliente >= precioCanha) {
                    dineroCliente -= precioCanha;
                    nivelAlcohol += nivelCanha;
                    System.out.println("Ahora tienes " + nivelAlcohol + " litros de alcohol en sangre y " + dineroCliente + "€ restantes");
                } else {
                    System.out.println("No tienes para una caña");
                }

            } else if (eleccion == 3) {
                if (dineroCliente >= precioCombinado) {
                    dineroCliente -= precioCombinado;
                    nivelAlcohol += nivelCombinado;
                    System.out.println("Ahora tienes " + nivelAlcohol + " litros de alcohol en sangre y " + dineroCliente + "€ restantes");
                } else {
                    System.out.println("No tienes para un combinado");
                }
            } else if(eleccion==4){
                System.out.println("¡Hasta la próxima, vuelve pronto!");
                salir=true;

            }else {
                System.out.println("Opción errónea, vuelve a intentarlo");
            }
        }
        if (dineroCliente <= 0) {
            System.out.println("Te quedaste sin dinero, hora de volver a casa");
            salir = true;

        } else if (nivelAlcohol > 2) {
            System.out.println("Bebes demasiado y te desmayas.Te tienen que llevar al hospital en ambulancia");
            salir = true;
        }
    }
}