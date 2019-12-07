package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FirstTest {
	 // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(FirstTest.class);
  @Test
  public void f() {
	  logger.trace("Entering application.");
	  logger.error("Logging error");
	  logger.trace("Exiting application.");
  }
}
