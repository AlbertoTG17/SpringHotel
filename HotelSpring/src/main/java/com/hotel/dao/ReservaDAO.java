package com.hotel.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.model.Reserva;

@Repository("reservaDAO")
@Transactional
public class ReservaDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insert (Reserva reserva) {
		hibernateTemplate.persist(reserva);		
	}

}
