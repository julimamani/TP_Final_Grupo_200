package ar.edu.unju.edm.Model;

import javax.persistence.Id;

public class Especialidad {

	public static final long serialVersionUID =1L;
	@Id
	Long id;
	String nombre;
	public Especialidad() {
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
	public Especialidad(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
}
