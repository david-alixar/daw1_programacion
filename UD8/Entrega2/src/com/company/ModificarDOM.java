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

            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM ");

            Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);

            root.insertBefore(comentario,primeraPersona);


            Element persona = doc.createElement("persona");
            persona.setAttribute("id","4");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Chema Durán");

            Element edad = doc.createElement("edad");
            edad.setTextContent("25");

            persona.appendChild(nombre);

            persona.appendChild(edad);

            root.appendChild(persona);

//            // 3- Uso de cloneNode
//            //Clonamos el último nodo pero posteriormente modificamos el atributo
//            NodeList nl = doc.getElementsByTagName("persona");
//            Node node = nl.item(nl.getLength()-1);
//            Element personaClonada = (Element) node.cloneNode(true);
//
//            //Cambio el atributo
//            personaClonada.setAttribute("id","5");
//
//            //Añadimos ese nuevo no al root
//            root.appendChild(personaClonada);
//
//            // 4- uso de removeChild()
//            // Borramos el segundo nodo
//            Element segundaPersona = (Element) doc.getElementsByTagName("persona").item(1);
//            root.removeChild(segundaPersona);
//
//            // 5- Uso de replaceChild()
//            // Voy a reemplazar la primera persona por la última
//            //Podría ser otro elemento que he creado pero aprovecho uno que está en el árbol
//            // y puedo ver como me quedo con 3 nodos.
//            root.replaceChild(personaClonada,primeraPersona);


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
