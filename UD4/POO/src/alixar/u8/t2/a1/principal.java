package alixar.u8.t2.a1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        List listaPersonas = new ArrayList<Persona>();
        boolean otro = true;
        while (otro){
            System.out.println("Introduzca un nombre y una edad");
            String nombre = teclado.nextLine();
            int edad = teclado.nextInt();
            teclado.nextLine();
            listaPersonas.add(new Persona(nombre,edad));
            System.out.println("Si desea introducir otro registro introduzca true, de lo contrario introduzca false");
            otro = teclado.nextBoolean();
            teclado.nextLine();
        }
        escribe(listaPersonas);
        List listaPersonas2 = new ArrayList<Persona>();
        listaPersonas2 = carga_personas(listaPersonas2);

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("personas");
            doc.appendChild(root);

            Iterator it = listaPersonas2.iterator();
            while (it.hasNext()) {
                Persona p1 = (Persona) it.next();
                System.out.println(p1);



                Element progTag = doc.createElement("persona");
                progTag.setAttribute("id", Integer.toString(p1.getIdPersona()));

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(p1.getNombre());

                Element edad = doc.createElement("edad");
                edad.setTextContent(Integer.toString(p1.getEdad()));

                progTag.appendChild(nombre);
                progTag.appendChild(edad);

                root.appendChild(progTag);


            }
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("personasXML.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM, destino);
            } catch(ParserConfigurationException | TransformerConfigurationException e){
                System.out.println(e.getStackTrace());
            } catch (TransformerException e) {
                    e.printStackTrace();
                }


        System.out.println(listaPersonas2);
    }
    public static void escribe (List<Persona> listaPersonas){
        try (ObjectOutputStream fichero =
                     new ObjectOutputStream(new FileOutputStream("FichPersona.dat"))) {
            fichero.writeObject(listaPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List carga_personas (List<Persona> listaPersonas) {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("FichPersona.dat"))) {
            listaPersonas = (List<Persona>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaPersonas;
    }
}
