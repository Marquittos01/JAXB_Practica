import java.io.File;
import javax.xml.bind.JAXBException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {

            //CREAR NUEVO ARCHIVO XML
            File file = new File("cursos.xml");

            //INICIALIZAR NUEVO ESTUDIANTE
            Estudiante estudiante = new Estudiante("Juan Vázquez", 19);
            Cursos cursos;

            if (file.exists() && file.length() > 0) {
                try {

                    //DESERIALIZAR CURSOS EXISTENTES
                    cursos = JAXBUtil.unmarshalCursos(file);

                } catch (ClassCastException e) {

                    //SI EL ARCHIVO NO ES UN CURSO VÁLIDO, CREAR NUEVO CURSO
                    System.out.println("El archivo no es un curso válido, se creará un nuevo Curso.");
                    cursos = new Cursos();
                    cursos.setCurso(new ArrayList<>());

                }
            } else {

                //SI EL ARCHIVO NO EXISTE O ESTÁ VACÍO, CREAR NUEVO CURSO
                cursos = new Cursos();
                cursos.setCurso(new ArrayList<>());

            }

            // NOMBRE DEL CURSO A BUSCAR
            String nCurso = "Curso de Programación";
            Curso curso = null;

            //BUSCAR CURSO EXISTENTE
            for (Curso c : cursos.getCurso()) {
                if (c.getNombre().equals(nCurso)) {
                    curso = c;
                }
            }

            if (curso == null) {

                //SI NO ENCONTRAMOS UN CURSO EXISTENTE, CREAR NUEVO CURSO
                curso = new Curso(nCurso, new ArrayList<>());
                cursos.getCurso().add(curso);

            }


            //AÑADIR ESTUDIANTE AL CURSO EXISTENTE
            curso.getEstudiantes().add(estudiante);

            //SERIALIZAR CURSOS Y GUARDAR EN ARCHIVO
            JAXBUtil.marshalCursos(cursos, file);

            System.out.println("Estudiante añadido correctamente al archivo XML.");

        } catch (JAXBException e) {
            
            // IMPRIMIR ERRORES
            e.printStackTrace();
            System.out.println("Error al procesar el archivo XML.");

        }
    }
}
