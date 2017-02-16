public class PracticaIndexOf {
  public static void main(String[] args) throws Exception{

    String cadena = "Hello, my good friend";
    int index = cadena.indexOf("Hello"); 
    System.out.println("Esta es mi frase : "+cadena);

    System.out.println("Esta es la posicion primera palabra: " +index);
    //esta funcion nos ayuda saber en que posicion esta la palabra que seleccionemos abajo
    index = cadena.indexOf("good",index+1); 
    
    System.out.println("Esta es la posicion de la segunda palabra: " +index);
    

  }
}