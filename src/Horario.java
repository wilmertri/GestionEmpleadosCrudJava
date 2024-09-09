public class Horario {
    private int horaEntrada;
    private int horaSalida;
    private int horaDescanso;

    public Horario(int horaEntrada, int horaSalida){
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getStringHorario(){
        return this.getHoraEntrada()
                + "am a "
                + this.getHoraSalida()
                + "pm.";
    }

    public void mostrarHorario(){
        System.out.println(this.getStringHorario());
    }
}
