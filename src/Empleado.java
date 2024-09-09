public class Empleado extends Persona{
    private Horario horario;
    private int sueldo;

    public Empleado(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarInformacion(){
        System.out.println("Empleado: "
                + super.getNombreCompleto()
                + " tiene un horario: "
                + this.getHorario().getStringHorario()
        );
    }
}
