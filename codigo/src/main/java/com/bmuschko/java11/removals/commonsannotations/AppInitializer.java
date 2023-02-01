package com.bmuschko.java11.removals.commonsannotations;
import javax.annotation.PostConstruct;
import java.util.logging.Logger;
public class AppInitializer {
  private static final Logger logger=Logger.getLogger(AppInitializer.class.getName());
  @PostConstruct public void upAndRunning(){
    logger.info("The application has been started successfully!");
  }
}
