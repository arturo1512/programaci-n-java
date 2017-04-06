public class MedicamentoTest{


public static void main(String []args){

  Medicamento arrMedicamentos[] = new Medicamento[2];
  
  Lector reader = new Lector();
  Precio.iva = 1.16F;
  
  for (int i = 0; i < arrMedicamentos.length ; i ++ ) {
    Medicamento medicamento1 = new Medicamento(); 

    System.out.println("Escribe el nombre del Medicamento");
    medicamento1.setNombre(reader.leeString());
    System.out.println("Escribe el id del Medicamento");
    medicamento1.setId(reader.leeString()); 
  

    System.out.println("Escribe el precio de venta del Medicamento");
    medicamento1.getPrecio().setPriceVenta(reader.leeFloat());
    System.out.println("Escribe el precio de compra del Medicamento");
    medicamento1.getPrecio().setPriceCompra(reader.leeFloat());
    arrMedicamentos[i] = medicamento1;
  }
  
  for (int i = 0; i < arrMedicamentos.length ; i ++ ) {

    System.out.println(arrMedicamentos[i]);  
    System.out.println("Precio Compra IVA:" + arrMedicamentos[i].getPrecio().getPriceCompraIVA());
  }

}



}