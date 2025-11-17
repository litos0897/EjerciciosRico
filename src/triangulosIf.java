import java.util.Scanner;

public class triangulosIf {
    public static void main(String[]args){
        Scanner lector=new Scanner(System.in);
        System.out.println("¿Cuánto mide el lado 1 del triángulo?");
        int lado1= lector.nextInt();
        System.out.println("\n¿Cuánto mide el lado 2 del triángulo?");
        int lado2= lector.nextInt();
        System.out.println("\n¿Cuánto mide el lado 3 del triángulo?");
        int lado3= lector.nextInt();

        if(lado1==lado2&&lado1==lado3&&lado2==lado3){
            System.out.println("\nEs un triángulo equilátero");
        }if(lado1==lado2&&lado1!=lado3||lado1==lado3&&lado2!=lado1||lado2==lado3&&lado2!=lado1){
            System.out.println("\nEs un triángulo isósceles");
        }if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
            System.out.println("\nEs un triángulo escaleno");
        }

    }
}
