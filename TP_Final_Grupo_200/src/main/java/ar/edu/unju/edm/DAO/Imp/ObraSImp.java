package ar.edu.unju.edm.DAO.Imp;

import java.util.List;

import javax.persistence.EntityManager;

import ar.edu.unju.edm.DAO.IObraSocialDAO;
import ar.edu.unju.edm.Model.ObraSocial;
import ar.edu.unju.edm.conf.EmfSingleton;

public class ObraSImp implements IObraSocialDAO {
	public static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	public void guardarOS(ObraSocial obra) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(obra);
		manager.getTransaction().commit();
	}

	public List<ObraSocial> listarObras() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<ObraSocial> obras= (List<ObraSocial>) manager.createQuery("SELECT o FROM ObraSocial o").getResultList();
		return obras;
	}

}
