package paquete;

import org.junit.Assert;

public class Punto2D implements Punto {

	private double x;
	private double y;
	
	public Punto2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double distancia(Punto2D punto){
		return Math.sqrt(Math.pow((punto.x - this.x),2) + Math.pow(punto.y - this.y, 2));
	}
	
	public double distanciaAlOrigen(){
		return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y, 2));
	}

	@Override
	public String toString() {
		return "Punto2D: (" + x + " , " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	@Override
	public Punto2D clone(){
		Punto2D nuevo = new Punto2D(this.x,this.y);
		return nuevo;
	}
	
	public void desplazamiento(Object obj){
		Assert.assertEquals(obj.getClass(), this.getClass());
			Punto2D punto = (Punto2D) obj;
			this.x += punto.x;
			this.y += punto.y;	
	}
	
}
