import java.util.Scanner;

public class CalculadoraMateriales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo del mueble (en metros): ");
        double largo = scanner.nextDouble();
        System.out.print("Ingrese el ancho del mueble (en metros): ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese la altura del mueble (en metros): ");
        double altura = scanner.nextDouble();

        // Cálculo del área para la tela (suponiendo que se cubre todas las caras)
        double areaTela = 2 * ((largo * ancho) + (largo * altura) + (ancho * altura));
        System.out.println("La cantidad de tela necesaria es: " + areaTela + " metros cuadrados.");

        // Cálculo del volumen para la madera (suponiendo un grosor de madera)
        double grosorMadera = 0.02; // 2 cm de grosor
        double volumenMadera = largo * ancho * altura * grosorMadera;
        System.out.println("El volumen de madera necesario es: " + volumenMadera + " metros cúbicos.");
    }
}