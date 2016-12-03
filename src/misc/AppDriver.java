package misc;

import regulation.XMLReader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

class AppDriver {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        XMLReader xmlReader = new XMLReader();

        try {
            System.out.println(xmlReader.getThermostatLowerBoundary());
            System.out.println(xmlReader.getThermostatUpperBoundary());
            System.out.println(xmlReader.getHygrometerLowerBoundary());
            System.out.println(xmlReader.getHygrometerUpperBoundary());
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            ex.printStackTrace();
        }
        //new Simulator().simulate();

    }


}
