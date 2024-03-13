package PrácticaLaboratorio2_2_1;

/*1-Modelar una clase llamada Persona.
2-Considerar al menos CINCO atributos demográficos de una persona.
3-Modelar los métodos set y get para cada atributo.
4-Considerar los métodos comer(...), dormir(...), hacerEjercicio(...). Para cada método decida el protocolo. Cada uno de los tres métodos debe recibir AL MENOS UN PARAMETRO, 
y como comportamiento deben al menos imprimir el valor del parámetros o parámetros que le llegaron.
5-El método comer(...) declararlo como "static". Los otros dos métodos NO son static.
6-Ponga ejemplos de cómo se invocarían comer(...), dormir(...), hacerEjercicio(...).
7-Puede probar la invocación de esos tres métodos, ejecutando el programa. (Opcional)*/




//Paso 1
public class Persona {
	
	//Paso 2
	private String nombre;
	private String apellido;
	private double estatura;
	private int anioNacimiento;
	private String genero;
	
	
	// Paso 3 (Setters y Getters )
	// Nombre
	public void setNombre(String name){
		this.nombre=name;
	}
	
	public String getNombre(){
		return nombre;
	}
	//Apellido
	public void setApellido(String lastname){
		this.apellido=lastname;
	}
	
	public String getApellido() {
		return apellido;
	}
	//Estatura
	public void setEstatura(double height) {
		this.estatura=height;
	}
	
	public double getEstatura() {
		return estatura;
	}
	//Año nacimiento
	public void setAnioNacimiento(int year) {
		this.anioNacimiento=year;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	//Genero
	public void setGenero(String  gender) {
		this.genero=gender;
	}
	
	public String getGenero() {
		return genero;
	}
	
	
	//Paso 4 (Métodos)
	
	public static void comer(String comida, String nombre) {
		
		System.out.println(nombre+ " esta comiendo" + comida);
		
	}
	
	public String  dormir(int hora) {
		
		if(hora>0 && hora<=24) {
			
			if(hora>21 || hora < 7) {
				return "Es hora de dormir, es las " + hora + "hrs";
			}
			else {
				return "No es hora de dormir, es las "+ hora + "hrs";
			}
		}
		return "Hora no validas";
	}
	
	public void hacerEjercicio(String nombre, String tipo, String dia) {
		
		System.out.println(nombre + "entrena en el gym el dia "+dia+" y le toca hacer rutina de " + tipo);
	}
	
	
	
	
	//Método main
	public static void main(String [] args) {
		
	
		Persona persona1 = new Persona();
		
		persona1.nombre="Carlos";		
		persona1.setNombre("Gibran");
		persona1.setApellido("Gatica");
		persona1.setEstatura(1.78);
		persona1.setAnioNacimiento(1998);
		persona1.setGenero("Masculino");
		
		
		Persona.comer(" Milanesa", persona1.getNombre());
		System.out.println(persona1.dormir(23));
		
		
		persona1.hacerEjercicio("Sofia ", " pecho", "Viernes");
		
	}
}
