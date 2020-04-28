package com.company;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("personas.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLinea = doc.createTextNode("\n");

            Element persona = doc.createElement("persona");
            persona.setAttribute("id","4");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Chema Durán");

            Element edad = doc.createElement("edad");
            edad.setTextContent("25");

            persona.appendChild(nombre);

            persona.appendChild(edad);

            root.appendChild(persona);

            Element persona2 = doc.createElement("persona");
            persona2.setAttribute("id","5");

            Element nombre2 = doc.createElement("nombre");
            nombre2.setTextContent("Ramón");

            Element edad2 = doc.createElement("edad");
            edad2.setTextContent("35");

            persona2.appendChild(nombre2);

            persona2.appendChild(edad2);

            Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);

            root.replaceChild(persona2,primeraPersona);

            int i = 0;

            while(i != doc.getElementsByTagName("persona").getLength()) {

                Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");

                root.insertBefore(comentario, doc.getElementsByTagName("persona").item(i));

                i++;
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException
                | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
