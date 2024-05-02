package dominio;
public abstract class Animal {
	private String nombre ;
	public String getNombre() { return nombre;	}
	//contructores 
	public Animal () { 	nombre ="sin nombre"; 	} 
	public Animal (String nombre) { this.nombre = nombre;}
	//setters y getters
	public void setNombre(String nombre) { this.nombre = nombre;	}
    @Override 
	public String toString() { return "Animal, Su nombre es : " + nombre ;	}
    public abstract String habilidades();
}
