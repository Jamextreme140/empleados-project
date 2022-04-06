package EmpList;

import java.util.ArrayList;

public class Vendedor extends Empleado {

	private String Auto;
	private String AreaVta;
	private String telmov;
	
	private ArrayList<String> Clientes = new ArrayList<String>();
	
	public Vendedor(String Nombre, String Apellido, String DNI, String Direccion, int telefono, int salario,
			String sup, String Auto, String AreaVta, String telmov) {
		super(Nombre, Apellido, DNI, Direccion, telefono, salario, sup);
		this.Auto = Auto;
		this.AreaVta = AreaVta;
		this.telmov = telmov;
	}

	public Vendedor() {
		this("", "", "", "", 0, 0, "", "", "", "");
	}

	public String getAuto() {
		return Auto;
	}

	public void setAuto(String auto) {
		Auto = auto;
	}

	public String getAreaVta() {
		return AreaVta;
	}

	public void setAreaVta(String areaVta) {
		AreaVta = areaVta;
	}

	public String getTelmov() {
		return telmov;
	}

	public void setTelmov(String telmov) {
		this.telmov = telmov;
	}

	public ArrayList<String> getClientes() {
		return Clientes;
	}

	public void setClientes(ArrayList<String> clientes) {
		Clientes = clientes;
	}
	
	

}
