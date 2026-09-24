package uam.prog3.tarea02;

public class Colaborador extends Persona implements Evaluable {
    private String puesto;
    private int desempeno; // escala 1 a 5

    public Colaborador(String nombre, String cedula, String puesto, int desempeno) {
        super(nombre, cedula);
        this.puesto = puesto;
        this.desempeno = desempeno;
    }

    @Override
    public String describirRol() {
        return "Colaborador: " + puesto;
    }

    @Override
    public String getEvaluacion() {
        return desempeno >= 3 ? "Bueno" : "Bajo";
    }
}