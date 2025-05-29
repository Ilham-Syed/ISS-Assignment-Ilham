package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import java.io.File;

public class XMLExample {
	// File where XML will be stored
    private static final String FILE_NAME = "students.xml";

    public static void main(String[] args) {
        // Write XML to file
        createXML();

        // Read and parse XML from file
        readXML();
    }

    // Method to generate a simple XML and save to file
    public static void createXML() {
        try {
            // Create Document Builder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Create Document
            Document document = builder.newDocument();

            // Root element <students>
            Element root = document.createElement("students");
            document.appendChild(root);

            // Child <student>
            Element student = document.createElement("student");

            // Add attributes and sub-elements
            student.setAttribute("id", "101");

            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("Ilham"));

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode("21"));

            student.appendChild(name);
            student.appendChild(age);
            root.appendChild(student);

            // Transform DOM to XML File
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Pretty print
            transformer.transform(new DOMSource(document), new StreamResult(new File(FILE_NAME)));

            System.out.println("XML file created: " + FILE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to parse the XML and print content
    public static void readXML() {
        try {
            File xmlFile = new File(FILE_NAME);
            if (!xmlFile.exists()) {
                System.out.println("XML file not found. Skipping read.");
                return;
            }

            // Parse XML file
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            // Normalize XML structure
            document.getDocumentElement().normalize();

            // Get all <student> elements
            NodeList students = document.getElementsByTagName("student");

            System.out.println("\nParsed XML content:");
            for (int i = 0; i < students.getLength(); i++) {
                Node node = students.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;
                    String id = student.getAttribute("id");
                    String name = student.getElementsByTagName("name").item(0).getTextContent();
                    String age = student.getElementsByTagName("age").item(0).getTextContent();

                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
