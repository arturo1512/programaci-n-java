import java.io.*;
public class MenuOperaciones{            
       public void SacarSuma(){
        String aString;
        String bString;
        double operacion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        try {
         System.out.println("Dame el valor de Dato 1:");
         aString= br.readLine();
        }
        catch (IOException e){
         System.out.println(e);              
         return;
         }
         try {
          System.out.println("Dame el valor de Dato 2:");
          bString= br.readLine();
         operacion=Integer.valueOf(aString).doubleValue();
         operacion+=Integer.valueOf(bString).doubleValue();
         System.out.println("El resultado de la suma es:"+operacion);
         } 
         catch (IOException e){
          System.out.println(e);              
              return;
          }

}
       public void SacarResta(){
        String aString;
        String bString;
        double operacion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        try {
         System.out.println("Dame el valor de Dato1:");
         aString= br.readLine();
        }
        catch (IOException e){
         System.out.println(e);              
         return;
         }
         try {
          System.out.println("Dame el valor de Dato 2:");
          bString= br.readLine();
         operacion=Integer.valueOf(aString).doubleValue();
         operacion-=Integer.valueOf(bString).doubleValue();
         System.out.println("El resultado de la resta es:"+operacion);
         } 
         catch (IOException e){
          System.out.println(e);              
              return;
          }

  }
      public void SacarMultiplicacion(){
        String aString;
        String bString;
        double operacion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        try {
         System.out.println("Dame el valor de Dato 1:");
         aString= br.readLine();
        }
        catch (IOException e){
         System.out.println(e);              
         return;
         }
         try {
          System.out.println("Dame el valor de Dato 2:");
          bString= br.readLine();
          operacion=Integer.valueOf(aString).doubleValue();
          operacion*=Integer.valueOf(bString).doubleValue();
         System.out.println("El resultado de la multiplicacion es:"+operacion);
         } 
         catch (IOException e){
          System.out.println(e);              
              return;
          }

  }
      public void SacarDivision(){
        String aString;
        String bString;
        double operacion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        try {
         System.out.println("Dame el valor de Dato 1:");
         aString= br.readLine();
        }
        catch (IOException e){
         System.out.println(e);              
         return;        
         }
         try {
          System.out.println("Dame el valor de Dato 2:");
          bString= br.readLine();
          operacion=Integer.valueOf(aString).doubleValue();
          operacion/=Integer.valueOf(bString).doubleValue();
         System.out.println("El resultado de la division es:"+operacion);
         } 
         catch (IOException e){
          System.out.println(e);              
              return;
          }
                 
 
}

   public static void main(String []args){
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    String leeropcion;
    int opcion;
    System.out.println("Dame el numero de la operacion que vas a utilizar:");
    System.out.println("1.-SUMA");
    System.out.println("2.-RESTA");
    System.out.println("3.-MULTIPLICACION");
    System.out.println("4.-DIVISION");
    System.out.println("5.-Salir");
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
       if(opcion>5)
        System.out.println("la opcion no es valida");         

        System.out.println("Solo existen estas opciones para realizar:");
        System.out.println("1.-SUMA");
        System.out.println("2.-RESTA");
        System.out.println("3.-MULTIPLICACION");
        System.out.println("4.-DIVISION");            
         
        
    switch(opcion){
          case 1:
                  MenuOperaciones suma=new MenuOperaciones();
                  suma.SacarSuma();
          break;
      
          
          case 2:
                  MenuOperaciones resta=new MenuOperaciones();
                  resta.SacarResta();
          break;
          case 3:
                  MenuOperaciones multiplicacion=new MenuOperaciones();
                  multiplicacion.SacarMultiplicacion();
          break;
          case 4:
                 MenuOperaciones division=new MenuOperaciones();
                 division.SacarDivision();
                break;


          case 5:
                  System.out.println("Gracias por ulitizar la calculadora BYE");
                 
          break;


    }

}while(opcion>5);


}

}






