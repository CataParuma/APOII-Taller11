
public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta() {
		
		if (cantidad < 0) {
			cantidad = 0;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public double ingresar(double cantidad) {
		
		if (cantidad>0)
			this.cantidad+=cantidad;
	
		return cantidad;
	}
	
	public double retirar(double cantidad) {
		
		this.cantidad-=cantidad;
		
		if (this.cantidad<0) {
			this.cantidad=0;
		}
	
		return cantidad;
	}
}
