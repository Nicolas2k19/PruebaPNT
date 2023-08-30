package productos;

public class Fruta extends Producto {

	String unidadVenta;
	
	Fruta(String nombre, double precio,String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}
	
	
	@Override
	public String toString(){
			
		return "Nombre: "+super.nombre+" ///  Precio: "+ this.precio + " /// Unidad de venta: "+this.unidadVenta;
	}

	
}
