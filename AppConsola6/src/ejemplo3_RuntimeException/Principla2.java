package ejemplo3_RuntimeException;

import javax.swing.JOptionPane;

public class Principla2 {
	public static void main(String[] args) {
		
		int res=0;
		try {
			int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1"));
			int num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2"));
			res= num1/num2;
			
		} catch (ArithmeticException e) 
		{
			JOptionPane.showMessageDialog(null, "Error por divisi�n por cero");
			System.out.println("Error por divisi�n por cero");
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error se necesita formato num�rico");
			System.out.println("Error se necesita formato num�rico");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			if(res == 0)
			JOptionPane.showMessageDialog(null, "resultado : nulo");
			else {
				JOptionPane.showMessageDialog(null, "resultado : " + res );
			}

		}
		
	}
	
}
