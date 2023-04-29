package ejerciciosjavaintrop4;

import java.util.Scanner;

public class Ejercicio2P4 {
//    Realizar un algoritmo que llene un vector de tamaño N con valores
//    aleatorios y le pida al usuario un número a buscar en el vector. El
//    programa mostrará dónde se encuentra el numero y si se encuentra
//    repetido

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");

        int n = sc.nextInt();
        int[] vector = new int[n];
        int numero;

        for (int i = 0; i < vector.length; i++) {
            numero = (int) (Math.random() * 10);

            vector[i] = numero;

            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("Ingrese un numero a buscar: ");
        int num = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El numero ingresado no se encuentra en el vector");
        }
        if (cont == 1) {
            System.out.println("El numero ingresado se encuentra " + cont + " vez");
        } else {
            System.out.println("El numero ingresado se encuentra " + cont + " veces");
        }

    }

}
