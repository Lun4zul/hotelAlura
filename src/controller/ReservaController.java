package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

public class ReservaController {
	private ReservaDAO reservaDAO;
	
	public ReservaController() {
	
		Connection connection = new ConnectionFactory().recuperarConexion();
		this.reservaDAO = new ReservaDAO(connection);
		}
		public void guardar(Reserva reserva)	{
			this.reservaDAO.guardar(reserva);
		}
		public List<Reserva> buscar() {
			return this.reservaDAO.buscar();
		}
		
		public List<Reserva> buscarId(String id) {
			return this.reservaDAO.buscarId(id);
		}
		
		public void actualizar(Date fechaE, Date fechaS, String valor, String forma_pago, Integer id) {
			this.reservaDAO.Actualizar(fechaE, fechaS, valor, forma_pago, id);
		}
		
		public void Eliminar(Integer id) {
			this.reservaDAO.Eliminar(id);
		}
}
