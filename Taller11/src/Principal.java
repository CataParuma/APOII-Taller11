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
		
		//Objeto 1
		if (p1.calcularIMC(peso)==-1) {
			System.out.println("Esta por debajo de su peso ideal");
			
		} else if (p1.calcularIMC(peso)==0) {
			System.out.println("Esta en su peso ideal");
			
		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p1.esMayorDeEdad(edad)==true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		System.out.println(p1.toString());
		
		//Objeto 2
		if (p2.calcularIMC(peso)==-1) {
			System.out.println("Esta por debajo de su peso ideal");
			
		} else if (p2.calcularIMC(peso)==0) {
			System.out.println("Esta en su peso ideal");
			
		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p2.esMayorDeEdad(edad)==true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		System.out.println(p2.toString());
		
		//Objeto
		if (p3.calcularIMC(peso)==-1) {
			System.out.println("Esta por debajo de su peso ideal");
			
		} else if (p3.calcularIMC(peso)==0) {
			System.out.println("Esta en su peso ideal");
			
		} else {
			System.out.println("Tiene sobrepeso");
		}

		if (p3.esMayorDeEdad(edad)==true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		System.out.println(p3.toString());
	
	}

}
