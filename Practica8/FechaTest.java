import java.util.*;
import java.io.*;
public class FechaTest{
    String captura;
     int opcion=0; 	

  
 

 public static void main(String[]args){
 	String captura;
 	 int opcion=0;
     Fecha fc=new Fecha();
     Fecha f1=new Fecha();
     int a[]=new int[3];
     
     System.out.println("Que opcion vas a realizar:");
     System.out.println("1.- asignar dia");
     System.out.println("2.- asignar dia y mes");
     System.out.println("3.- asignar dia, mes y anio:");
     fc.asignaFecha();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try{
     	captura=br.readLine();
     	opcion=Integer.valueOf(captura).intValue();
     }catch(IOException e){
     	System.out.println(e);
     }

     
      
     switch(opcion){
     	case 1:
     	fc.asignarDia(fc); 
        fc.getDia(f1);
        break;
        case 2:
        fc.asignarDia(fc); 
        fc.asignaMes(fc);

        fc.getDM(fc);
        fc.getNMes(fc);
        break;
        case 3:
        fc.asignarDia(fc); 
        fc.asignaMes(fc);
        fc.asignaAnio(fc);
        fc.getDMA();
        
        break;

     }
     fc.finalize();
     fc=null;
     f1=null;
    System.gc();

 }


}