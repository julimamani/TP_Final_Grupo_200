package ar.edu.unju.edm.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

public class Medico {
	
	private static final long serialVersionUID = 1L;
	@Id
	Long id;
	int matricula;
	int dni;
	String nombre;
	String apellido;
	String telefono;
	Especialidad especialidad; 
	public Medico() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Medico [  id=" + id + ", matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
	}
	public Medico(Long id, int matricula, int dni, String nombre, String apellido, String telefono,
			Especialidad especialidad) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	
	public List<Reserva> consultarR(LocalDate f1, LocalDate f2){
		//for( List<Reserva> todas;;) {
			//for (Reserva reserva : Reserva.class.) {
				
			//}
	
		return null;
	}
	
}
