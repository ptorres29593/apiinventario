package com.examen.apiinventario;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class InventarioSerializer extends JsonSerializer<Inventario>{

	@Override
	public void serialize(Inventario val, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
		gen.writeStartObject();
		gen.writeNumberField("id", val.getId());
		gen.writeStringField("Nombre", val.getNombre());
		gen.writeNumberField("Costo", val.getCosto());
		gen.writeNumberField("Cantidad", val.getCantidad());
		gen.writeStringField("Unidad", val.getUnidad());
		gen.writeEndObject();
		
	}

}
