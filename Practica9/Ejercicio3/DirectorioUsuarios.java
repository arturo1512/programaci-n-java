public class DirectorioUsuarios{

     
   
 	public String usuario = "";
 	public String contra = "";
/*
 	public DirectorioUsuarios(){

 		String user1 = this.usuario;
 		String cons2 = this.contra;
 	}*/


 	public void iniciarSesion(String nick_p, String cont_p) {
 		ListaUsuario usd = new ListaUsuario();
 		


 		if(usuario.equals(nick_p) && contra.equals(cont_p)){
 			System.out.println("Datos correctos");
 			
 		} else
 		System.out.println("Error Datos no compatibles");	
 		
 	}


 } 
