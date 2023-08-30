package productos;

public class Producto implements Comparable {
	
	public String nombre;
	public double precio;

	public Producto(String nombre , double precio){
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		if(((Producto)o).precio > this.precio ) {	
			return -1;
		}
		
		else if(((Producto)o).precio < this.precio ) {
			return 1;
		}
		
		return 0;
	}

}
