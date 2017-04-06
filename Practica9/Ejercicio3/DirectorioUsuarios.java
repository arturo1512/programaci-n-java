public class DirectorioUsuarios{

     

 	private String usuario = "Arturo";
 	private String contra = "Artu12--";

 	public DirectorioUsuarios(){

 		String user1 = this.usuario;
 		String cons2 = this.contra;
 	}

 	public void iniciarSesion(String nickname, String contrasenia) {
 		
 		DirectorioUsuarios du = new DirectorioUsuarios();


 		if(nickname.equals(usuario) && contrasenia.equals(contra)){
 			System.out.println("Datos correctos");
 			
 		} else
 		System.out.println("Error Datos no compatibles");	
 		
 	}


 } 
