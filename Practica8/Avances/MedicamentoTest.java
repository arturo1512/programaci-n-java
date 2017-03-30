public class MedicamentoTest{


public static void main(String []args){
  
  Medicamento medica=new Medicamento();
  Precio price=new Precio();
  CuidadoMedicamento cMedic=new CuidadoMedicamento();
  medica.getNombreMedicamento(medica);
  medica.getPrecio(medica);
  medica.getId(medica);
  medica.imprimir(medica); 
  price.getConiva(price);
  price.imprimir(price);
  cMedic.nivelDeCuidado(cMedic);
  cMedic.imprimirCuidado(cMedic);
}



}