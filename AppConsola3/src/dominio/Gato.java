package dominio;
public class Gato extends Animal {
	public Gato() { super();  }
	public Gato( String nombre) { super(nombre); }
	@Override public String toString() {
		return "Es Un Gato, Se Llama :"+ getNombre() ;
	}
	@Override public String habilidades() {
		return "El gato tiene gran flexibilidad y elasticidad ";
	}
}
