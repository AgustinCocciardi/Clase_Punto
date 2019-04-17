package paquete;

import org.junit.Assert;
import org.junit.Test;

public class Punto2DTest {
	
	@Test
	public void pruebaConstructores(){
		Punto2D punto = new Punto2D(4,4);
		Assert.assertNotNull(punto);
	}
	
	@Test
	public void calcularDistancia(){
		Punto2D punto1 = new Punto2D(2,3);
		Punto2D punto2 = new Punto2D(4,1);
		Assert.assertEquals(punto1.distancia(punto2), Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2)),0.1);
	}
	
	@Test
	public void calcularDistanciaAlOrigen(){
		Punto2D punto = new Punto2D(2,3);
		Assert.assertEquals(punto.distanciaAlOrigen(), Math.sqrt(Math.pow(punto.getX(), 2) + Math.pow(punto.getY(), 2)),0.1);
	}
	
	@Test
	public void pruebaClone(){
		Punto2D punto = new Punto2D(3,1);
		Punto2D nuevo;
		nuevo = punto.clone();
		Assert.assertNotSame(punto, nuevo);
		Assert.assertEquals(punto, nuevo);
	}
	
	@Test
	public void pruebaDesplazamiento(){
		Punto2D punto1 = new Punto2D(3,7);
		Punto2D punto2 = new Punto2D(3,1);
		Punto2D punto3 = new Punto2D(6,8);
		punto1.desplazamiento(punto2);
		Assert.assertEquals(punto1,punto3);
	}
	
}
