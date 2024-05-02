package ejemplo4_CreadoExcepciones;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		try
		{
			String correo = JOptionPane.showInputDialog("Ingese correo electronico: ");
			Mail.validarMail(correo);
		}
		catch (FaltaArrobaException e)
		{
			System.out.println("Error FaltaArrobaException ");
			e.printStackTrace();
		}
		catch(FaltaPuntoException e)
		{
			System.out.println("Error FaltaPuntoException ");
			e.printStackTrace();
		}
		finally
		{
			
		}
		
		
	}

}
