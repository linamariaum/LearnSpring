package InversionOfControl;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion obj empleado
		Empleados empleado1 = new DirectorEmpleado();
		
		//USo de los obj creados
		System.out.println(empleado1.getTareas());
	}

}
