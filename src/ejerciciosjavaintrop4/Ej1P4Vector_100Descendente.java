package ejerciciosjavaintrop4;

import java.util.Arrays;

public class Ej1P4Vector_100Descendente {

//    Realizar un algoritmo que llene un vector con los 100 primeros números
//    enteros y los muestre por pantalla en orden descendente.
    public static void main(String[] args) {

        int[] vector = new int[100];
        int cont = vector.length;
        for (int i = 0; i < vector.length; i++) {

            cont--;
            vector[i] = cont;

            //System.out.println("[" + vector[i] + "]");
        }
        System.out.println(Arrays.toString(vector));

    }

}
