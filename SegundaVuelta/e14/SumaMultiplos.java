import java.io.*;

public class SumaMultiplos{
     
     
int d;
 
	public static void main(String []args){
         int s=5;
         int b;
         int a;

		Leer lee = new Leer();
        Multiplos m = new Multiplos();		

         System.out.println("Este Programa solo lee Multiplos de 5");
        
         if(lee.leeInt()<5 || lee.leeInt()< 0 )
         System.out.println("NO se acepta numero REcomiendo empezar desde 5");
         
         System.out.println("Dame A");
	     m.setA(lee.leeInt());
	     System.out.println("DAme b");
	     m.setb(lee.leeInt());
	     if(m.getA() > m.getB())

	     	
         System.out.println("Multiplos de a "+ s * m.getA());
         System.out.println("MULtiplos de b "+ s * m.getB());
     

	}
}