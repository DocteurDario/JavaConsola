package dominio;

public class Articulo {
	private int id;
	private String nombre;
	private static int cont=0;
	public Articulo() {
		cont ++;
		id=cont;
		nombre="sin nombre";
	}
	public Articulo(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + "]";
	}
}
