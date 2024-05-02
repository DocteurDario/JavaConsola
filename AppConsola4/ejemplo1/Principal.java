package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cantante c = new Cantante("Luis","Miguel", true);
		c.cantar();
		
		Pajaro p= new Pajaro(1);
		p.cantar();
		
		//ICantar x= c;
		//Icantar y= new Cantar();
		//Icantar z = p;
	}

}
