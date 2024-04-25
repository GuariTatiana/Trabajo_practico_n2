package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	
	public enum Categorias {
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTA ;
			}
	
	public enum origenFabricacion {
		ARGENTINA , CHINA , BRASIL, URUGUAY;
	}
	
	private String codigo;
	private String descripcion;
	private Double preciouni;
	private origenFabricacion origenFabricacion;
	private Categorias categorias;
	
	 public Producto(String codigo, String descripcion, double preciouni, origenFabricacion origenFabricacion, Categorias categorias) {
	     this.codigo = codigo;
	     this.descripcion = descripcion;
	     this.preciouni = preciouni;
	     this.origenFabricacion = origenFabricacion;
	     this.categorias = categorias;
	    }
	 
	
	
	
}
