package regulation;

// Skeleton for this code was gotten from: https://gist.github.com/NicMcPhee/7131454

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {
    private NodeList nodeList;

    public XMLReader() throws ParserConfigurationException, IOException, SAXException {
        Document doc = createDocument("values.xml");
        nodeList = doc.getElementsByTagName("boundaries");
    }

    public double getThermostatUpperBoundary() throws ParserConfigurationException, IOException, SAXException {
        if (nodeList.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodeList.item(0);
            return getComponent(element, "thermostatUpper");
        }
        return 0.0;
    }

    public double getThermostatLowerBoundary() throws ParserConfigurationException, IOException, SAXException {
        if (nodeList.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodeList.item(0);
            return getComponent(element, "thermostatLower");
        }
        return 0.0;
    }

    public double getHygrometerUpperBoundary() throws ParserConfigurationException, IOException, SAXException {
        if (nodeList.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodeList.item(0);
            return getComponent(element, "hygrometerUpper");
        }
        return 0.0;
    }

    public double getHygrometerLowerBoundary() throws ParserConfigurationException, IOException, SAXException {
        if (nodeList.item(0).getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodeList.item(0);
            return getComponent(element, "hygrometerLower");
        }
        return 0.0;
    }

    private double getComponent(Element employee, final String component) {
        NodeList elements = employee.getElementsByTagName(component);
        Element firstElement = (Element) elements.item(0);
        NodeList children = firstElement.getChildNodes();
        String componentText = children.item(0).getNodeValue();
        return Double.parseDouble(componentText);
    }

    private Document createDocument(String fileName) throws ParserConfigurationException, SAXException, IOException {
        InputStream inputStream = new FileInputStream(fileName);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputStream);
        doc.getDocumentElement().normalize();
        return doc;
    }
}