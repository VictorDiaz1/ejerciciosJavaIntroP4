package ejerciciosjavaintrop4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5P4 {
//    Realice un programa que compruebe si una matriz dada es antisimétrica.
//    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
//    traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
//    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
//    sus filas por columnas (o viceversa).

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[][] matrizAntisimetrica = new int[3][3];
        int num;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
        sc.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }

        System.out.println("Ingrese los valores de la matriz antisimetrica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num2 = sc.nextInt();
                matrizAntisimetrica[i][j] = -num2;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + (matrizAntisimetrica[j][i]) + "] ");
            }
            System.out.println(" ");
        }

        if (Arrays.deepEquals(matriz, matrizAntisimetrica)) {
            System.out.println("Las matrices son antisimetricas");
        } else {
            System.out.println("Las matrices no son antisimetricas");
        }
    }
}
