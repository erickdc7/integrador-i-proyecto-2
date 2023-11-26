package modelo;

public class HistoriaClinica {

    private int idHistoriaClinica;
    private Paciente paciente;
    private String enfermedadPatologica;
    private String tratamiento;
    private String alergias;
    private String enfermedadNoPatologica;
    private String historialPadre;
    private String historialMadre;
    private String historialAbuelosPat;
    private String historialAbuelosMat;

    // Constructor vacío
    public HistoriaClinica() {
        this.idHistoriaClinica = 0; // O el valor predeterminado que desees
        this.paciente = null; // O el valor predeterminado que desees
        this.enfermedadPatologica = "";
        this.tratamiento = "";
        this.alergias = "";
        this.enfermedadNoPatologica = "";
        this.historialPadre = "";
        this.historialMadre = "";
        this.historialAbuelosPat = "";
        this.historialAbuelosMat = "";
    }

    // Constructor con parámetros 
    public HistoriaClinica(String enfermedadPatologica, String tratamiento, String alergias, String enfermedadNoPatologica, String historialPadre, String historialMadre, String historialAbuelosPat, String historialAbuelosMat) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.paciente = paciente;
        this.enfermedadPatologica = enfermedadPatologica;
        this.tratamiento = tratamiento;
        this.alergias = alergias;
        this.enfermedadNoPatologica = enfermedadNoPatologica;
        this.historialPadre = historialPadre;
        this.historialMadre = historialMadre;
        this.historialAbuelosPat = historialAbuelosPat;
        this.historialAbuelosMat = historialAbuelosMat;
    }

    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEnfermedadPatologica() {
        return enfermedadPatologica;
    }

    public void setEnfermedadPatologica(String enfermedadPatologica) {
        this.enfermedadPatologica = enfermedadPatologica;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadNoPatologica() {
        return enfermedadNoPatologica;
    }

    public void setEnfermedadNoPatologica(String enfermedadNoPatologica) {
        this.enfermedadNoPatologica = enfermedadNoPatologica;
    }

    public String getHistorialPadre() {
        return historialPadre;
    }

    public void setHistorialPadre(String historialPadre) {
        this.historialPadre = historialPadre;
    }

    public String getHistorialMadre() {
        return historialMadre;
    }

    public void setHistorialMadre(String historialMadre) {
        this.historialMadre = historialMadre;
    }

    public String getHistorialAbuelosPat() {
        return historialAbuelosPat;
    }

    public void setHistorialAbuelosPat(String historialAbuelosPat) {
        this.historialAbuelosPat = historialAbuelosPat;
    }

    public String getHistorialAbuelosMat() {
        return historialAbuelosMat;
    }

    public void setHistorialAbuelosMat(String historialAbuelosMat) {
        this.historialAbuelosMat = historialAbuelosMat;
    }

}
