import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ExitingClasic {
    public static void main(String[] args) throws SecurityException, IOException 
    { 
  
        // Create a Logger 
        Logger logger = Logger.getLogger( ExitingClasic.class.getName()); 
  
        // Create a file handler object 
        FileHandler handler = new FileHandler("logsExitingClasic.txt"); 
        handler.setFormatter(new SimpleFormatter()); 
  
        // Add file handler as 
        // handler of logs 
        logger.addHandler(handler); 
  
        // set Logger level() 
        logger.setLevel(Level.FINER); 
  
        // call exiting methods with class 
        // name =  ExitingClasic and method name = main 
        logger.exiting(ExitingClasic.class.getName(),ExitingClasic.class.getMethods()[0].getName()); 
    } 
}
