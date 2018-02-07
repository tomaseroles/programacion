package practica7;

public class mamifero {
	private int patas;
	private String nombre;
	
	public void imprimirPatas(){
		System.out.println(patas);
	}
	
	public mamifero(String nombre, int patas){
		this.nombre=nombre;
		this.patas=patas;
	}
}

