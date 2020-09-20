package main.java;
import org.xml.sax.SAXException;

import javax.security.sasl.SaslException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class solution {

public static void main(String [] args){
    boolean flag =true;

    try {
        validate("add.xml", "fullXSD.xsd");
    } catch (SAXException e) {
       flag=false;
    } catch (IOException e) {
        flag=false;
    }
    System.out.println("xml file is valid:"+flag);
}
public static  void validate(String xmlFile, String validFile) throws SAXException, IOException {
    SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI );
    ((schemaFactory.newSchema(new File(validFile)))).newValidator().validate(new StreamSource(new File(xmlFile)));
}
}