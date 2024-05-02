                                                                                                                                   package dominio;

public class ArticuloGimnasio extends Articulo{
	
	private int peso;
	private final int gramos = 1000;
	
	public int devuelvePesoEnGramos()
	{
		return peso * gramos; 
	}
	
	public ArticuloGimnasio () {
		super();
	}
	public ArticuloGimnasio ( String nombre, int peso) {
		super(nombre); // Primero colocar super, para que cree la instancia.
		               // esto llama al constructor de articulo que pasa el nombre. 
		this.peso=peso;
	}
	public int getPeso() {
		return peso ;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return  super.toString() + ", PESO =" + peso ;
		// en vez de usar esto getId() + getNombre(), usar el toString de Articulo con super ;
	}
}
