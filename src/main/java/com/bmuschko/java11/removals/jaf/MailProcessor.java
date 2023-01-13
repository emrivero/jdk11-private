package com.bmuschko.java11.removals.jaf;
import javax.activation.MailcapCommandMap;
import java.util.logging.Logger;
public class MailProcessor {
  private static final Logger logger=Logger.getLogger(MailProcessor.class.getName());
  public void printMimeTypes(){
    MailcapCommandMap mailcapCommandMap=new MailcapCommandMap();
    String[] mimeTypes=mailcapCommandMap.getMimeTypes();
    for (    String mime : mimeTypes) {
      logger.info("" + mime);
    }
  }
}
