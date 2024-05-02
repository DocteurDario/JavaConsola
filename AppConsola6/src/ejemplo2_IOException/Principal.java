package ejemplo2_IOException;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Principal {

	public static void main(String[] args) {

		// IOException siempre van a estar dentro de un bloque try y catch
		
		try {
			Image image= ImageIO.read( new File("scr/imagen-gif"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("no de pudo acceder a la imagen");
			
		} finally{
			//siempre se va a ejec utar, se produzca o no el error
		}
		
	}

}
