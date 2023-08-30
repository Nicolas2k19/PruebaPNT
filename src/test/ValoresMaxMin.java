package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import productos.Bebida;
import productos.BuscadorDeCotas;
import productos.Producto;
import productos.Shampoo;

class ValoresMaxMin {

	private static Collection<Producto> productos = new  ArrayList<Producto>();
	private static BuscadorDeCotas buscador = new BuscadorDeCotas();
	
	
	@BeforeEach
	void precondicion() {
		Producto cocaZero = new Bebida("Coca-Cola Zero",20.00,1.5);
		Producto coca = new Bebida("Coca-Cola",18.00,1.5);
		Producto shampoSedal = new Shampoo("Shampoo Sedal",19.00,500.00);
		Producto frutillas = new Bebida("Frutillas",64.00,1.5);
		Producto barata = new Bebida("Bebiba más barata",2.00,1.5);
		Producto cara = new Bebida("Bebiba más cara",999.00,1.5);
		
		productos.add(cocaZero);
		productos.add(coca);
		productos.add(shampoSedal);
		productos.add(frutillas);
		productos.add(barata);
		productos.add(cara);
	}
	
	@Test
	void valorMin() {
		assertTrue(buscador.valorMinP(productos).equals("Bebiba más barata"));
	}
	
	@Test
	void valorMax() {
		assertTrue(buscador.valorMax(productos).equals("Bebiba más cara"));
	}


}
