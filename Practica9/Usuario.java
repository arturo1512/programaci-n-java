import java.io.*;
import java.util.*;

 public class Usuario{

	private Nombre nombre;
	private String telefono;
	private Direccion direccion;
	private String mail;
	private Fecha fecha;
	private String nick_name;
	private String password;
	private  Usuario usuario;
	private  String iniciopassword;
	private String inicionick;

	public Usuario(){
		nombre = new Nombre();
		direccion = new Direccion();
		fecha = new Fecha();
	}
	
	public Nombre getNombre(){
		return this.nombre;
	}

	public void setTelefono(String telefono_p){
		this.telefono = telefono_p;
	}
	public String getTelefono(){
		return this.telefono;
	}
	public Direccion getDireccion(){
		return this.direccion;
	}
	public void setMail(String mail_p){
		this.mail = mail_p;
	}
	public String getMail(){
		return this.mail;
	}
	public Fecha getFecha(){
		return this.fecha;
	}
	public void setNick(String nickn_p){
		this.nick_name = nickn_p;
	}
	public String getNick(){
		return this.nick_name;
	}
	public void setPassword(String password_p){
		this.password = password_p;

	}
	public String getPassword(){
		return this.password;
	}
	public void setInicioNick(String nickname_p){
		this.inicionick = nickname_p;

	}
	public String getInicioNick(){
		return this.inicionick;
	}
	public void setInicioPassword(String password_P){
		this.iniciopassword = password_P;

	}
	public String getInicioPassword(){
		return this.iniciopassword;
	}
	
	public boolean iniciarSecion(String password_P, String nickname_p){
		if(usuario.getNick().equals(nickname_p) && usuario.getPassword().equals(password_P)){
			 return true;
			
		} else{

			return false;
		   
			}
		
	}

   public String toString() {
        return (""+this.nombre) +
        ("\nsu telefono es:" + this.telefono)+
        ("\n"+ this.direccion)+
        ("\nsu correo es:\n" + this.mail)+
        ("\nsu nickname:\n" +this.nick_name)+
        ("\nSu Fecha de nacimento es:"+this.fecha);
    }




}
