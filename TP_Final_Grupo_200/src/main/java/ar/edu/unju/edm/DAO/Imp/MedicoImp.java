package ar.edu.unju.edm.DAO.Imp;

import java.util.List;
import javax.persistence.EntityManager;
import ar.edu.unju.edm.DAO.IMedicoDAO;
import ar.edu.unju.edm.Model.Medico;
import ar.edu.unju.edm.conf.EmfSingleton;

public class MedicoImp implements IMedicoDAO {
	private static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	
	public List<Medico> listarMedico() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Medico> medicos= (List<Medico>) manager.createQuery("SELECT e FROM Medico e").getResultList();
		return medicos;
	}

	public void guardarMedico(Medico medico) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(medico);
		manager.getTransaction().commit();	
	}

	public Medico buscarMedico(Long id) {
		// TODO Auto-generated method stub	
		return manager.find(Medico.class, id);
	}

}
