package com.company;

import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class RecorridoSax {
    public static void parse(String nombreFichero){

        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler cocheSax = new CocheSax();

            saxParser.parse(new File(nombreFichero), cocheSax);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
