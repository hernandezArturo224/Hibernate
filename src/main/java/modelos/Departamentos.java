package modelos;

import java.io.Serializable;

public class Departamentos implements Serializable{
	
	private int codigo;
	private String nombre;
	private int cod_responsable;
	
	public Departamentos() {
		
	}
	
	public Departamentos(int codigo, String nombre, int codDep) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cod_responsable = codDep;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", cod_responsable=" + cod_responsable + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod_responsable() {
		return cod_responsable;
	}

	public void setCod_responsable(int cod_responsable) {
		this.cod_responsable = cod_responsable;
	}

}
