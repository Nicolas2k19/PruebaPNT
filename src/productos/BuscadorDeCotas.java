package productos;

import java.util.Collection;

public class BuscadorDeCotas {

	
	public String valorMinP(Collection<Producto> productos) {
		
		Producto productoMin = productos.iterator().next();
		
		for (Producto p1 : productos) {
			for (Producto p2 : productos) {
				if(p1.compareTo(productoMin)==-1) {
					productoMin = p2;
				}
			}
		}
				
		return productoMin.nombre;	
	}
	
	
	public String valorMax(Collection<Producto> productos) {
		
		Producto productoMax = productos.iterator().next();
		
		for (Producto p1 : productos) {
			for (Producto p2 : productos) {
				if(p1.compareTo(productoMax)==1) {
					productoMax = p2;
				}
			}
		}
		
		return productoMax.nombre;
		
	}
	
	
	
}
