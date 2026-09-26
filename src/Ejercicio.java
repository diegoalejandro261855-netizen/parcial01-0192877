
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] ventas = new int[4][5];

        for (int f = 0; f < 4; f++){
            for(int c=0; c<5;c++){
                int cantidad;

                do { 
                    System.out.println("sucursal"+(f+1)+"producto"+ (c+1)+"ingrese unidades vendidas");
                    cantidad = teclado.nextInt();

                    if (cantidad < 0){
                        System.out.println("error no puede ser negativa");

                    }
                } while (cantidad<0);

                ventas[f][c]=cantidad;

            }


            }

            int[]
        }
            }

