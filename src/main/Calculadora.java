package main;
import java.util.Scanner;

/**
 * La clase Calculadora para hacer calculos sencillos con numeros.
 * Las operaciones que se pueden realizar en esta versión son: Suma, Resta, Multiplicación y División.
 * 
 * @version 1.0 25 Marzo 2024
 * @author Anto Martinez
 */

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        /**
         * Primer numero para operar en la calculadora
         */
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número:");
        /**
         * Segundo numero para operar en la calculadora
         */
        double num2 = scanner.nextDouble();

        System.out.println("Elige la operación (suma, resta, multiplicación, división):");
        /**
         * Tipo de operacion elegida a realizar
         */
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
	
	/**
	 * Realiza la suma de dos numeros double.
	 * @param a es el primer numero a sumar.
	 * @param b es el segundo numero a sumar.
	 * @return El resultado de la suma a+b.
	 */
	public static double suma(double a, double b) {
        return a + b;
    }
	
	/**
	 * Realiza la resta de dos numeros double.
	 * @param a es el primer numero a restar.
	 * @param b es el segundo numero a restar.
	 * @return El resultado de la resta a-b.
	 */
    public static double resta(double a, double b) {
        return a - b;
    }
    
    /**
	 * Realiza la multiplicacion de dos numeros double.
	 * @param a es el primer numero a multiplicar.
	 * @param b es el segundo numero a multiplicar.
	 * @return El resultado de la multiplicacion a*b.
	 */
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    
    /**
	 * Realiza la division de dos numeros double.
	 * @param a es el dividendo.
	 * @param b es el divisor - b > 0.
	 * @return el resultado de la division a/b.
	 */
    public static double division(double a, double b) {
        return a / b;
    }
}

