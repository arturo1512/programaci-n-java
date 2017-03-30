import java.io.*;
import java.util.*;
public class Precio{
private float precio;
public String lee;
public float iva;
public Precio(){

}
public void getPrice(Precio p){
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Dame precio de compra con el Distribuidor:");
	try{
		lee=br.readLine();
	precio=Float.parseFloat(lee);
    
	}catch(IOException e){
		System.out.println(e);
	}

}
public void getConiva(Precio p){
	p.getPrice(this);
	System.out.println("El Precio con el Distribuidor es:"+this.precio);
	this.iva=this.precio+=this.precio*=0.16;
System.out.println("El precio con iva es:"+this.iva);	

}
public void imprimir(Precio p){
	
	System.out.println("El Precio con iva sera de:"+this.iva);
}


}