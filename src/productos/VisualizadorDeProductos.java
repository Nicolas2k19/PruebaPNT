package productos;

import java.util.Collection;

public class VisualizadorDeProductos {

	

	public void visualizarProductos(Collection<Producto> productos){
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}	
		System.out.println("------------------------------\n------------------------------");
		
	}
}
