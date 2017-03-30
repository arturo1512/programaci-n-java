import java.io.*;
import java.util.*;
public class Fecha{
	private int day;
	private int month;
	private int anio;
	private String dia, mes, annio;
    static int[] diasMes= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
private String captura;

 protected void finalize(){
    System.out.println("el objeto se va a eliminar" + this.day+this.month+this.anio);
    day=0;
    month=0;
    anio=0;
   }
public Fecha(){

}

public void getLeer(Fecha p){
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try{
     captura=br.readLine();
     }
     catch(IOException e){
     System.out.println(e);
     }

}
 public void asignarDia(Fecha p){

     System.out.println("Dame dia:");
     p.getLeer(this);
     p.day=Integer.valueOf(captura).intValue();

     
     

}
 public void asignaMes(Fecha p){
     System.out.println("Dame mes:");
    p.getLeer(this);
     p.month=Integer.valueOf(captura).intValue();
   
       p.fechaC(this);
    
}
 public void asignaAnio(Fecha p){
    System.out.println("Dame anio:");
    p.getLeer(this);
    
    p.anio=Integer.valueOf(captura).intValue();
    p.fechaCorrecta(this);
 }
 public void getAsignaFecha(int arreglo[]){
     
     arreglo[0]=this.day;
     arreglo[1]=this.month;
     arreglo[2]=this.anio;
 }

	public void setFecha(String dia_p,String mes_p,String annio_p){
        this.dia=dia_p;
        this.mes=mes_p;
        this.annio=annio_p;

	}
    public void getDia(Fecha p){
        Calendar c = new GregorianCalendar();   
        //dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        annio = Integer.toString(c.get(Calendar.YEAR));

        System.out.println ( " " + this.day + "/" + this.mes +"/" + this.annio);
    }
    public void getDM(Fecha p){
        Calendar c=new GregorianCalendar();
        annio=Integer.toString(c.get(Calendar.YEAR));      
        System.out.println(""+this.day+"/"+this.month+"/"+this.annio);

    }
    public void getDMA(){
        Calendar c=new GregorianCalendar();
        System.out.println(""+this.day+"/"+this.month+"/"+this.anio);
    }
    public void asignaFecha(){
        Calendar c = new GregorianCalendar();   
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        annio = Integer.toString(c.get(Calendar.YEAR));
        System.out.println ( " " + this.dia + "/" + this.mes +"/" + this.annio);   
    }
    
 public void getNMes(Fecha p){
     month=this.month;
    

  switch(month){
  case 1:
       System.out.println ("Enero");
      break;
  case 2:
       System.out.println ("Febrero");
        boolean diaCorrecto;
      if (esBisiesto()) {

                    diaCorrecto = day >= 1 && day <= 29;
            
                } else {
                    diaCorrecto = day >= 1 && day <= 28;
                }
      break;
  case 3:
       System.out.println ("Marzo");
      break;
  case 4:
       System.out.println ("Abril");
      break;
  case 5:
       System.out.println ("Mayo");
      break;
  case 6:
       System.out.println ("Junio");
      break;
  case 7:
       System.out.println ("Julio");
      break;
  case 8:
       System.out.println ("Agosto");
      break;
  case 9:
       System.out.println ("Septiembre");
      break;
  case 10:
       System.out.println ("Octubre");
      break;
  case 11:
       System.out.println ("Noviembre");
      break;
  case 12:
       System.out.println ("Diciembre");
      break;
    }
  
}
private boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);


    }

public boolean fechaCorrecta(Fecha p) {

     month=this.month;
     if(p.anio<1582){
     System.out.println("el anio no es valido");
     }
     if(p.month<1||p.month>12)
     return false;
     if ( p.month==2 && p.anio%4==0 )
     return p.day>=1 && p.day<=29;
     System.out.println("EL mes es Febrero y tiene 29 dias");
     return p.day>=0 && p.day<=diasMes[p.month-1];
     
       
    
}
public boolean fechaC(Fecha p){
     if(p.month>12||p.month<1){        
     System.out.println("El mes no es correcto");
     } 
     return false; 

}


}    