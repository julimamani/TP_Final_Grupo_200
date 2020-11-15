package ar.edu.unju.edm.Model;

public class ObraSocial {
	private static final long serialVersionUID = 1L;
	Long id;
	String nombre;
	String dirección; 
	public ObraSocial() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public ObraSocial(Long id, String nombre, String dirección) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dirección = dirección;
	}

}
