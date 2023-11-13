import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EnteringWithOneParam {
    public static void main(String[] args) throws SecurityException, IOException 
    { 

        // Create a Logger 
        Logger logger  = Logger.getLogger( EnteringWithOneParam.class.getName()); 
  
        // Create a file handler object 
        FileHandler handler = new FileHandler("logsWithOneParam.txt"); 
        handler.setFormatter(new SimpleFormatter()); 
  
        // Add file handler as 
        // handler of logs 
        logger.addHandler(handler); 
  
        // set Logger level() 
        logger.setLevel(Level.FINER); 
  
        // call entering method with class 
        // name =  EnteringWithOneParam and method name = main 
        logger.entering( EnteringWithOneParam.class.getName(), "main",new String("Java is Platform Independent")); 
    } 
} 

