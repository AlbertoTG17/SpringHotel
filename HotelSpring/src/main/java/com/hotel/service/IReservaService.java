package com.hotel.service;

import java.util.ArrayList;

import com.hotel.model.Reserva;

public interface IReservaService {

	void insertar(Reserva reserva);
	
	ArrayList<Reserva> selectAll();

}