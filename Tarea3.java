  import java.util.Scanner;
   class Tarea3 {
 	 
 	 // este progama te dice si es un numero par o impar 
public static void main(String[]args){
Scanner ab = new Scanner (System.in);

System.out.println("Dame Numero:");
int resultado=ab.nextInt();
int numero=resultado;

if(numero % 2==0) 
	System.out.println("Es par");
    else 
    	System.out.println("es impar");
}
 }
