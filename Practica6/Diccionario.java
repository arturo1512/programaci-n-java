import java.io.*;
public class Diccionario{
    public void Traduccion(){
        
}
 
   public void Traducir(){
   	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    String leeropcion;
    int opcion;
    System.out.println("Dame el numero de Palabra que deseas traducir:");
    System.out.println("1.-air");
    System.out.println("2.-blue");
    System.out.println("3.-blanket");
    System.out.println("4.-car");
    System.out.println("5.-cat");
    System.out.println("6.- clothes");
    System.out.println("7.-dog");
    System.out.println("8.-home");
    System.out.println("9.-motocycle");
    System.out.println("10.-sock");
    System.out.println("11.-sway");
    System.out.println("12.-subway");
    System.out.println("13.-shock");
    System.out.println("14.-sleep");
    System.out.println("15.-salad");
    System.out.println("16.-sale");
    System.out.println("17.-salt");
    System.out.println("18.-same");
    System.out.println("19.-sand");
    System.out.println("20.-Saturday");
    System.out.println("21.-save");
    System.out.println("22.-say");
    System.out.println("23.-school ");
    System.out.println("24.- science");
    System.out.println("25.-scissors");
    System.out.println("26.-scream");
    System.out.println("27.-sea");
    System.out.println("28.-seat");
    System.out.println("29.-see");
    System.out.println("30.-secret");
    System.out.println("31.-self");
    System.out.println("32.-sell ");
    System.out.println("33.-send ");
    System.out.println("34.-September");
    System.out.println("35.-serious ");
    System.out.println("36.-service");
    System.out.println("37.-seventeen");
    System.out.println("38.- seventy ");
    System.out.println("39.-Van");
    System.out.println("40.-water");                      
    System.out.println("41.-wave");

    do{

    try {
         System.out.println("Dame tu opcion:");

         leeropcion= br.readLine();
          opcion=Integer.valueOf(leeropcion).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         return;
       }
       if(opcion>41)
        System.out.println("la opcion no es valida");         

    switch(opcion){
          case 1: 
                 System.out.println("Su traduccion es: aire ");
          break;
          case 2:
                  System.out.println("Su traduccion es: azul ");
          break;
          case 3:
                 System.out.println("Su traduccion es: cobija ");
          break;
          case 4:
                 System.out.println("Su traduccion es: coche");
                break;
          case 5:
                 System.out.println("Su traduccion es: gato ");
          break;        
          case 6:
                 System.out.println("Su traduccion es: ropa ");

          break;
          case 7:
                 System.out.println("Su traduccion es: perro ");
          break;
          case 8:
                System.out.println("Su traduccion es: casa");
          break;
          case 9:
                System.out.println("Su traduccion es: moto");
          break;
          case 10:
                 System.out.println("Su traduccion es: calzetin");
          break;
          case 11:
                 System.out.println("Su traduccion es: moto");
          break;
          case 12:
                 System.out.println("Su traduccion es: vaiven");
          break;
          case 13:
                 System.out.println("Su traduccion es: subterraneo");
          break;
          case 14:
                 System.out.println("Su traduccion es: dormir");
          break;
          case 15:
                System.out.println("Su traduccion es: ensalada");
          break;
          case 16:
                System.out.println("Su traduccion es: rebaja");
          break;
          case 17:
                 System.out.println("Su traduccion es: sal");
          break;
          case 18:
                System.out.println("Su traduccion es: arena");
          break;
          case 19:
                System.out.println("Su traduccion es: sábado");
          break;
          case 20:
                System.out.println("Su traduccion es: salvar");
          break;
          case 21:
                System.out.println("Su traduccion es: decir");
          break;
          case 22:
                System.out.println("Su traduccion es: escuela");
          break;
          case 23:
                System.out.println("Su traduccion es:  ciencia");
          break;
          case 24:
                System.out.println("Su traduccion es:  tijeras");
          break;
          case 25:
                System.out.println("Su traduccion es: gritar");
          break;
          case 26:
                 System.out.println("Su traduccion es: mar");
          break; 
          case 27:
                 System.out.println("Su traduccion es: asiento");
          break;
          case 28:
                  System.out.println("Su traduccion es: segundo ");
          break;
          case 29:
                 System.out.println("Su traduccion es: secreto");
          break;
          case 30:
                 System.out.println("Su traduccion es: ver");
          break;
          case 31:
                 System.out.println("Su traduccion es: tu mismo");
          break;
          case 32:
                 System.out.println("Su traduccion es: vender");
          break;
          case 33:
                 System.out.println("Su traduccion es: enviar");
          break;
          case 34:
                 System.out.println("Su traduccion es: Septiembre");
          break;
          case 35:
                 System.out.println("Su traduccion es: serio");
          break;
          case 36:
                 System.out.println("Su traduccion es: servicio");
          break;
          case 37: 
                 System.out.println("Su traduccion es: siete");
          break;
          case 38:
                 System.out.println("Su traduccion es: setenta");
          break;
          case 39:
                 System.out.println("Su traduccion es: camioneta");
          break;
          case 40:
                 System.out.println("Su traduccion es: agua");
          break;
          case 41:
                 System.out.println("Su traduccion es: ola ");
          break;
    }

}while(opcion>41);

        
     }




 public static void main(String args[]){

Diccionario traducir=new Diccionario();
traducir.Traduccion();
Diccionario traducir2=new Diccionario();
traducir.Traducir();

}
}








