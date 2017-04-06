
public class Direccion{
	private String calle;
	private int numero;
	private String colonia;

	public Direccion(){}

	public void setCalle(String calle_p){
		this.calle = calle_p;
	}
	public String getCalle(){
		return this.calle;
	}
	public void setNumero(int numero_p){
		this.numero = numero_p;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setColonia(String colonia_p){
		this.colonia = colonia_p;
	}
	public String getColonia(){
		return this.colonia;
	}
	 public String toString(){
    	return "Vive en: \n"+ "calle: " + this.calle + "\nN." + this.numero+ "\n" + "colonia: "+ this.colonia;
    }
}