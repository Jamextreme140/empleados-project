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

	/*public ArrayList<String> getClientes() {
		return Clientes;
	}

	public void setClientes(ArrayList<String> clientes) {
		Clientes = clientes;
	} */
	
	public void AddCliente(String nombre) { //Añade un elemente a la lista
		Clientes.add(nombre);
	}
	
	public void QuitCliente(int i) { //Quita un elemento de la lista
		Clientes.remove(i);
	}
	
	public void ListClientes() { //Imprime la lista actual de clientes
		for(int i = 0; i < Clientes.size(); i++) {
			System.out.print(i + " - ");
			Clientes.get(i);
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Vendedor [Auto=" + Auto + ", AreaVta=" + AreaVta + ", telmov=" + telmov + ", Clientes=" + Clientes
				+ "]";
	}
	
	

}
