package ejemplo4_CreadoExcepciones;

public class Mail {
	public Mail()
	{
		
	}
	
	public static boolean validarMail (String mail) throws FaltaArrobaException, FaltaPuntoException
	{
		Boolean auxArroba = false;
		Boolean auxPunto = false;
	
		for(int i=0; i < mail.length() ; i++)
		{
			if(mail.charAt(i)== '@')
				auxArroba=true;
			if (mail.charAt(i)== '.')
				auxPunto=true;
		}
		
		if(auxArroba == false)
		{
			//Falta arroba
			FaltaArrobaException exc1= new FaltaArrobaException();
			throw exc1;
		}
		if (auxPunto == false)
		{
			//FaltaPuntoException exc2 = new FaltaPuntoException();
			//throw exc2;
			// No hace falta  guardar dentro de una variable se puede hace lo siguiente
			throw new FaltaPuntoException();
		}
		if (auxArroba && auxPunto) 
		{
			return true;
		}
		return false;
		
	}

}
