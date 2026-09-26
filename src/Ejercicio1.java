import java.util.Scanner;
public class    Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] paquetes = new int[10];
        int total = 0;

       
       

        for (int i = 0; i < 10; i++) {
            int cantidad;
            do { System.out.println("ingrese la cantidad de paquete" + (i+1)+":");
            cantidad=teclado.nextInt();

            if(cantidad < 0){
                System.out.print("error la cantidad no puede ser negativa");
            }

                
            } while (cantidad < 0);

            paquetes[i]=cantidad;
            total += cantidad;
           
        }

         double promedio = total / 10;
         int menorCantidad = paquetes[0];
         int horaMenor = 1;
         for(int i =1; i < 10; i++){
            if (paquetes[i]<menorCantidad){
                menorCantidad = paquetes[i];
                horaMenor = i + 1;
            
         }

    }
       int horasBajoPromedio = 0;
       int rachaActual = 0;
       int rachaMaxima = 0;

       for(int i = 0; i <10; i++){
        if (paquetes[i] < promedio) {
            horasBajoPromedio++;
            rachaActual++;

            if(rachaActual > rachaMaxima){
                rachaMaxima = rachaActual;
            }
         } else{
            rachaActual =0;

            }
        }
        System.out.println("el total de paquetes procesados"+total);
        System.out.println("el promedio de paquetes por hora"+promedio);
        System.out.println("el numero de la hora con la menor cantidad"+horaMenor + "("+ menorCantidad+"paquetes)");
        System.out.println("cuantas horas tuvieron produccion inferior"+horasBajoPromedio);
        System.out.println("racha mas larga de horas con bajo promedio" + rachaMaxima);

        for (int i= 0; i< 10;i++) {
            System.out.println("hora" + (i+1)+":" + paquetes[i]+ "paquetes");


       }
            
            
            }


            
    



        
 

           




        
    }

