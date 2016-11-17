import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Driver {
   public static void main(String[] args){

      try {	
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         Handler userhandler = new Handler();
         saxParser.parse("dblp.xml", userhandler);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }   
}