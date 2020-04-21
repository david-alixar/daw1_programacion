package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreFichero = "cochesXML.xml";
        List listaCoches = new ArrayList<Coche>();
        listaCoches.add(new Coche("Opel", "Corsa", "gasolina", 2001, 1.2));
        listaCoches.add(new Coche("Ford", "Focus", "diésel", 2007, 1.6));
        listaCoches.add(new Coche("Citroën", "Xsara", "diésel", 2003, 2.0));
        listaCoches.add(new Coche("Peugeot", "308", "gasolina", 2019, 1.2));
        listaCoches.add(new Coche("Renault", "Clio", "gasolina", 2000, 1.2));
        listaCoches.add(new Coche("Ford", "Fiesta", "diésel", 2009, 1.6));
        listaCoches.add(new Coche("Kia", "Ceed", "diésel", 2019, 1.6));

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("coches");
            doc.appendChild(root);

            Iterator it = listaCoches.iterator();
            while (it.hasNext()) {
                Coche c1 = (Coche) it.next();


                Element progTag = doc.createElement("coche");
                progTag.setAttribute("id", Integer.toString(c1.getIdCoche()));

                Element marca = doc.createElement("marca");
                marca.setTextContent(c1.getMarca());

                Element modelo = doc.createElement("modelo");
                modelo.setTextContent(c1.getModelo());

                Element combustible = doc.createElement("combustible");
                combustible.setTextContent(c1.getCombustible());

                Element cilindrada = doc.createElement("cilindrada");
                cilindrada.setTextContent(Double.toString(c1.getCilindrada()));

                Element anno = doc.createElement("año");
                anno.setTextContent(Integer.toString(c1.getAnno()));

                progTag.appendChild(marca);
                progTag.appendChild(modelo);
                progTag.appendChild(combustible);
                progTag.appendChild(cilindrada);
                progTag.appendChild(anno);

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

            File nuevoPersonas = new File(nombreFichero);
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM, destino);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            System.out.println(e.getStackTrace());
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        RecorridoDom r1 = new RecorridoDom();

        System.out.println("Número de hijos y tipo de nodos:\n------------------------");
        r1.numNodosHijos(nombreFichero);
        System.out.println("Recorro hasta el primer nivel y luego cargo el archivo completo");
        r1.mostrarXMLDOM(nombreFichero);
        String buscaNodo = ("7");
        System.out.println("\n\n\n------------------------\nBusco un nodo concreto: " + buscaNodo+ ":\n------------------------");
        r1.mostrarContenidoEtiqueta(nombreFichero, "7");
        buscaNodo = "9";
        System.out.println("\n\n\n------------------------\nBusco un nodo concreto: " + buscaNodo+ ":\n------------------------");
        r1.mostrarContenidoEtiqueta(nombreFichero, "9");

        System.out.println("\n\n\nRecorro con SAX\n------------------------");
        RecorridoSax r2 = new RecorridoSax();
        r2.parse(nombreFichero);
    }
}
