import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Cursos {
    private List<Curso> curso;

    // CONSTRUCTOR
    public Cursos() {}

    // GETTER / SETTER
    @XmlElement(name = "curso")
    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
}
