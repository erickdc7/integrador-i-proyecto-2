package modelo;

public class Especialidad {

    private int idEspecialidad;
    private String nombreEspecialidad;
    private String grupoPaciente;

    // Constructor vacío
    public Especialidad() {
    }

    // Constructor con parámetros
    public Especialidad(int idEspecialidad, String nombreEspecialidad, String grupoPaciente) {
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.grupoPaciente = grupoPaciente;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getGrupoPaciente() {
        return grupoPaciente;
    }

    public void setGrupoPaciente(String grupoPaciente) {
        this.grupoPaciente = grupoPaciente;
    }

}
