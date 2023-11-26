package modelo;

public class CitaMedica {

    private int idCitaMedica;
    private Especialidad especialidad;
    private String fechaCita;
    private String horaCita;
    private String motivoCita;

    // Constructor vacío
    public CitaMedica() {
    }

    // Constructor con parámetros
    public CitaMedica(int idCitaMedica, Especialidad especialidad, String fechaCita, String horaCita, String motivoCita) {
        this.idCitaMedica = idCitaMedica;
        this.especialidad = especialidad;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivoCita = motivoCita;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(int idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

}
