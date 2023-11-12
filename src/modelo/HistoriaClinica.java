package modelo;

public class HistoriaClinica {

    private int idHistoriaClinica;
    private Paciente paciente;  // Representa la relación con la clase Paciente
    private String enfermedadAnterior;
    private String tratamientoAnterior;
    private String alergias;
    private String enfermedadFamilia;
    private String diagnosticoActual;
    private String examenResultado;
    private String tratamientoActual;

    public HistoriaClinica() {
    }

    public HistoriaClinica(int idHistoriaClinica, Paciente paciente, String enfermedadAnterior, String tratamientoAnterior, String alergias, String enfermedadFamilia, String diagnosticoActual, String examenResultado, String tratamientoActual) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.paciente = paciente;
        this.enfermedadAnterior = enfermedadAnterior;
        this.tratamientoAnterior = tratamientoAnterior;
        this.alergias = alergias;
        this.enfermedadFamilia = enfermedadFamilia;
        this.diagnosticoActual = diagnosticoActual;
        this.examenResultado = examenResultado;
        this.tratamientoActual = tratamientoActual;
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

    public String getEnfermedadAnterior() {
        return enfermedadAnterior;
    }

    public void setEnfermedadAnterior(String enfermedadAnterior) {
        this.enfermedadAnterior = enfermedadAnterior;
    }

    public String getTratamientoAnterior() {
        return tratamientoAnterior;
    }

    public void setTratamientoAnterior(String tratamientoAnterior) {
        this.tratamientoAnterior = tratamientoAnterior;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadFamilia() {
        return enfermedadFamilia;
    }

    public void setEnfermedadFamilia(String enfermedadFamilia) {
        this.enfermedadFamilia = enfermedadFamilia;
    }

    public String getDiagnosticoActual() {
        return diagnosticoActual;
    }

    public void setDiagnosticoActual(String diagnosticoActual) {
        this.diagnosticoActual = diagnosticoActual;
    }

    public String getExamenResultado() {
        return examenResultado;
    }

    public void setExamenResultado(String examenResultado) {
        this.examenResultado = examenResultado;
    }

    public String getTratamientoActual() {
        return tratamientoActual;
    }

    public void setTratamientoActual(String tratamientoActual) {
        this.tratamientoActual = tratamientoActual;
    }

}
