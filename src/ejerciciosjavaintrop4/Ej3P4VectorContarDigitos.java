package ejerciciosjavaintrop4;

import java.util.Scanner;

public class Ej3P4VectorContarDigitos {
//    Recorrer un vector de N enteros contabilizando cuántos números son de
//    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int num;
        for (int i = 0; i < vector.length; i++) {
            num = (int) (Math.random() * 100000);
            vector[i] = num;
            System.out.println("[" + vector[i] + "]");

        }
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];
            int resultado = numero;
            int cont = 0;
            while (resultado > 0) {
                resultado = numero / 10;
                numero = resultado;
                cont++;
            }
            //System.out.println("cantidad de digitos del numero: " + vector[i] + " es " + cont);

            if (cont == 1) {
                cont1++;
            }
            if (cont == 2) {
                cont2++;
            }
            if (cont == 3) {
                cont3++;
            }
            if (cont == 4) {
                cont4++;
            }
            if (cont == 5) {
                cont5++;
            }
        }
        System.out.println("cont1 = " + cont1);
        System.out.println("cont2 = " + cont2);
        System.out.println("cont3 = " + cont3);
        System.out.println("cont4 = " + cont4);
        System.out.println("cont5 = " + cont5);
    }

}
