package advancedjava.serialisation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.MarshalException;
import javax.xml.bind.annotation.*;
import javax.xml.transform.stream.StreamResult;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Demo class which would marshal Java object into XML and un-marshal XML into Java Objects.
 *
 * @author Vishnu Kandanelly
 */

public class JavaObjToXML {

    public void marshalDemo() throws JAXBException, IOException {
        Book book = new Book();
        book.setId(1L);
        book.setName("Book1");
        book.setAuthor("Author1");
        book.setDate(new Date());

        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StreamResult streamResult = new StreamResult(System.out);
        //TODO: find what would be the result of this.
        marshaller.marshal(book, streamResult);
        marshaller.marshal(book, new File("./book.xml"));
    }

    /*
     * @SneakyThrows can be used to sneakily throw checked exceptions without actually declaring this in your method's
     * throws clause. This somewhat contentious ability should be used carefully, of course. The code generated
     * by lombok will not ignore, wrap, replace, or otherwise modify the thrown checked exception;
     * it simply fakes out the compiler. On the JVM (class file) level, all exceptions,
     * checked or not, can be thrown regardless of the throws clause of your methods, which is why this works.
     * */
    @SneakyThrows
    public static void main(String[] args) throws JAXBException, IOException {
        new JavaObjToXML().marshalDemo();
    }

}

/**
 * A Java object to illustrate marshalling and un-marshalling
 */
/*
 * @XmlRootElement: the name of the root XML element is derived from the class name and we can also specify the name
 * of the root element of the XML using its name attribute
 *
 * @XmlType: define the order in which the fields are written in the XML file
 *
 * @XmlElement: define the actual XML element name which will be used
 *
 * @XmlAttribute: define the id field is mapped as an attribute instead of an element
 *
 * @XmlTransient: annotate fields that we don't want to be included in XML
 * */
@Data
@XmlRootElement(name = "book")
@XmlType(propOrder = {"id", "name", "date"})
class Book {
    private Long id;
    private String name;
    private String author;
    private Date date;

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }

    // constructor, getters and setters
}
