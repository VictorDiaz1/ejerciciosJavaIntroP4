package ejerciciosjavaintrop4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicoMatrizAntisimetrica {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int num;
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
        System.out.println("////////////////////////////////");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrizTranspuesta[i][j] = -matriz[j][i];
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("[ " + matrizTranspuesta[i][j] + " ]");
//            }
//            System.out.println(" ");
//        }
        System.out.println("///////////////////////////////");
        int[][] matrizAntisimetrica = new int[3][3];
        int num2;

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
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (matriz[i][j] == -matrizAntisimetrica[i][j]) {
//                    System.out.println("Son antisimetricas");
//                }else System.out.println("no son antisimetricas");
//                
//            }
//            
//        }
        if (Arrays.deepEquals(matriz, matrizAntisimetrica)) {
            System.out.println("Las matrices son antisimetricas");
        } else {
            System.out.println("Las matrices no son antisimetricas");
        }

    }

}
