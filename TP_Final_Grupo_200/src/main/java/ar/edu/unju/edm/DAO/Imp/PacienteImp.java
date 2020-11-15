package ar.edu.unju.edm.DAO.Imp;

import java.util.List;

import javax.persistence.EntityManager;

import ar.edu.unju.edm.DAO.IPacienteDAO;
import ar.edu.unju.edm.Model.Paciente;
import ar.edu.unju.edm.conf.EmfSingleton;

public class PacienteImp implements IPacienteDAO {
	private static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	public List<Paciente> listarPaciente(){
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Paciente> pacientes= (List<Paciente>) manager.createQuery("SELECT e FROM Paciente e").getResultList();
		return pacientes;		
	}

	public void guardarPaciente (Paciente paciente) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(paciente);
		manager.getTransaction().commit();
		
	}

	
	

}
