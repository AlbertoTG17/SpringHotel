package com.hotel.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="reservas")
public class Reserva {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idreserva")
    private int idReserva;
	
	@Column(name="email")
	private String email;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="fecha_entrada")
	private LocalDate fechaEntrada;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="fecha_salida")
	private LocalDate fechaSalida;
	
	@Column(name="personas")
	private int personas;

	
	//GET Y SET
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}
	
	
	

}
