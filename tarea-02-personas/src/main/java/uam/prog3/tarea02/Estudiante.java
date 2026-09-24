package uam.prog3.tarea02;

public class Estudiante extends Persona implements Evaluable {
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String cedula, String carrera, double promedio) {
        super(nombre, cedula);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public String describirRol() {
        return "Estudiante de " + carrera;
    }

    @Override
    public String getEvaluacion() {
        return promedio >= 70 ? "Aprobado" : "Reprobado";
    }
}