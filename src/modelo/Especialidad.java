package modelo;

public class Especialidad {

    private int idEspecialidad;
    private String nombreEspecialidad;
    private String descripcionEspecialidad;
    private String restriccionEspecialidad;

    // Constructor vacío
    public Especialidad() {
    }

    // Constructor con parámetros 
    public Especialidad(int idEspecialidad, String nombreEspecialidad, String descripcionEspecialidad, String restriccionEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
        this.restriccionEspecialidad = restriccionEspecialidad;
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

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public String getRestriccionEspecialidad() {
        return restriccionEspecialidad;
    }

    public void setRestriccionEspecialidad(String restriccionEspecialidad) {
        this.restriccionEspecialidad = restriccionEspecialidad;
    }

}
