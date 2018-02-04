package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dao.ReservaDAO;
import com.hotel.model.Reserva;

@Service("reservaService")
@Transactional
public class ReservaService implements IReservaService {
	
	@Autowired
	private ReservaDAO reservaDAO;
	
	
	public void insertar(Reserva reserva) {		
		reservaDAO.insert(reserva);
	}

}
