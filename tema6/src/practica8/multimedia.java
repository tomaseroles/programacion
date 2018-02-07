package practica8;

public class multimedia {
	private String titulo;
	private String autor;
	private String formato;
	private int duracion;
	
	public multimedia(){
		
	}
	
	public multimedia(String titulo, String autor, String formato, int duracion){
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
	
	public String toString(){
		return titulo + "-" + autor + "-" + formato + "-" + duracion;
	}
}
