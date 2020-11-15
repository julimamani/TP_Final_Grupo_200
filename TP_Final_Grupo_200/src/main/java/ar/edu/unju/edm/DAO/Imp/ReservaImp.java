package ar.edu.unju.edm.DAO.Imp;

import java.util.List;

import javax.persistence.EntityManager;

import ar.edu.unju.edm.DAO.IReservaDAO;
import ar.edu.unju.edm.Model.Reserva;
import ar.edu.unju.edm.conf.EmfSingleton;

public class ReservaImp implements IReservaDAO {
	private static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	public void guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(reserva);
		manager.getTransaction().commit();
	}

	public List<Reserva> listarReserva() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Reserva> reservas = (List<Reserva>) manager.createQuery("SELECT r FROM Reserva r").getResultList();
		return reservas;
	}

}
