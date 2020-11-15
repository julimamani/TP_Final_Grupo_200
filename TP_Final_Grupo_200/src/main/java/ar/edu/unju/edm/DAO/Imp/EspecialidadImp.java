package ar.edu.unju.edm.DAO.Imp;

import java.util.List;

import javax.persistence.EntityManager;

import ar.edu.unju.edm.DAO.IEspecialidadDAO;
import ar.edu.unju.edm.Model.Especialidad;
import ar.edu.unju.edm.conf.EmfSingleton;

public class EspecialidadImp implements IEspecialidadDAO {
	public static EntityManager manager= EmfSingleton.getInstance().getEmf().createEntityManager();
	
	public void guardarEspecialidad(Especialidad especialidad) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(especialidad);
		manager.getTransaction().commit();
	}

	public List<Especialidad> listarEspecialidad() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Especialidad> esp=(List<Especialidad>) manager.createQuery("SELECT e FROM Especialidad e").getResultList();
		return esp;
	}

}
