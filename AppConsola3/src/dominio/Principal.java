package dominio;
public class Principal {
	public static void main(String[] args) {
		//Animal animal = new Animal("Animal");
		Animal gato = new Gato("pepita");
		Animal perro = new Perro ("Huesos","Galgo");
	
		System.out.println(gato.toString() + " " + gato.habilidades());
		System.out.println(perro.toString()+ " " + perro.habilidades());
	}
}
