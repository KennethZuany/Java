// clase hija de Usuario que representa a un estudiante
public class Alumno extends Usuario {

    private String matricula;
    private String carrera;

    public Alumno(String idUsuario, String nombre, String matricula, String carrera) {
        // llamo al constructor del padre con super
        super(idUsuario, nombre);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // sobreescribo el metodo para que diga Alumno en vez de Usuario General
    @Override
    public String getTipoUsuario() {
        return "Alumno - Carrera: " + carrera;
    }

    // el alumno solo puede pedir 2 libros (igual que la regla de negocio)
    @Override
    public int getLimiteLibros() {
        return 2;
    }
}