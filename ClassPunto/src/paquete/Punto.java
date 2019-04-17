package paquete;

public interface Punto {
	
	public double distancia(Punto2D punto);
	
	public double distanciaAlOrigen();
	
	public String toString();
	
	public int hashCode();
	
	public boolean equals(Object obj);
	
	public Punto2D clone();
	
	public void desplazamiento(Object obj);
	
}
