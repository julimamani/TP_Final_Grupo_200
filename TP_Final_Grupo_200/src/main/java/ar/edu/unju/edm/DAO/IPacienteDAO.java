package ar.edu.unju.edm.DAO;

import java.util.List;

import ar.edu.unju.edm.Model.Paciente;

public interface IPacienteDAO {
	public void guardarPaciente(Paciente paciente);
	public List<Paciente> listarPaciente();
}
