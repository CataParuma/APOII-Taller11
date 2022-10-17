
public class Persona {

	private String nombre;
	private char sexo;
	private int edad, dni, peso;
	private double altura;

	public Persona() {

		nombre = " ";
		sexo = 'H';
		edad = 0;
		generaDNI();
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, char sexo, int edad) {

		this.nombre = nombre;
		comprobarSexo(sexo);
		this.edad = edad;
		generaDNI();
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, char sexo, int edad, int peso, double altura) {

		this.nombre = nombre;
		comprobarSexo(sexo);
		this.edad = edad;
		generaDNI();
		this.peso = peso;
		this.altura = altura;
	}

	public int calcularIMC() {

		double detPeso = peso / (altura * altura);

		if (detPeso < 20) {
			return -1;
		} else if (detPeso >= 20 && detPeso <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean esMayorDeEdad() {

		boolean detEdad;

		if (edad >= 18) {

			detEdad = true;
		} else {

			detEdad = false;
		}

		return detEdad;
	}

	private void comprobarSexo(char sexo) {

		if (sexo != 'M') {

			this.sexo = 'H';
		}
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	private void generaDNI() {

		dni = (int) (10000000 + Math.random() * 90000000);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
