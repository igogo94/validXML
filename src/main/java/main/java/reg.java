package main.java;



import nl.flotsam.xeger.Xeger;
import org.xml.sax.SAXException;

import java.io.IOException;

public class reg {

    public static void main(String [] args){
       // String regex = "[1234567890]{3,3}";
        String regex = "0[12]{2,2}[34]{2,2}";
        //  String regex2 = "";
        Xeger generator = new Xeger(regex);
        String result = generator.generate();
        assert result.matches(regex);
        System.out.println(regex+" "+result);
    }
}
