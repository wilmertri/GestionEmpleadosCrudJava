import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado("Pepe", "Arias");
        Horario horarioEmpleado = new Horario(8,5);
        empleado.setHorario(horarioEmpleado);

        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Juliana", "Alvarez");
        empleadoFijo.setSueldo(1500);
        empleadoFijo.setDiasVacaciones(10);

        EmpleadoPorContrato empleadoPorContrato = new EmpleadoPorContrato("Camilo", "Torres");
        empleadoPorContrato.setSueldo(2000);
        empleadoPorContrato.setDuracionContrato(3);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(empleado);
        listaEmpleados.add(empleadoFijo);
        listaEmpleados.add(empleadoPorContrato);

        //Ingresar nuevo empleado
        System.out.println("Ingrese datos del nuevo empleado: ");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        Empleado empleado2 = new Empleado(nombre, apellido);
        listaEmpleados.add(empleado2);

        for (Empleado e : listaEmpleados){
            System.out.println("Nombre: "
                    + e.getNombreCompleto()
                    + " - Sueldo: " + e.getSueldo()
            );
            System.out.println("-----------------------------------------");
        }

        //Buscar empleado a través del nombre
        System.out.println("Ingrese el nombre del empleado a buscar: ");
        String nombreBuscado = scanner.nextLine();
        for (Empleado e : listaEmpleados){
            if(nombreBuscado.equals(e.getNombre())){
                System.out.println("Hemos encontrado al empleado" + e.getNombreCompleto());
            }
        }

        //ArrayList[0 => object, 1 => object, 2 => object, 3]
        //Recorrer listado
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println("Empleado: " + (i + 1) + e.getNombreCompleto());
            System.out.println("============================================");
        }

        //Eliminación de un empleado
        System.out.println("Que empleado desea quitar de la lista: ");
        int indexRemoveEmpleado = scanner.nextInt();
        int indexRealRemove = indexRemoveEmpleado - 1;
        if (indexRealRemove > 0 && indexRealRemove < listaEmpleados.size()){
            listaEmpleados.remove(indexRealRemove);
            System.out.println("Se ha quitado el empleado de la lista");
        }

        //Recorrer listado
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println("Empleado: " + (i + 1) + e.getNombreCompleto());
            System.out.println("============================================");
        }

        //CRUD




    }
}