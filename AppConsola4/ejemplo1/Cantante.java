package ejemplo1;

public class Cantante extends Persona implements ICantar{
	
	
	
	private boolean estudios;
	
	
	public Cantante()
	{
		super();
	}
	
	public Cantante (String nombre, String apellido, boolean estudios)
	{
		super(nombre, apellido);
		this.estudios=estudios;
	}
	@Override
	public void cantar() {
		System.out.println("LA la la la la la lalalala!...");
		
	}
	
	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return "Cantante [estudios=" + estudios + "]";
	}

	
	

	
	
	
	
	
}
