package alixar.u8.t2.a1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        List listaPersonas = new ArrayList<Persona>();
//        boolean otro = true;
//        while (otro){
//            System.out.println("Introduzca un nombre y una edad");
//            String nombre = teclado.nextLine();
//            int edad = teclado.nextInt();
//            teclado.nextLine();
//            listaPersonas.add(new Persona(nombre,edad));
//            System.out.println("Si desea introducir otro registro introduzca true, de lo contrario introduzca false");
//            otro = teclado.nextBoolean();
//            teclado.nextLine();
//        }
        Persona p1 = new Persona("Juan",23);
        System.out.println(listaPersonas);
        //escribe(listaPersonas);

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();

            Element root = doc.createElement("personas");

            doc.appendChild(root);

            Element progTag = doc.createElement("persona");
            progTag.setAttribute("id",Integer.toString(Persona.getId()));

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent(p1.getNombre());

            Element edad = doc.createElement("edad");
            edad.setTextContent(Integer.toString(p1.getEdad()));

            progTag.appendChild(nombre);
            progTag.appendChild(edad);


        } catch (ParserConfigurationException e) {
            System.out.println(e.getStackTrace());
        }
    }
    public static void escribe (List<Persona> listaPersonas){
        try (ObjectOutputStream fichero =
                     new ObjectOutputStream(new FileOutputStream("FichPersona.dat"))) {
            fichero.writeObject(listaPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
