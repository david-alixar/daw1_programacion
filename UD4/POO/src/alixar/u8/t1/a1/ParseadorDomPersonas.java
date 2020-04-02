package alixar.u8.t1.a1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDomPersonas {

    public static void parse( String nombre){

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(nombre));
            Element root = doc.getDocumentElement();

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

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
