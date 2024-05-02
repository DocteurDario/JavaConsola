package dominio;

public class Principal {

	public static void main(String[] args) {
		ArticuloGimnasio artG1 = new ArticuloGimnasio();
		artG1.setNombre("Mancuerna");
		artG1.setPeso(5);
		
		System.out.println(artG1.toString());
		System.out.println(artG1.devuelvePesoEnGramos()+", Gramos");
	}
}

