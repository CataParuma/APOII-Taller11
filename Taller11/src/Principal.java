import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite el nombre: ");
		String nombre = sc.next();

		System.out.println("Digite el sexo: H o M");
		char sexo = sc.next().charAt(0);

		System.out.println("Digite la edad: ");
		int edad = sc.nextInt();

		System.out.println("Digite el peso: ");
		int peso = sc.nextInt();

		System.out.println("Digite la altura: ");
		double altura = sc.nextDouble();

		Persona p1 = new Persona(nombre, sexo, edad, peso, altura);
		Persona p2 = new Persona(nombre, sexo, edad);
		Persona p3 = new Persona();

		p3.setNombre("Samuel");
		p3.setSexo('H');
		p3.setEdad(15);
		p3.setPeso(60);
		p3.setAltura(1.64);

		// Objeto 1

		System.out.println(p1.toString());

		int x = p1.calcularIMC();

		if (x == -1) {
			System.out.println("Esta por debajo de su peso ideal");

		} else if (x == 0) {
			System.out.println("Esta en su peso ideal");

		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p1.esMayorDeEdad() == true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}

		// Objeto 2

		System.out.println(p2.toString());

		int y = p2.calcularIMC();

		if (y == -1) {
			System.out.println("Esta por debajo de su peso ideal");

		} else if (y == 0) {
			System.out.println("Esta en su peso ideal");

		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p2.esMayorDeEdad() == true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}

		// Objeto 3

		System.out.println(p3.toString());

		int z = p3.calcularIMC();

		if (z == -1) {
			System.out.println("Esta por debajo de su peso ideal");

		} else if (z == 0) {
			System.out.println("Esta en su peso ideal");

		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p3.esMayorDeEdad() == true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
	}
}
