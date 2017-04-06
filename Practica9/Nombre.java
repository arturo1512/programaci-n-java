
public class Nombre{

    private String nomb;
    private String p_apellido;
    private String s_apellido;
     
    public Nombre(){}

    public void setNombre(String nom_p){
    	this.nomb = nom_p;
    }
    public String getNombre(){
    	return this.nomb;
    }
    public void setApellido(String apellido_p){
    	this.p_apellido = apellido_p;
    }
    public String getApellido(){
    	return this.p_apellido;
    }
    public void set2Apellido(String apellido2_p){
    	this.s_apellido = apellido2_p; 
    }
    public String get2Apellido(){
    	return this.s_apellido;
    }
    
     public String toString() {
        return (""+this.nomb) +
        ("_"+this.p_apellido)+
        ("_"+ this.s_apellido);
     }


}