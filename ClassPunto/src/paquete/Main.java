package paquete;

public class Main {

	public static void main(String[] args) {
		Punto2D puntoA = new Punto2D(3,1);
		Punto3D puntoB = new Punto3D(4,1,9);
		Punto puntoC = new Punto2D(1,6);
		
		System.out.println(puntoA);
		System.out.println(puntoB);
		System.out.println(puntoC);
		
		puntoB.desplazamiento(new Punto3D(1,1,1));
		System.out.println(puntoB);
		
	}

}
