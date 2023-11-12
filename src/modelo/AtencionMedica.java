package modelo;

public class AtencionMedica {

    private int idMedicoHistoriaClinica;
    private Paciente paciente;  // Representa la relación con la clase Paciente
    private Especialidad especialidad;  // Representa la relación con la clase Especialidad
    private String horaAtencion;
    private String fechaAtencion;
    private String observacionMedica;
    private String indicacionMedica;

    public AtencionMedica() {
    }

    public AtencionMedica(int idMedicoHistoriaClinica, Paciente paciente, Especialidad especialidad, String horaAtencion, String fechaAtencion, String observacionMedica, String indicacionMedica) {
        this.idMedicoHistoriaClinica = idMedicoHistoriaClinica;
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.horaAtencion = horaAtencion;
        this.fechaAtencion = fechaAtencion;
        this.observacionMedica = observacionMedica;
        this.indicacionMedica = indicacionMedica;
    }

    public int getIdMedicoHistoriaClinica() {
        return idMedicoHistoriaClinica;
    }

    public void setIdMedicoHistoriaClinica(int idMedicoHistoriaClinica) {
        this.idMedicoHistoriaClinica = idMedicoHistoriaClinica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getObservacionMedica() {
        return observacionMedica;
    }

    public void setObservacionMedica(String observacionMedica) {
        this.observacionMedica = observacionMedica;
    }

    public String getIndicacionMedica() {
        return indicacionMedica;
    }

    public void setIndicacionMedica(String indicacionMedica) {
        this.indicacionMedica = indicacionMedica;
    }

}
