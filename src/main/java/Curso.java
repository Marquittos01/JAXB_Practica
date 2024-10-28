import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    //CONSTRUCTORES
    public Curso() {}

    public Curso(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    //GETTERS / SETTERS
    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement(name = "estudiante")
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
