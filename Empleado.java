package EmpList;

public class Empleado {
	
	private String Nombre;
	private String Apellido;
	private String DNI;
	private String Direccion;
	private int telefono;
	private int salario;
	private String sup;
	
	public Empleado(String Nombre, String Apellido, String DNI, String Direccion, 
			int telefono, int salario, String sup) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.DNI = DNI;
		this.Direccion = Direccion;
		this.telefono = telefono;
		this.salario = salario;
		this.sup = sup;
	}
	
	public Empleado() {
		this("", "", "", "", 0, 0, "");
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	

	public String getSup() {
		return sup;
	}

	public void setSup(String sup) {
		this.sup = sup;
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Direccion=" + Direccion
				+ ", telefono=" + telefono + ", salario=" + salario + ", sup=" + sup + "]";
	}

	public int IncSal(int porc) {
		return salario + ((porc * salario)/100);
	}

}
