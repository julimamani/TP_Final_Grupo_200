package ar.edu.unju.edm.Model;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class Reserva {
	private static final long serialVersionUID=1L;
	@Id
	Long id;
	LocalDateTime fechaHora;
	Paciente paciente;
	Medico medico;
	int consultorio;
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public int getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}
	public Reserva(Long id, LocalDateTime fechaHora, Paciente paciente, Medico medico, int consultorio) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.paciente = paciente;
		this.medico = medico;
		this.consultorio = consultorio;
	}

}
