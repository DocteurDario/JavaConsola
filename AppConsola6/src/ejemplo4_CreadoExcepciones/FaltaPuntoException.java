package ejemplo4_CreadoExcepciones;

public class FaltaPuntoException extends RuntimeException{
	
	public FaltaPuntoException() 
	{
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Falta colocar punto ";
	}
	
	
}
