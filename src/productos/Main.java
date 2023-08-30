package productos;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		/*Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

		Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

		Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

		Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo */
		
		
		Collection<Producto> productos = new  ArrayList<Producto>();
		VisualizadorDeProductos visualizador = new VisualizadorDeProductos();
		BuscadorDeCotas buscador = new BuscadorDeCotas();
		
		Producto cocaZero = new Bebida("Coca-Cola Zero",20.00,1.5);
		Producto coca = new Bebida("Coca-Cola",18.00,1.5);
		Producto shampoSedal = new Shampoo("Shampoo Sedal",19.00,500.00);
		Producto frutillas = new Fruta("Frutillas",64.00,"kilo");
		
		productos.add(cocaZero);
		productos.add(coca);
		productos.add(shampoSedal);
		productos.add(frutillas);
		
		visualizador.visualizarProductos(productos);
		System.out.println("Valor más caro: "+buscador.valorMax(productos)+"\nValor más barato "+ buscador.valorMinP(productos));

	}

}
