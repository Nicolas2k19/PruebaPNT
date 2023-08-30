package productos;

public class Bebida extends Producto{
	
	double litros;

	public Bebida(String nombre, double precio,double litros) {
		super(nombre, precio);
		this.litros = litros;
	}
	
	
	@Override
	public String toString(){
			
		return "Nombre: "+super.nombre+" /// Litros: "+this.litros +" /// Precio: "+ super.precio;
	}

}
