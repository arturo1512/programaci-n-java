
public class Fecha{
 	private String dia;
 	private String mes;
 	private String anio;

    public Fecha(){}

    public void setDia(String dia_p){
    	this.dia = dia_p;
    }
    public String getDia(){
    	return this.dia;
    }
    public void setMes(String mes_p){
    	this.mes = mes_p;
    }
    public String getMes(){
    	return this.mes;
    }
    public void setAnio(String anio_p){
    	this.anio = anio_p;
    }
    public String getAnio(){
    	return this.anio;
    }
    public String toString(){
    	return "/" +this.dia + "/" + this.mes + "/" + this.anio;
    }
    
 }