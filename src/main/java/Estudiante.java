import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // RAÍZ DEL ELEMENTO XML
public class Estudiante {

    private String nombre; // NOMBRE DEL ESTUDIANTE
    private int edad; // EDAD DEL ESTUDIANTE

    // CONSTRUCTORES
    public Estudiante() {} // CONSTRUCTOR VACÍO

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; // ASIGNAR NOMBRE
        this.edad = edad; // ASIGNAR EDAD
    }

    //GETTERS / SETTERS
    @XmlElement // ANOTACIÓN JAXB PARA EL NOMBRE
    public String getNombre() {
        return nombre; // RETORNAR NOMBRE
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // ASIGNAR NOMBRE
    }

    @XmlElement // ANOTACIÓN JAXB PARA LA EDAD
    public int getEdad() {
        return edad; // RETORNAR EDAD
    }

    public void setEdad(int edad) {
        this.edad = edad; // ASIGNAR EDAD
    }
}
