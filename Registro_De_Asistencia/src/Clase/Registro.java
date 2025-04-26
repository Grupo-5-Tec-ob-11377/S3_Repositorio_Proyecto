package Clase;

public class Registro {
	private int cod;
	private String nom;
	private static int Cant = 0;
	
	public Registro(int Cod ,String Nom) {
		cod = Cod;
		nom = Nom;
		Cant++;
			
	}

	public int Cantidad() {
		return Cant;
	}
	

}
