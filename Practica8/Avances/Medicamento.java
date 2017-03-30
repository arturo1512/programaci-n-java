import java.io.*;
import java.util.*;
public class Medicamento{

public String captura;
public String id;
public String nombreMedicamento;
public static float precio;

public Medicamento(){

}
public void getNombreMedicamento(Medicamento m){
	System.out.println("Ingrese nombre del medicamento:");
    m.leer(this);
    
    }



public void leer(Medicamento m){
	
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try{
     nombreMedicamento=br.readLine();
     }
     catch(IOException e){
     System.out.println(e);
     }
}
public void getPrecio(Medicamento m){
    System.out.println("Dame el precio de"+this.nombreMedicamento);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try{
     captura=br.readLine();
     }
     catch(IOException e){
     System.out.println(e);
     }
    
    precio=Float.parseFloat(captura);
    
}
public void getId(Medicamento m){
    System.out.println("Dame el id-numerico:"+this.nombreMedicamento);
    
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try{
     id=br.readLine();
     }
     catch(IOException e){
     System.out.println(e);
     }
}
public void imprimir(Medicamento m){
    System.out.println("El medicamento es:"+this.nombreMedicamento);
    System.out.println("El precio del medicamento es:"+this.precio);
    System.out.println("El ID_numerico del medicamento es:"+this.id);
}


}