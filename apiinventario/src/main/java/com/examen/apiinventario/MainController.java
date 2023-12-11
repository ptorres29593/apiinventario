package com.examen.apiinventario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bdd")
public class MainController {

	@Autowired
	MainService mainService;
	
	@CrossOrigin(origins="*")
	@GetMapping(path="/inventario")
	public List<Inventario> getInventario() {
		return mainService.getInventario();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(path="/inventario/{id}")
	public Inventario getInventario(@PathVariable int id) {
		return mainService.getInventario(id);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping(path="/inventario")
	public @ResponseBody boolean postInventario(@RequestBody Inventario inventario) {
		return mainService.insertInventario(inventario);
	}
	
	@CrossOrigin(origins="*")
	@PutMapping(path="/inventario")
	public @ResponseBody boolean putInventario(@RequestBody Inventario inventario) {
		return mainService.updateInventario(inventario);
	}
	
	@CrossOrigin(origins="*")
	@DeleteMapping(path="/inventario")
	public @ResponseBody boolean deleteInventario(@RequestBody Inventario inventario) {
		return mainService.deleteInventario(inventario);
	}
}
