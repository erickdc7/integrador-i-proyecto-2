package modelo;

public class AtencionMedica {

    private int idMedicoHistoriaClinica;
    private int idPaciente;
    private int idEspecialidad;
    private String horaAtencion;
    private String fechaAtencion;
    private String observacionMedica;
    private String indicacionMedica;

    public AtencionMedica() {
    }

    public AtencionMedica(int idMedicoHistoriaClinica, int idPaciente, int idEspecialidad, String horaAtencion, String fechaAtencion, String observacionMedica, String indicacionMedica) {
        this.idMedicoHistoriaClinica = idMedicoHistoriaClinica;
        this.idPaciente = idPaciente;
        this.idEspecialidad = idEspecialidad;
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

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
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
