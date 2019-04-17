package paquete;

import org.junit.Assert;
import org.junit.Test;

public class Punto3DTest {

	@Test
	public void pruebaConstructores(){
		Punto3D punto = new Punto3D(1,2,3);
		Assert.assertNotNull(punto);
	}
	
	@Test
	public void calcularDistancia(){
		Punto3D punto1 = new Punto3D(2,2,2);
		Punto3D punto2 = new Punto3D(1,1,1);
		Assert.assertEquals(Math.sqrt(3),punto1.distancia(punto2),0.1);
	}
	
	@Test
	public void calcularDistanciaAlOrigen(){
		Punto3D punto = new Punto3D(2,2,2);
		Assert.assertEquals(Math.sqrt(12), punto.distanciaAlOrigen() ,0.1);
	}
	
	@Test
	public void pruebaClone(){
		Punto3D punto = new Punto3D(3,1,2);
		Punto3D nuevo;
		nuevo = punto.clone();
		Assert.assertNotSame(punto, nuevo);
		Assert.assertEquals(punto, nuevo);
	}
	
	@Test
	public void pruebaDesplazamiento(){
		Punto3D punto1 = new Punto3D(1,1,1);
		Punto3D punto2 = new Punto3D(2,2,2);
		punto1.desplazamiento(punto2);
		Punto3D punto3 = new Punto3D(3,3,3);
		Assert.assertEquals(punto3, punto1);
	}
}
