package llamada_metodo;
public class Contenedor	 {
	boolean valor=true;
	public boolean metodo1(int a, int b) {
		if (a<=b) 
			valor=false;
		return valor;
	}

}
