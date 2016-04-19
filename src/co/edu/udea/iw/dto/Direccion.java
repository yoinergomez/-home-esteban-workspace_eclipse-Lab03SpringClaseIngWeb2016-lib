package co.edu.udea.iw.dto;

public class Direccion {

	private DireccionId id;
	private String direccion;
	private String telefono;
	private Ciudad ciudad;
	private boolean preferida;
	
	public DireccionId getId() {
		return id;
	}
	public void setId(DireccionId id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public int isPreferida() {
		if(this.preferida){
			return 1;
		}else{
			return 0;
		}
	}
	public void setPreferida(Long preferida) {
		if(preferida==null || preferida==0){
			this.preferida=false;
			return;
		}else{
			this.preferida=true;
		}
	}
	
	
	
}
