package EmpList;

public class Secretario extends Empleado {

	private String despacho;
	private int fax;
	private float incsalanual;
	
	public Secretario(String Nombre, String Apellido, String DNI, String Direccion, int telefono, int salario,
			String sup, String despacho, int fax, float incsalanual) {
		super(Nombre, Apellido, DNI, Direccion, telefono, salario, sup);
		this.despacho = despacho;
		this.fax = fax;
		this.incsalanual = incsalanual;
		
		incsalanual = (5 * 100) / 100;
	}

	public Secretario() {
		this("", "", "", "", 0, 0, "", "", 0, 0);
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return super.toString() + "Secretario [despacho=" + despacho + ", fax=" + fax + ", incsalanual=" + incsalanual + "]";
	}
	
	public int IncSal(int porc) {
		return getSalario() + ((porc * getSalario())/100);
	}

}
