public class EmpleadoFijo extends Empleado{
    private double bono;
    private int diasVacaciones;

    public EmpleadoFijo(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public void mostrarInfoEmpleadoFijo(){
        System.out.println("Empleado fijo: "
                + super.getNombreCompleto()
                + " tiene un sueldo de: "
                + super.getSueldo()
        );
    }
}
