package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	
	 private String codigo;
	    private String descripcion;
	    private double precioUnitario;
	    private OrigenFabricacion origenFabricacion;
	    private Categoria categoria;
	    
	    public Producto() {
	        // Constructor
	    }
	    
	    // Getters y Setters
	    
	    @Override
	    public String toString() {
	        return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
	                + ", origenFabricacion=" + origenFabricacion + ", categoria=" + categoria + "]";
	    }
	    
	    public enum OrigenFabricacion {
	        ARGENTINA, CHINA, BRASIL, URUGUAY
	    }
	    
	    public enum Categoria {
	        TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	    }
		
}
