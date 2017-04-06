public class ListaUsuario{
    
     private String nickname;
     private String contrasenia;
     private ListaUsuario listaUsuario;

     public ListaUsuario(){}
     public ListaUsuario getUsuario(){
    	return this.listaUsuario;
    }

public void setNickname(String nickname_p){
		this.nickname = nickname_p;
	}
	public String getNickname(){
		return this.nickname;
	}
	public void setContrasenia(String contrasenia_p){
		this.contrasenia = contrasenia_p;
	}
	public String getContrasenia(){
	return this.contrasenia;
    }
    public String toString(){
    	return "/" +this.nickname + "/" + this.contrasenia;
    }
}
