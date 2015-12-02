package com.ipartek.formacion.holamundo.pojo;
/**
 * Clase instanciable de tipo POJO o BEAN para representar a un <code>Alumno</code> de un curso
 * @author Curso
 *
 */
public class Alumno {

	public static final String NOMBRE_ANONIMO = "Anónimo";
	public static final String NOMBRE_SIN_DEFINIR = "Sin definir";
	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';
	public static final char SEXO_INDEFINIDO = 'I';
	
	//atributos
	private String nombre;
	private String apellidos;
	private boolean becado;
	private int edad;
	private char sexo; //'H': hombre. 'M': mujer. 'I': Indefinido.

	//constructores HECHO
	/**
	 * Un <code>Alumno</code> recién instanciado tendrá los siguientes valores:
	 * <ul>
	 *     <li><code>nombre</code>: <code>NOMBRE_ANONIMO</code></li>
	 *     <li><code>apellido</code>: ""</li>
	 *     <li><code>becado</code>: false</li>
	 *     <li><code>edad</code>: 0</li>
	 *     <li><code>sexo</code>: <code>SEXO_INDEFINIDO</code></li>
	 * </ul> 
	 */
	public Alumno() {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellidos = "";
		this.becado= false;
		this.edad= 0;
		this.sexo= SEXO_INDEFINIDO;
	}
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guardamos el nombre con la primera inicial en Mayúsculas. <br>
	 * Si el nombre es null o vacio, guardar "sin definir".
	 * @param nombre <String> nombre de la persona a guardar.
	 */
	public void setNombre(String nombre) {
		//if(nombre.equals(""))
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//otras funciones
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	/**
	 * Comprueba si es mayor de edad. 
	 * @return true si <code>this.edad</edad>>= 18, false si <18
	 */
	public boolean isMayorEdad(){
		return false;
	}
	
		
}
