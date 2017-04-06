import java.io.*;
import java.util.*;

 public class Usuario{

	private Nombre nombre;
	private String telefono;
	private Direccion direccion;
	private String mail;
	private Fecha fecha;
	private String nick_name;
	

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
	public void setNick(String nick_p){
		this.nick_name = nick_p;
	}
	public String getNick(){
		return this.nick_name;
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
