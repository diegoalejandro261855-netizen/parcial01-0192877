
import java.util.Scanner;

public class Ejercicio2 {
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

            int[] totalSucursales =new int[4];
            for (int f = 0; f < 4; f++) {
                int sumaFila = 0;
                for (int c=0; c < 5; c++){
                    sumaFila += ventas[f][c];

                }
                totalSucursales[f]=sumaFila;
                
            }

            int[]totalProductos = new int[5];
            for (int c = 0; c < 5; c++){
                int sumaColumna = 0;
                for (int f = 0; f < 4; f++) {
                    sumaColumna += ventas[f][c];
                    
                }
                totalProductos[c] = sumaColumna;
            }

            int menorVentaSucursal = totalSucursales[0];
            int posicionSucursalMenor = 1;
            for (int f = 0; f < 4; f++) {
                if(totalSucursales[f]< menorVentaSucursal){
                    menorVentaSucursal= totalSucursales[f];
                    posicionSucursalMenor = f+1;
                }
                
            }

            
            int mayorVentasProducto = totalProductos[0];
            int posicionProductoMayor =1;
            for (int c = 0; c < 4; c++) {
                if (totalProductos[c] > mayorVentasProducto){
                    mayorVentasProducto = totalProductos[c];
                    posicionProductoMayor = c+1;
                }

                
            }

            int registroSuperiores30 = 0;
            for (int f = 0; f < 4; f++) {
                for (int c = 0; c < 4; c++) {
                    if(ventas[f][c] > 30){
                        registroSuperiores30++;
                    }
                    
                }
                
            }

            System.out.println("reportes");

            System.out.println("total de unidades vendidas por sucursal");
            for (int f = 0; f < 4; f++) {
                System.out.println("sucursal"+(f+1)+":"+ totalSucursales[f] +"unidades");

                
            }

            System.out.println("total vendido por cada producto");
            for (int c = 0; c < 4; c++) {
                System.out.println("producto"+(c+1)+":"+totalProductos[c]+"unidades");

            }
            System.out.println("sucursal con menor venta total"+posicionSucursalMenor+"("+menorVentaSucursal+"unidades)");
            System.out.println("producto con mayor venta total"+posicionProductoMayor+"("+mayorVentasProducto +"unidades)");
            System.out.println("cantidad de registro superiores a 30 unidades"+ registroSuperiores30);


            System.out.println("matriz de ventas");
            System.out.println("prod1,prod2,prod3,prod4,prod5");

            for (int f = 0; f < 4; f++) {
                System.out.println("sucursal"+(f+1)+":");
                for (int c = 0; c < 4; c++) {
                   System.out.print(ventas[f][c] + "\t");

                    
                }
                
            }



                
            }


           
            
           
        }
            

