package ar.edu.unju.edm.DAO;

import java.util.List;

import ar.edu.unju.edm.Model.Especialidad;

public interface IEspecialidadDAO {
	public void guardarEspecialidad(Especialidad especialidad);
	public List<Especialidad> listarEspecialidad();
}
