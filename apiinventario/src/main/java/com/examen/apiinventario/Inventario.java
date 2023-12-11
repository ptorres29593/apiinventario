package com.examen.apiinventario;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonSerialize(using = InventarioSerializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Inventario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nombre;
	
	private double costo;
	
	private int cantidad;
	
	private String unidad;
	
}
