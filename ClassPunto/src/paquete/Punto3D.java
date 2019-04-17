package paquete;

import org.junit.Assert;

public class Punto3D extends Punto2D implements Punto{

	private double z;
	
	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ(){
		return this.z;
	}
	
	public double distancia(Punto3D punto){
		return Math.sqrt( Math.pow(punto.getX() - this.getX(), 2) +  Math.pow(punto.getY() - this.getY(), 2) +  Math.pow(punto.z - this.z, 2));
	}
	
	@Override
	public double distanciaAlOrigen(){
		return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2));
	}

	@Override
	public String toString() {
		return "Punto3D: (" + this.getX() + " , " + this.getY() + " , " + z + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
	
	@Override
	public Punto3D clone(){
		Punto3D nuevo = new Punto3D(this.getX(),this.getY(),this.z);
		return nuevo;
	}
	
	public void desplazamiento(Object obj){
		Assert.assertEquals(obj.getClass(), this.getClass());
		Punto3D nuevo = (Punto3D) obj;
		this.setX(this.getX() + nuevo.getX());
		this.setY(this.getY() + nuevo.getY());
		this.z += nuevo.z;
	}
	
}
