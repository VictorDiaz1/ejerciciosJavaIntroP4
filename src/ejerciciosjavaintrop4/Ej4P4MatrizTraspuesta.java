package ejerciciosjavaintrop4;

public class Ej4P4MatrizTraspuesta {
//    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
//    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
//    se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = (int) (Math.random() * 10);
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //int num = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("////////////////////////////////");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //int num = (int) (Math.random() * 10);
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
}
