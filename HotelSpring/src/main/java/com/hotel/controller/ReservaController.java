package com.hotel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.hotel.model.Reserva;
import com.hotel.service.IReservaService;
import com.hotel.service.IUserService;


@Controller
public class ReservaController {
	
	@Autowired
	private IReservaService reservaService;
	
	@Autowired
	private  IUserService userService;
//	
//	@RequestMapping(value="/home")
//	public String home(ModelMap model, Authentication authentication) {
//		authentication.getPrincipal();
//		model.addAttribute("user", service.getDataByUserName(authentication.getName()));
// 		return "user-info";
// 	}
	
	@RequestMapping(value="/inicio")
	public String principal() {
		//Redireccion hacia el jsp del formulario
		return "formulario";
	}
	
	@RequestMapping(value="/verFormulario")
	public String redirigirFormulario(@ModelAttribute("reserva") Reserva reserva) {
		//Redireccion hacia el jsp del formulario
		return "formulario";
	}
	
	@RequestMapping(value="/reservar")
	public String guardarReserva( @ModelAttribute("reserva") Reserva reserva, ModelMap model, BindingResult result) {
		
		//Inserta una reserva enm la tabla
		
		System.out.println("---> " + reserva.getEmail());
		reservaService.insertar(reserva);
		model.addAttribute("mensaje", "Se ha introducido el usuario con email: " + reserva.getEmail());		
		
		return "succes";
	}
	
	@RequestMapping(value="/error")
	public String error() {
 		return "access-denied";
 	}
	
	@RequestMapping(value="/private")
	public String privada(ModelMap model, Authentication authentication) {
				
		authentication.getPrincipal();
		
		//model.addAttribute("user", userService.getDataByUserName(authentication.getName()));
		
		model.addAttribute("lista", reservaService.selectAll());

 		return "listaReservas";
 	}
	
	
	
}	
