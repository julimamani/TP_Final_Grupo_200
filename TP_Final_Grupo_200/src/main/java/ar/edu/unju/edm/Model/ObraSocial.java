package ar.edu.unju.edm.Model;

public class ObraSocial {
	private static final long serialVersionUID = 1L;
	Long id;
	String nombre;
	String direcci�n; 
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
	public String getDirecci�n() {
		return direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}
	public ObraSocial(Long id, String nombre, String direcci�n) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direcci�n = direcci�n;
	}

}
