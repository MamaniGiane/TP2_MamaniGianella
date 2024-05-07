package ar.edu.unju.fi.ejercicio1.model;

import ar.edu.unju.fi.ejercicio1.model.constantes.paises;

import ar.edu.unju.fi.ejercicio1.model.constantes.categoria;

public class producto {

	private static int codigo;
	private static String descripcion;
	private static int preunitario;
	private static paises origen;
	private static categoria categoria;
	
	
	public producto(int codigo, String descripcion, int preunitario, paises origen,
			ar.edu.unju.fi.ejercicio1.model.constantes.categoria categoria) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.preunitario = preunitario;
		this.origen = origen;
		this.categoria = categoria;
	}
	
	
	public producto() {
		// TODO Auto-generated constructor stub
	}


	public static int getCodigo() {
		return codigo;
	}
	public static String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static int getPreunitario() {
		return preunitario;
	}
	public void setPreunitario(int preunitario) {
		this.preunitario = preunitario;
	}
	public static paises getOrigen() {
		return origen;
	}
	public void setOrigen(paises origen) {
		this.origen = origen;
	}
	public static categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public static void mostrarProductos(int size) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
