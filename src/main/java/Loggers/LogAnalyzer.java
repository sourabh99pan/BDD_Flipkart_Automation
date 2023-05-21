package Loggers;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogAnalyzer {
	
	
	public static void appendLogs(String logs) throws SecurityException, IOException
	{
		Date d =new Date();
		
		String TimeStamp = d.toString().replace(":", "_");

	Logger logger = Logger.getLogger("MyLog");
	FileHandler fh;
	
	  fh = new FileHandler(System.getProperty("user.dir")+"\\target\\Logs\\EventLogs"+TimeStamp+".txt");  
      logger.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();  
      fh.setFormatter(formatter); 
      logger.info(logs); 
}

}
