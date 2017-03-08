import java.util.Scanner;
//este prograam muestra el mes de acuero a lo que introduce el mes 
class Tarea3a{
	
public static void main(String[]args){
	Scanner ab = new Scanner (System.in);

System.out.println("Dame Numero de mes");
int resultado=ab.nextInt();
int mes=resultado;


if(mes==1)
{
	System.out.println("Enero");
}

if(mes==2)
{
	System.out.println("es febrero");
}

if(mes==3)
{
	System.out.println("marzo");
}

if(mes==4)
{
	System.out.println("abril");
}

if(mes==5)
{
	System.out.println("mayo");
}

if(mes==6)
{
	System.out.println("junio");
}

if(mes==7)
{
	System.out.println("julio");
}

if(mes==8)
{
	System.out.println("agosto");
}

if(mes==9)
{
	System.out.println("septiembre");
}

if(mes==10)
{
	System.out.println("octubre");
}

if(mes==11)
{
	System.out.println("noviembre");
}

if(mes==12)
{
	System.out.println("diciembre");
}
else(mes<12)
{
	System.out.println("NO es el numero de mes");
}


}



}