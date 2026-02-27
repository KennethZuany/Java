// clase hija de Usuario para los maestros
// los profes pueden pedir mas libros que los alumnos
public class Profesor extends Usuario {

    private String departamento;
    private String numEmpleado;

    public Profesor(String idUsuario, String nombre, String numEmpleado, String departamento) {
        super(idUsuario, nombre);
        this.numEmpleado = numEmpleado;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    // polimorfismo: sobreescribo el tipo de usuario
    @Override
    public String getTipoUsuario() {
        return "Profesor - Depto: " + departamento;
    }

    // los profesores pueden tener hasta 5 libros, tienen mas privilegios
    @Override
    public int getLimiteLibros() {
        return 5;
    }
}