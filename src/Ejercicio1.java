import java.util.Scanner;
public class    Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [] paquetes = new double[10];

        double cantidadPaquetes = 0;
        double horas = 0;
        double horasLargas = 0;
        
       

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese la cantidad de paquetes"+(i+1)+":");
            cantidadPaquetes = teclado.nextDouble();

            
        }

         double totalPaquetes = cantidadPaquetes * horas;
            System.out.println("total de paquetes"+totalPaquetes);
            
            double promedio = totalPaquetes / horas;
            System.out.println("el promedio es"+promedio);


             if (horas>0) {
                System.out.println("la hora con la menor cantidad"+horas);

                double produccionMenor = horas - promedio;
                

                
          

            if (horasLargas<promedio) {
                System.out.println("racha mas larga de horas"+horasLargas);

            }


            System.out.println("");

    



        
 

           




        
    }
}
