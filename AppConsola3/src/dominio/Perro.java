package dominio;
public class Perro extends Animal{
	private String raza;
	public Perro () { 
		super();
		raza="sin raza";
	}
	public Perro (String nombre, String raza) {
		super(nombre);
		this.raza=raza;
	}
	public String getRaza() { return raza; 	}
	public void setRaza(String raza) { 	this.raza = raza; 	}
	@Override 	public String toString() {
		return "El nombre del Perror es "+ getNombre() +" su raza=" + raza ;
	}
	@Override public String habilidades() {
		return "El perro puede localizar y separar olores";
	}
}
