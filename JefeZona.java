package EmpList;

import java.util.ArrayList;

public class JefeZona extends Empleado {

	private String despacho;
	private String Secretario;
	private String Auto;
	
	private ArrayList<String> vendors = new ArrayList<String>();
	
	public JefeZona(String Nombre, String Apellido, String DNI, String Direccion, int telefono, int salario,
			String sup, String despacho, String Secretario, String Auto) {
		super(Nombre, Apellido, DNI, Direccion, telefono, salario, sup);
		this.despacho = despacho;
		this.Secretario = Secretario;
		this.Auto = Auto;
	}

	public JefeZona() {
		this("", "", "", "", 0, 0, "", "", "", "");
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getSecretario() {
		return Secretario;
	}

	public void setSecretario(String secretario) {
		Secretario = secretario;
	}

	public String getAuto() {
		return Auto;
	}

	public void setAuto(String auto) {
		Auto = auto;
	}
	
	public void AddVendor(String nombre) { //Añade un elemento a la lista
		vendors.add(nombre);
	}
	
	public void QuitVendor(int i) { //Quita un elemento de la lista
		vendors.remove(i);
	}
	
	public void ListVendors() {
		for(int i = 0; i < vendors.size(); i++) {
			System.out.print(i + " - ");
			vendors.get(i);
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " JefeZona [despacho=" + despacho + ", Secretario=" + Secretario + ", Auto=" + Auto + "]";
	}
	
	

}
