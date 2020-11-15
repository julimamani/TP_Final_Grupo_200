package ar.edu.unju.edm.DAO;

import java.util.List;

import ar.edu.unju.edm.Model.ObraSocial;

public interface IObraSocialDAO {
	public void guardarOS(ObraSocial obra);
	public List<ObraSocial> listarObras();
}
