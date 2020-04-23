package alixar.u8.t4.a1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOM {
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
                    System.out.print("La etiqueta: " + e.getTagName()+ "\n");
                    System.out.print("Contiene:");
                    System.out.print(e.getTextContent());

                    if (e.hasAttributes()) {
                        NamedNodeMap nodeMap = e.getAttributes();
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = e.getAttributeNode(node.getNodeName());
                            System.out.print("Atributo: " + atributo.getNodeName() +"\n");
                            System.out.print("Valor: " + atributo.getValue()+"\n");
                        }
                    }
                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
                    System.out.print("El nodo texto contiene:");
                    Text texto = (Text) nl.item(i);
                    System.out.print(texto.getTextContent());
                } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
                    System.out.print("El nodo comentario contiene:");
                    Comment comentario = (Comment) nl.item(i);
                    System.out.print(comentario.getTextContent());
                }
                System.out.print("----------------------------------------\n");
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
