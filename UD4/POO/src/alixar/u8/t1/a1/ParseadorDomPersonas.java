package alixar.u8.t1.a1;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

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

            NodeList nl = root.getChildNodes();

            for (int i = 0; i< nl.getLength(); i++){
                System.out.println("Contenido: " + nl.itenm(i).getNodeType());
            }

        } catch (ParserConfigurationException | SAXEception | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
