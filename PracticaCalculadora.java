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
            
               BufferedReader br;
               br=new BufferedReader(new InputStreamReader(System.in));

          System.out.println("Cuantos numeros va  a ingresar :");
          int n=Integer.parseInt(br.readLine());
          System.out.println("Usted ingresara " + n + " numeros");
          int datos[]= new int[n];
          System.out.println("Ingrese los numeros :"  );
          for(int i=0;i<n;i++)
          {
               datos[i]=Integer.parseInt(br.readLine()); 
           }

          for(int i=0;i<n-1;i++) 
             {
                int min=i;
            for(int j=i+1;j<n;j++)     
              {
                       if(datos[j]<datos[min])      
                       {
                       min=j;
                        }
               }
                  if(i!=min)
                  {
                       int aux =datos[i];
                       datos[i]=datos[min];
                       datos[min] = aux;
                   }
            }
          System.out.println("Los numeros de menor a manor son :");
          for(int k=0; k<n;k++)

            System.out.println(datos[k] + "  ");
    

   

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