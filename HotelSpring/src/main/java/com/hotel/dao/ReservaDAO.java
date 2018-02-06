package com.hotel.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	
//	@Autowired
//	private SessionFactory sessionFactory ;
//	
//	protected Session getSession(){
//        return sessionFactory.getCurrentSession();
//    }
	
	public void insert (Reserva reserva) {
		hibernateTemplate.persist(reserva);		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Reserva> selectAll(){
		
		//Criteria criteria = getSession().createCriteria("");
		return (ArrayList<Reserva>) hibernateTemplate.find("from Reserva");
		
	}

}
