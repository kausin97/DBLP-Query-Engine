import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class Handler extends DefaultHandler {

   boolean bAuthor = false;
   boolean bTitle = false;
   boolean bPages = false;
   boolean bYear = false;
   boolean bVolume = false;
   boolean bJournal = false;
   boolean bUrl = false;
   boolean bEe=false;

   ArrayList <Publication> array = new ArrayList<>();
   int i=-1;
   
   Publication temp = new Publication();
   
   public void startElement(String uri, 
      String localName, String qName, Attributes attributes)
         throws SAXException {
      if (qName.equalsIgnoreCase("article")) 
      {
         temp.mDate= attributes.getValue("mdate");
         temp.key= attributes.getValue("key");
         i++;
         System.out.println("fdf");

      } 
      else if (qName.equalsIgnoreCase("author"))
      {
    	  bAuthor = true;
      } 
      else if (qName.equalsIgnoreCase("title")) {
    	  bTitle = true;
      } 
      else if (qName.equalsIgnoreCase("pages")) {
    	  bPages = true;
      }
      else if (qName.equalsIgnoreCase("year")) {
    	  bYear = true;
      }
      else if (qName.equalsIgnoreCase("volume")) {
    	  bVolume = true;
      } 
      else if (qName.equalsIgnoreCase("journal")) {
    	  bJournal = true;
      }
      else if (qName.equalsIgnoreCase("url")) {
    	  bUrl = true;
      }
      else if (qName.equalsIgnoreCase("ee")) {
    	  bEe = true;
      }
      
   }

   @Override
   public void endElement(String uri, 
      String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("article")) {
         //System.out.println("End Element :" + qName);
         array.add(temp);
         System.out.println(temp);
      }
   }

   @Override
   public void characters(char ch[], 
      int start, int length) throws SAXException {
      if (bAuthor) {
         temp.author=new String(ch, start, length);
         bAuthor = false;
      } else if (bTitle) {
         temp.title=new String(ch, start, length);
         bTitle = false;
      } else if (bPages) {
         temp.pages=new String(ch, start, length);
         bPages = false;
      } else if (bYear) {
         temp.year=new Integer(length);
         bYear = false;
      }
      	else if (bVolume) {
      	temp.volume=new Integer(length);
      	bVolume = false;
      } 
      	else if (bJournal) {
       temp.journal=new String(ch, start, length);
       bJournal = false;
    } else if (bUrl) {
       temp.url=new String(ch, start, length);
       bUrl = false;
    }
    else if (bEe) {
       temp.ee=new String(ch, start, length);
       bEe = false;
    }
   }
}