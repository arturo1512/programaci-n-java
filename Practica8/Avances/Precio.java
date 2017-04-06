import java.io.*;
import java.util.*;

public class Precio {
	
	private float precio_compra;
	private float precio_venta;
	public static float iva;
	
	public Precio() { }

	public void setPriceCompra(float precio) {
		this.precio_compra = precio;
	}

	public float getPriceCompra() {
		return this.precio_compra;
	}

	public void setPriceVenta(float precio) {
		this.precio_venta = precio;
	}

	public float getPriceVenta() {
		return this.precio_venta;
	}

	public float getPriceCompraIVA() {
		return this.precio_compra * this.iva;
	}

	public float getPriceVentaIVA() {
		return this.precio_venta * this.iva;
	}

	public String toString() {
		return "Compra: " +  this.precio_compra + "Venta: " + this.precio_venta;
	}

}