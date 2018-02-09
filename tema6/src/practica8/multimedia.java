package practica8;

public class multimedia {
	private String titulo;
	private String autor;
	private String formato;
	private int duracion;
	//private pelicula peli;
        
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
        
        public String getTitulo(){
            return titulo;
        }
        
        public String getAutor(){
            return autor;
        }
        
        public String getFormato(){
            return formato;
        }
        
        public int getDuracion(){
            return duracion;
        }
}
