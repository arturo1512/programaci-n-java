import java.io.*;
public class CuidadoMedicamento{
    public String cuidado;
    public String lee;
    public int nivel;

public CuidadoMedicamento(){

}

public void getCuidado(CuidadoMedicamento cm){
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Dame La descricion de cuidados que tiene el medicamento");
	try{
	cuidado=br.readLine();
	}
	catch(IOException e){
	System.out.println(e);
	}
}
public void nivelDeCuidado(CuidadoMedicamento cm){
	cm.getCuidado(this);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Que nivel de cuidado necesita siendo que 10 es el mayor y 1 el menor");
	try{
		lee=br.readLine();
        nivel=Integer.valueOf(lee).intValue();
	}catch(IOException e){
		System.out.println(e);
	}
    cm.niveles(this);
}
public void imprimirCuidado(CuidadoMedicamento cm){
	System.out.println("\n El cuidado es:"+this.cuidado);
	

}
public void niveles(CuidadoMedicamento cm){

     switch(nivel){
        case 1:
        System.out.print("nada");
        break;
        case 2:
        System.out.print("leve");
        break;
        case 3:
        System.out.print("normal");
        break;
        case 4:
        System.out.print("normal");
        break;
        case 5:
        System.out.print("no debe ser expuesto al sol");
        break;
        case 6:
        System.out.print("requiere temperatura controlada");
        break; 
        case 7:
        System.out.print("se necesita un lugar con temperatura controlada y quisa refrigerar");
        break;
        case 8:
        System.out.print("mucho cuidado solo se puede resurtir muy poco");
        break;
        case 9:
        System.out.print("de alta prioridad requiere Refrigeracion constante puede estar periodos cortos sin Refrigeracion");
        break;
        case 10:
        System.out.print("Grave Necesita Refrigeracion constante");
        break;


     }
}


}