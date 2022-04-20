package com.max.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.openshift.model.Contatto;

@RestController
public class ServiceRestController {

	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Marco", "Rossi", "marco"));
		lista.add(new Contatto("Giovanni", "Rossi", "gio"));
		return lista;
	}

}
