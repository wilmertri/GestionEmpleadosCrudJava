public class EmpleadoPorContrato extends Empleado{

    private int duracionContrato; //Meses

    public EmpleadoPorContrato(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public void mostrarInfoEmpleadoPorContrato(){
        System.out.println("Empleado por Contrato: "
                + super.getNombreCompleto()
                + " tiene un sueldo de: "
                + super.getSueldo()
                + " y su duración del contrato es de: "
                + this.getDuracionContrato() + " meses"
        );
    }
}
