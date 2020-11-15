package ar.edu.unju.edm.DAO;

import java.util.List;

import ar.edu.unju.edm.Model.Reserva;

public interface IReservaDAO {
	public void guardarReserva(Reserva reserva);
	public List<Reserva> listarReserva();
}
