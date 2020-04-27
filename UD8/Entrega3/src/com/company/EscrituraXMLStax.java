package com.company;
import javax.swing.text.Document;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class EscrituraXMLStax {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        //Creo los objeto necesarios para
        Persona p1 = new Persona("Manuel","51236945m",955331964,66);
        Persona p2 = new Persona("Lola","41236385l",954331964,36);
        Persona p3 = new Persona("Roberto","89236940k",902202122,22);
        Persona p4 = new Persona("Rocío","98765432a",621325327,35);
        Persona p5 = new Persona("Juan","932124487j",627484328,46);
        Persona p6 = new Persona("Victoria","62358723v",611626362,22);
        Persona p7 = new Persona("Lolo","01236432l",611403612,59);
        Persona p8 = new Persona("Eulalia","61245941e",956304112,61);
        Persona p9 = new Persona("Román","62145984r",666401261,42);
        Persona p10 = new Persona("Rosa","41236548s",954476138,87);

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

            //Creo el objeto que me va a servir para escribir
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("STAX.xml"));

            //Creo el objeto que me va a servir para crear los eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Creo el evento de principio de documento y lo escribo con el objeto escritor
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            //Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
            //Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);



            //Creo el evento necesario para crear la etiqueta raíz pedidos
            StartElement pedidosStartElement = eventFactory.createStartElement("","","personas");
            xmlWriter.add(pedidosStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

            //Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente salida
            int longitud = 0;

            for (Persona p : personas) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement personaStart = eventFactory.createStartElement("","","persona");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement dniStart = eventFactory.createStartElement("","","dni");
                StartElement telefonoStart = eventFactory.createStartElement("","","telefono");
                StartElement edadStart = eventFactory.createStartElement("","","edad");


                //Creo el atribudo id
                Attribute id = eventFactory.createAttribute("id",Integer.toString(p.getIdPersona()));


                //Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
                EndElement personaEnd = eventFactory.createEndElement("","","persona");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement dniEnd = eventFactory.createEndElement("","","dni");
                EndElement telefonoEnd = eventFactory.createEndElement("","","telefono");
                EndElement edadEnd = eventFactory.createEndElement("","","edad");

                //Creo los contenidos
                Characters nombre = eventFactory.createCharacters(p.getNombre());
                Characters dni  = eventFactory.createCharacters(p.getDni());
                Characters telefono = eventFactory.createCharacters(Integer.toString(p.getTelefono()));
                Characters edad = eventFactory.createCharacters(Integer.toString(p.getEdad()));


                //Añado todos los elementos correspondientes a un pedido en el orden que es necesario
                xmlWriter.add(personaStart);

                //Añado el atributo
                xmlWriter.add(id);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Lo hijos de cada pedido
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(dniStart);
                xmlWriter.add(dni);
                xmlWriter.add(dniEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(telefonoStart);
                xmlWriter.add(telefono);
                xmlWriter.add(telefonoEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(edadStart);
                xmlWriter.add(edad);
                xmlWriter.add(edadEnd);
                xmlWriter.add(saltoDeLineaTab);

                //Cierro el pedido que estoy escribiendo
                xmlWriter.add(personaEnd);

                //En el último quiero un tratamiendo diferente
                if (longitud == personas.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }



            //Creo el evento necesario para cerrar la etiqueta raíz pedidos
            EndElement pedidosEndElement = eventFactory.createEndElement("","","personas");
            xmlWriter.add(pedidosEndElement);
            xmlWriter.add(saltoDeLinea);



            //Creo el evento de finalización del documento y lo escribo con el objeto escritor
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);


        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }


    }
}
