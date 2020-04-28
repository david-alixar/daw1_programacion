package com.company;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class mostrarStax {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Persona personaActual = null;
        String tagActual = "";
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("personas.xml"));

            while (xmlReader.hasNext()){

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    System.out.print("\n<"+ startTag.getName().getLocalPart());

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "persona" :

                            personaActual = new Persona();
                            tagActual = "persona";

                            Attribute id = startTag.getAttributeByName(new QName("id"));

                            personaActual.setId(Integer.valueOf(id.getValue()));

                            System.out.print(" "+id.getName()+"=\""+id.getValue()+"\"");
                            break;

                        case "nombre" :
                            tagActual = "nombre";
                            break;

                        case "dni" :
                            tagActual = "dni";
                            break;

                        case "telefono" :
                            tagActual = "telefono";
                            break;

                        case "edad" :
                            tagActual = "edad";
                            break;
                    }

                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart()+">");

                    if (endtag.getName().getLocalPart().equals("persona")) {
                        personas.add(personaActual);
                    }
                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                personaActual.setNombre(texto.getData());
                                break;
                            case "dni" :
                                personaActual.setDni(texto.getData());
                                break;
                            case "telefono" :
                                personaActual.setTelefono(Integer.valueOf(texto.getData()));
                                break;
                            case "edad" :
                                personaActual.setEdad(Integer.valueOf(texto.getData()));
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(personas);

    }
}
