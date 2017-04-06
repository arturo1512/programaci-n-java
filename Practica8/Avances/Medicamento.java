import java.io.*;
import java.util.*;

public class Medicamento{

    private String id;
    private String nombre;
    private Precio precio;

    public Medicamento() { 
        precio = new Precio();
    }

    public void setId(String id_p) {
        this.id = id_p;
    }

    public String getId() {
        return this.id;
    }

    public void setNombre(String nombre_p) {
        this.nombre = nombre_p;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Precio getPrecio() {
        return this.precio;
    } 

    public String toString() {
        return ("El medicamento es:"+this.nombre) +
        ("El ID_numerico del medicamento es:"+this.id)+
        ("El precio del medicamento es:"+ this.precio);
    }


}