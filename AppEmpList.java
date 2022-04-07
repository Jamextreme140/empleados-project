package EmpList;
import java.util.Scanner;
public class AppEmpList {

	public static void main(String[] args) {
		Empleado Mario = new Empleado();
		Scanner read = new Scanner(System.in);
		
		Mario.setNombre(read.next());
		Mario.setApellido(read.next());
		Mario.setDNI(read.next());
		Mario.setDireccion(read.next());
		Mario.setTelefono(read.nextInt());
		Mario.setSalario(read.nextInt());
		Mario.setSup(read.next());
		System.out.println("");
		Mario.toString();

	}

}
