package ejerciciosjavaintrop4;

import java.util.Scanner;

public class Ejercicio6P4 {
//    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//    donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
//    Crear un programa que permita introducir un cuadrado por teclado y determine
//    si este cuadrado es mágico o no. El programa deberá comprobar que los números
//    introducidos son correctos, es decir, están entre el 1 y el 9.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizMagica = new int[3][3];
        int num;
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = sc.nextInt();
                matrizMagica[i][j] = num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matrizMagica[i][j] + " ]");
            }
            System.out.println(" ");
        }
        boolean retorno = false;
        int suma = (matrizMagica[0][0]) + (matrizMagica[0][1]) + (matrizMagica[0][2]);
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma2 = suma2 + matrizMagica[i][j];
                suma3 = suma3 + matrizMagica[j][i];
                if (i == j) {
                    suma4 = matrizMagica[i][j];
                }
                if (i + j == 3) {
                    suma5 = matrizMagica[i][j];
                }
                if (suma == suma2 && suma == suma3) {
                    retorno = true;                 
                }             
            }
            suma2 = 0;
        }
        if (suma == suma4 && suma == suma5) {
            retorno = true;
        }
        System.out.println("suma = " + suma);
        System.out.println("retorno = " + retorno);
        if (retorno) {
            System.out.println("Es una matriz magica");
        }else System.out.println("No es una matriz magica");
    }
}
