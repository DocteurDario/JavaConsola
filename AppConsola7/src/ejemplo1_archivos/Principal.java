package ejemplo1_archivos;

public class Principal {
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		archivo.setRuta("prueba.txt"); // Ruta relatiba, se guarda dentro del proyecto
		
		if(archivo.existe())
		{
			System.out.println("Existe archivo");
		}
		else
		{
			 System.out.println("No existe archivo entonces lo creo");
			 archivo.creaArchivo();
		}
		//ESCRITURA:
		//archivo.escribe_letra_x_letra(" Bienvenidos a Lab V ");
		
		//LECTURA:
		//archivo.escribe_letra_x_letra(" Bienvenidos a Lab V ");
		
		//Lectura:
		archivo.escribe_lineas("Escribe este texto \n Escribir este otro texto");
		
		System.out.println("\n A CONTINUACIÓNLEE lee de a lineas ");
		archivo.lee_lineas();
	}

}
