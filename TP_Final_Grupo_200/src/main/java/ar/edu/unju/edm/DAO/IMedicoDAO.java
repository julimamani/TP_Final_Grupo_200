package ar.edu.unju.edm.DAO;

import java.util.List;

import ar.edu.unju.edm.Model.Medico;

public interface IMedicoDAO {
	public void guardarMedico(Medico medico);
	public List<Medico> listarMedico();
	public Medico buscarMedico(Long id);
	
}
