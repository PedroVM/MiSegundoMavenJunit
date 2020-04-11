package llamada_metodo;

public class salida {

	public static void main(String[] args) {
		Contenedor llamada=new Contenedor();
		if (llamada.metodo1(1, 1))
		System.out.println("El valor primero es mayor que el segundo");
		else
		System.out.println("El valor del primero no es mayor que el segundo");
		
		}

	}
