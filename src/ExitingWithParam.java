import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ExitingWithParam {
    
    public static void main(String[] args) 
        throws SecurityException, IOException 
    { 
  
        // Create a Logger 
        Logger logger 
            = Logger.getLogger( 
                ExitingWithParam.class.getName()); 
  
        // Create a file handler object 
        FileHandler handler 
            = new FileHandler("logsExitingWithParam.txt"); 
        handler.setFormatter(new SimpleFormatter()); 
  
        // Add file handler as 
        // handler of logs 
        logger.addHandler(handler); 
  
        // set Logger level() 
        logger.setLevel(Level.FINER); 

  
        // call exiting method with class 
        // name =  ExitingWithParam and method name = main 
        logger.exiting(ExitingWithParam.class.getName(), 
                       ExitingWithParam.class.getMethods()[0].getName(), 
                       new String("Java is Platform Independent")); 
    }
}
