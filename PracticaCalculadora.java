import java.util.Scanner;
import java.io.*;

public class PracticaCalculadora{
public static void main(String[]args){
int option;
option=0;
       Scanner input=new Scanner(System.in);
          System.out.println("Menu elige la operacion que deseas realizar:");
           
          System.out.println("1.-MINIMO");
          System.out.println("2.-MAXIMO");
          System.out.println("3.-RANGO");
          System.out.println("4.-SUMA");
          System.out.println("5.-CUENTA");
          System.out.println("6.-MEDIA");
          System.out.println("7.-MODA");    
          System.out.println("8.-DESVIACION");
          System.out.println("9.-ESTANDAR");
          System.out.println("10.-VARIANZA");
          System.out.println("11.-RANGO MEDIO");
                 option=input.nextInt();
switch (option)
{
         case 1: 
         System.out.println("el minimo es");
              break;
         case 2:
            break;
         case 3:
         double sumar=0;
         int y;
         Scanner leer=new Scanner(System.in);
             System.out.println("Dame el numero de valores que usaras");
             y= leer.nextInt();
           
            for(int i=0;i<y;i++)
            {
                System.out.println("dame valor");
                double var1 =leer.nextInt();
                
                sumar=sumar+var1;

            }
              double aux;
              boolean cambios=false;
              for(int i=1;i<array.length;i++)
              {
                if(array[i]<array[i-1])
                {
                    aux=array[i];
                    array[i]=array[i-1];
                    array[i-1]=aux;
                    cambios=true;
                }
              }
              if(cambios==false)

            break;
         case 4:
              break;
         case 5:
              break;
         case 6: 
         int x;
         double suma=0;
             Scanner media=new Scanner(System.in);
             System.out.println("Dame el numero de valores que usaras");
             x= media.nextInt();
          for(int i=0;i<x;i++)
          {
            System.out.println("Dame valor:");
            double numero =media.nextInt();
            suma=suma+numero;


          }
          double resul=suma/x;

            System.out.println("la suma total es "+suma);
            System.out.println("LA MEDIA ES:"+resul);

              break;
         case 7:
              break;
         case 8:
              break;
         case 9:
              break;
         case 10:
              break;
         case 11:
               break;

           default:
                 break;
}


}




}