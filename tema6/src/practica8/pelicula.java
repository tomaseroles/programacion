package practica8;

public class pelicula extends multimedia {
	private String actor;
	private String actriz;
	
	public pelicula(){
		
	}
	
	public pelicula(multimedia m, String actor, String actriz){
            super(m.getTitulo(), m.getAutor(), m.getFormato(),m.getDuracion());
            if(actor==null && actriz==null){
                System.out.println("No se puede dar de alta la pelicula.\nSe tiene que indicar al menos un parametro");
            } else{
                this.actor=actor;
                this.actriz=actriz;
            }
	}
        
        @Override public String toString(){
            return super.toString() + " Reparto: " + this.actor + "/" + this.actriz;
        }
        
        public void setActor(String actor){
            this.actor=actor;
        }
        
        public void setActriz(String actriz){
            this.actriz=actriz;
        }
}
