package ar.edu.unju.edm.Model;
import javax.persistence.Id;


public class Paciente {
	public static final long serialVersionUID=1L;
	@Id
	Long id;
	int dni;
	String nombre;
	String apellido; 
	int edad;
	ObraSocial obraSocial;
	public Paciente(Long id, int dni, String nombre, String apellido, int edad, ObraSocial obraSocial,
			String telefono) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.obraSocial = obraSocial;
		this.telefono = telefono;
	}

	String telefono;

	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
