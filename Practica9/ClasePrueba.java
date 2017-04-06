public class ClasePrueba{



	public static void main(String []args){

		Usuario usuario[] = new Usuario[3];
		Lector reader = new Lector();
		for(int i=0; i<usuario.length;i++){
		Usuario usuario1 = new Usuario();
		System.out.println("Dame el nombre del usuario");
		usuario1.getNombre().setNombre(reader.leeString());
		System.out.println("1 Apellido");
		usuario1.getNombre().setApellido(reader.leeString());
		System.out.println("2 Apellido");
		usuario1.getNombre().set2Apellido(reader.leeString());

		System.out.println("Telefono:");
		usuario1.setTelefono(reader.leeString());

		System.out.println("Direccion");
		System.out.println("calle:");
		usuario1.getDireccion().setCalle(reader.leeString());
		System.out.println("Numero:");
		usuario1.getDireccion().setNumero(reader.leeInt());
		System.out.println("colonia:");
		usuario1.getDireccion().setColonia(reader.leeString());

		System.out.println("mail");
		usuario1.setMail(reader.leeString());

		System.out.println("nickname:");
		usuario1.setNick(reader.leeString());
		System.out.println("Fecha de nacimiento");
        
        System.out.println("Dia:");
        usuario1.getFecha().setDia(reader.leeString());
        System.out.println("Mes:");
        usuario1.getFecha().setMes(reader.leeString());
        System.out.println("Anio:");
        usuario1.getFecha().setAnio(reader.leeString());

		usuario[i] = usuario1;
		
		}
		System.out.println("LOS DATOS SON:");
		for (int i = 0; i < usuario.length ; i ++ ) {

    System.out.println(usuario[i]);  
    
  }
	}
}