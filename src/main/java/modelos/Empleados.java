package modelos;

import java.io.Serializable;
import java.util.Date;

public class Empleados implements Serializable{
	
	private int codigo;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String lugar_nacimiento;
	private Date fecha_nacimiento;
	private String direccion;
	private String telefono;
	private String puesto;
	private int cod_departamento;

	public Empleados() {
		
	}
	
	public Empleados(int codigo, String nombre,String ap1, String ap2, String LugNacimiento, Date fechaNac, String direccion, String telefono, String puesto, int codigoDep) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido1 = ap1;
		this.apellido2 = ap2;
		this.lugar_nacimiento = LugNacimiento;
		this.fecha_nacimiento = fechaNac;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puesto = puesto;
		this.cod_departamento = codigoDep;
	}

	@Override
	public String toString() {
		return "Empleados [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", lugar_nacimiento=" + lugar_nacimiento + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", puesto=" + puesto + ", cod_departamento="
				+ cod_departamento + "]";
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}
	
}
