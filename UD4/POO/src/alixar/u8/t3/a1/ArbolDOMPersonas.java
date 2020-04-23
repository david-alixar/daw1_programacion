package alixar.u8.t3.a1;

import alixar.u8.t2.a1.Persona;
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

public class ArbolDOMPersonas {

    //Atributos
    private Document documento;

    //Constructor
    public ArbolDOMPersonas (String nombreFichero){

            try {

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                this.documento = db.parse(new File(nombreFichero));


            } catch (ParserConfigurationException | SAXException | IOException e) {
                System.out.println(e.getStackTrace());
            }
        }

    public void parse (){
        Element root = documento.getDocumentElement();

        NodeList nl = root.getChildNodes();

        for (int i = 0; i< nl.getLength(); i++){

            if(nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nl.item(i);
                System.out.println("La etiqueta: " + e.getTagName());
                System.out.println("Contiene:");
                System.out.println(e.getTextContent());

                if (e.hasAttributes()) {
                    NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        System.out.println("Atributo: " + atributo.getNodeName());
                        System.out.println("Valor: " + atributo.getValue());
                    }
                }
            } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                System.out.println("El nodo texto contiene:");
                Text texto = (Text) nl.item(i);
                System.out.println(texto.getTextContent());
            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                System.out.println("El nodo comentario contiene:");
                Comment comentario = (Comment) nl.item(i);
                System.out.println(comentario.getTextContent());
            }
            System.out.println("----------------------------------------");
        }
    }
    public void incrementoEdad(Persona p1) {
        boolean esta = false;
        try {

            Element root = documento.getDocumentElement();

            NodeList nl = root.getChildNodes();


            for (int i = 0; i < nl.getLength(); i++) {

                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    NodeList nh = e.getChildNodes();
                    for (int j = 0; j < nh.getLength(); j++){
                        if (nh.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e2 = (Element) nh.item(j);
                            if (e2.getTextContent().equals(p1.getNombre())) {
                                //Element e3 = (Element) nh.item(j+1);
                                e2.setTextContent(Integer.toString(p1.getEdad()));
                                esta = true;
                            }
                        }
                    }

                    if (e.hasAttributes()) {
                        NamedNodeMap nodeMap = e.getAttributes();
                        for (int k = 0; k < nodeMap.getLength(); k++) {
                            Node node = nodeMap.item(k);
                            Attr atributo = e.getAttributeNode(node.getNodeName());
                            //System.out.println("Atributo: " + atributo.getNodeName());
                            //System.out.println("Valor: " + atributo.getValue());
                        }
                    }
                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
//                    System.out.println("El nodo texto contiene:");
//                    Text texto = (Text) nl.item(i);
//                    System.out.println(texto.getTextContent());
                } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
//                    System.out.println("El nodo comentario contiene:");
//                    Comment comentario = (Comment) nl.item(i);
//                    System.out.println(comentario.getTextContent());
                }

            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("personas.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);
        } catch (TransformerConfigurationException e) {
            System.out.println(e.getStackTrace());
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        if (!esta){
            System.out.println("No lo he encontrado");
        }
        else {
            System.out.println(esta);
        }
    }
}
