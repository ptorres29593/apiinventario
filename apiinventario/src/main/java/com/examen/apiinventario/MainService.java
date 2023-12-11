package com.examen.apiinventario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	public List<Inventario> getInventario(){
		
		List<Inventario> inventario = inventarioRepository.findAll();
		
		System.out.println(" Get request consultada");
		
		return inventario;
	}
	
	public Inventario getInventario(Integer id) {
		Inventario inventario = inventarioRepository.findById(id).orElse(null);
		return inventario;
	}
	
	public boolean insertInventario(Inventario inventario) {
		try {
			inventarioRepository.save(inventario);
		} catch (Exception e) {
			System.out.println("Error al insertar");
			return false;
		}
		return true;
	}
	
	public boolean updateInventario(Inventario inventario) {
		try {
			Inventario i = inventarioRepository.findById(inventario.getId()).orElse(null);
			if (i==null) throw new Exception("No existe");
			/*i.setNombre(inventario.getNombre());
			i.setCosto(inventario.getCosto());
			i.setCantidad(inventario.getCantidad());
			i.setUnidad(inventario.getUnidad());*/
			inventarioRepository.save(inventario);
		} catch (Exception e) {
			System.out.println("Error al actualizar");
			return false;
		}
		return true;
	}
	
	public boolean deleteInventario(Inventario inventario) {
		try {
			inventarioRepository.delete(inventario);
		} catch (Exception e) {
			System.out.println("Error al borrar");
			return false;
		}
		return true;
	}

}
