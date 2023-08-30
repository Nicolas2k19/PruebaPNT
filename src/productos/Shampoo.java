package productos;

public class Shampoo extends Producto {

	double contenido;
	
	public Shampoo(String nombre, double precio,double contenido) {
		super(nombre, precio);
		this.contenido = contenido;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString(){
			
		return "Nombre: "+super.nombre+" /// Contenido: "+this.contenido +" /// Precio:"+ super.precio;
	}


}
