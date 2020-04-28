package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {

            public static void main(String[] args) {

            ArrayList<Persona> personas = new ArrayList<>();

            //Creo los objeto necesarios para
            Persona p1 = new Persona("Manuel", "51236945m", 955331964, 66);
            Persona p2 = new Persona("Lola", "41236385l", 954331964, 36);
            Persona p3 = new Persona("Roberto", "89236940k", 902202122, 22);
            Persona p4 = new Persona("Rocío", "98765432a", 621325327, 35);
            Persona p5 = new Persona("Juan", "932124487j", 627484328, 46);
            Persona p6 = new Persona("Victoria", "62358723v", 611626362, 22);
            Persona p7 = new Persona("Lolo", "01236432l", 611403612, 59);
            Persona p8 = new Persona("Eulalia", "61245941e", 956304112, 61);
            Persona p9 = new Persona("Román", "62145984r", 666401261, 42);
            Persona p10 = new Persona("Rosa", "41236548s", 954476138, 87);

            //Los añado a la lista
            personas.add(p1);
            personas.add(p2);
            personas.add(p3);
            personas.add(p4);
            personas.add(p5);
            personas.add(p6);
            personas.add(p7);
            personas.add(p8);
            personas.add(p9);
            personas.add(p10);

            try {

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();

                Document doc = db.newDocument();

                Element root = doc.createElement("asignaturas");

                doc.appendChild(root);

                for (Persona p : personas) {
                    Element progTag = doc.createElement("persona");
                    progTag.setAttribute("id", Integer.toString(p.getIdPersona()));

                    Element nombre = doc.createElement("nombre");
                    nombre.setTextContent(p.getNombre());

                    Element dni = doc.createElement("dni");
                    dni.setTextContent(p.getDni());

                    Element telefono = doc.createElement("telefono");
                    telefono.setTextContent((Integer.toString(p.getTelefono())));

                    Element edad = doc.createElement("edad");
                    edad.setTextContent((Integer.toString(p.getEdad())));

                    progTag.appendChild(nombre);
                    progTag.appendChild(dni);
                    progTag.appendChild(telefono);
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

                File nuevoPersonas = new File("cero.xml");
                StreamResult destino = new StreamResult(nuevoPersonas);

                transformer.transform(origenDOM, destino);


            } catch (Exception e) {
                e.printStackTrace();
            }

      }
}
