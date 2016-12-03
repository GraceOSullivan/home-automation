package misc;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

class AppDriver {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        new Simulator().simulate();

    }


}
