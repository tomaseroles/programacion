package practica8;

public class pelicula extends multimedia {
	private String actor;
	private String actriz;
	
	public pelicula(){
		
	}
	
	public pelicula(String actor, String actriz){
		this.actor=actor;
		this.actriz=actriz;
	}
	
	public pelicula(String actor, int b){
		this.actor=actor;
	}
	
	public pelicula(String actriz){
		this.actriz=actriz;
	}
}
