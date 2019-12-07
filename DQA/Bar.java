package com.destinationqa;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 
public class Bar {
  static final Logger logger = LogManager.getLogger(Bar.class.getName());
 
  public boolean doIt() {
    //logger.entry();
    logger.error("Did it again!");
    return false;
    //return logger.exit(false);
  }
}

