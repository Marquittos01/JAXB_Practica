import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBUtil {
    public static void marshalCursos(Cursos cursos, File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cursos.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(cursos, file);
    }

    public static Cursos unmarshalCursos(File file) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cursos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Cursos) unmarshaller.unmarshal(file);
    }
}
