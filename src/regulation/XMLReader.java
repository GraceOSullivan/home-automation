/***************************************************************************************
 *    Skeleton for the source code for the reading of an XML source file was gotten from the following source:
 *
 *    Title: A simple example of reading and parsing an XML document in Java
 *    Author: Nic MchPhee (Github Member)
 *    Date: 24-October-2013
 *    Code version: 1.0
 *    Availability: https://gist.github.com/NicMcPhee/7131454
 *
 ***************************************************************************************/

package regulation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import misc.Printer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

enum XMLReader {
    INSTANCE;

    private static XMLReader instance = null;
    private static NodeList nodeList;

    XMLReader() {
    }

    public static XMLReader getInstance() {
        if (instance == null) {
            synchronized (XMLReader.class) {
                if (instance == null) {
                    Document doc = createDocument();
                    if (doc != null)
                        nodeList = doc.getElementsByTagName("boundaries");
                    else
                        Printer.getInstance().print("XML Document is invalid");
                    instance = XMLReader.INSTANCE;
                }
            }
        }
        return instance;
    }

    private static Document createDocument() {
        try {
            InputStream inputStream = new FileInputStream("values.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputStream);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public double getValue(String component) {
        if (nodeList.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodeList.item(0);
            return getComponent(element, component);
        }
        return 0.0;
    }

    private double getComponent(Element element, final String component) {
        NodeList elements = element.getElementsByTagName(component);
        Element firstElement = (Element) elements.item(0);
        NodeList children = firstElement.getChildNodes();
        String componentText = children.item(0).getNodeValue();
        return Double.parseDouble(componentText);
    }
}