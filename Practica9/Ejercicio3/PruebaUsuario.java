public class PruebaUsuario{

   public static void main(String [] args){

       ListaUsuario [] lista = new ListaUsuario[2];
       Lector reader = new Lector();   
       DirectorioUsuarios du = new DirectorioUsuarios();
       String nick= "0";
       String cont= "0";
       String nickname="";
       String contrasenia="";
       
      
       for(int  i = 0; i < lista.length; i++){
		ListaUsuario usuario = new ListaUsuario();
		System.out.print("Nickname: ");
		nick = reader.leeString();

		
		//usuario.iniciarSesion().getUsuario().setNickname(reader.leeString());
		System.out.println("Contrasenia");
		cont = reader.leeString();
		/*
		System.out.println("Repite Nickname:");
		usuario.getUsuario().setNickname(reader.leeString());
		System.out.println("Repite contrasenia:");
		usuario.getUsuario().setContrasenia(reader.leeString());*/
		du.iniciarSesion(nick,cont);
		lista[i] = usuario;
        }
        System.out.println("LOS DATOS SON:");
		for (int i = 0; i < lista.length ; i ++ ) {

    System.out.println(lista[i]);  
    
   }

}
}