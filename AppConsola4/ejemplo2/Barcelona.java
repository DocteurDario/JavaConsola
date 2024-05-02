package ejemplo2;
public class Barcelona implements IEquipo {
	
	private String fechaClub;
	
	public Barcelona() {
		
	}
	public Barcelona(String fechaclub)
	{
		this.fechaClub=fechaclub;
	}
	public String getFechaclub() {
		return fechaClub;
	}

	public void setFechaclub(String fechaClub) {
		this.fechaClub = fechaClub;
	}
	@Override
	public String devuelveInformacion() {
		
		return "Equipo Barcelo ...";
	}
}
