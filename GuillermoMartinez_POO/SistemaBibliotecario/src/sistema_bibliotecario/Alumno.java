package sistema_bibliotecario;

public class Alumno extends Persona {
    private int matricula;

    public Alumno(int cedula, String nombreApellido, String correo, String telefono, int matricula) {
        super(cedula, nombreApellido, correo, telefono);
        this.matricula = matricula;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

	@Override
	public String toString() {
		return "Alumno, \nMatricula = " + matricula + super.toString();
	}
}
