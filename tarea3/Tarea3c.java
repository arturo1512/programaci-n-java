
import java.util.Scanner;
public class Tarea3c {
//este programa tiene un switch para sacar si el mes de febrero 
	//tiene 28 o 29 dias 

	public static void main(String[]args){
int mes1;
		Scanner mes=new Scanner(System.in);
		System.out.println("Dame el numero de mes que quieres ver");
		mes1=mes.nextInt();

		int meses;
		meses=mes1;
switch (meses) {
     case 1: 
     System.out.println("Es Enero y tiene 31 dias ");
       
        break; 
     case 2: 
     System.out.println("Es Febrero");
      Scanner biciesto= new Scanner (System.in);
          int nio;
             System.out.println("Ingresa anio:\n");
                     nio=biciesto.nextInt();
                        if(nio%4==0 && nio%100!=0 || nio%400==00){
                              System.out.println("el anio es biciesto ");
                                       }
                                             else
                                       {

                                  System.out.println("NO ES BICIESTO");

}
        break; 
        case 3:
        System.out.println("Es Marzo y tiene 31 dias ");
        break;
        case 4:
        System.out.println("Es Abril y tiene 30 dias");
        break;
        case 5: 
        System.out.println("Es mayo y tiene 31 dias");
        break;
        case 6: 
        System.out.println("Es Junio y tiene 30 dias");
        break;
        case 7:
        System.out.println("Es Julio Y tiene 31 dias");
        break;
        case 8:
        System.out.println("Es Agosto y tiene 31 dias");
        break;
        case 9:
        System.out.println("Es Septiembre y tiene 30 dias");
        break;
        case 10:
        System.out.println("Es Octubre y tiene 31 Dias");
        break;
        case 11:
        System.out.println("Es Noviembre y tiene 30 dias");
        break;
        case 12:
        System.out.println("Es Diciembre y tiene 31 Dias");
        break;

     default: 
     System.out.println("no es un mes intenta de nuevo");
        
}



 





	}
}