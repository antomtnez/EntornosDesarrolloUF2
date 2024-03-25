package main;
import java.util.Scanner;

/**
 * Clase Calculadora para hacer calculos sencillos con numeros.
 * Las operaciones que se pueden realizar en esta versión son: Suma, Resta, Multiplicación y División.
 * 
 * @version 1.0 25 Marzo 2024
 * @author Anto Martinez
 */

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Elige la operación (suma, resta, multiplicación, división):");
        String operacion = scanner.next();

        switch (operacion) {
        case "suma":
            System.out.println("Resultado: " + suma(num1, num2));
            break;
        case "resta":
            System.out.println("Resultado: " + resta(num1, num2));
            break;
        case "multiplicación":
            System.out.println("Resultado: " + multiplicacion(num1, num2));
            break;
        case "división":
            if (num2 == 0) {
                System.out.println("No se puede dividir por cero.");
            } else {
                System.out.println("Resultado: " + division(num1, num2));
            }
            break;
        default:
            System.out.println("Operación no reconocida.");
            break;
        }
    }
	
	public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}

