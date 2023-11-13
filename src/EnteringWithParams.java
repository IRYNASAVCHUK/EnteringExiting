import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EnteringWithParams {
    public static void main(String[] args) throws SecurityException, IOException 
    { 
  
        // Create a Logger 
        Logger logger = Logger.getLogger(  EnteringWithParams.class.getName()); 
  
        // Create a file handler object 
        FileHandler handler = new FileHandler("logsWithParams.txt"); 
        handler.setFormatter(new SimpleFormatter()); 
  
        // Add file handler as 
        // handler of logs 
        logger.addHandler(handler); 
  
        // set Logger level() 
        logger.setLevel(Level.FINER); 
  
        // create a array of String object 
        String[] methods = { 
            "main", "ADD", "get", "set"
        }; 
  
        // call entering method with class 
        // name =  EnteringWithParams and method name = main 
        logger.entering(EnteringWithParams.class.getName(), "main", methods); 
    } 
}
