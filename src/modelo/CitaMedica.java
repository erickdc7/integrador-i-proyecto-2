package modelo;

public class CitaMedica {

    private int idCitaMedica;
    private Paciente paciente; // Clase Paciente como referencia a la FK1
    private Medico medico; // Clase Medico como referencia a la FK2
    private Especialidad especialidad; // Clase Especialidad como referencia a la FK3
    private String fechaCita;
    private String horaCita;
    private String descripcionCita;

    public CitaMedica() {
    }

    public CitaMedica(int idCitaMedica, Paciente paciente, Medico medico, Especialidad especialidad, String fechaCita, String horaCita, String descripcionCita) {
        this.idCitaMedica = idCitaMedica;
        this.paciente = paciente;
        this.medico = medico;
        this.especialidad = especialidad;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.descripcionCita = descripcionCita;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(int idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }

}
