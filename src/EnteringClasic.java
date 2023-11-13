import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * entering(String sourceClass, String sourceMethod): 
 * This method is used to Log a method entry.
 * Actually many times in application development 
 * we need to log when we enter in a method of class 
 * so this is a convenience method that can be used 
 * to log entry to a method. This method logs with 
 * message “ENTRY”, log level FINER, and the given 
 * sourceMethod and sourceClass are also logged.
 * 
 * Parameters: This method accepts two parameters:
 * 
 * sourceClass is the name of the class that issued the logging request and
 * 
 * sourceMethod is the name of the method that is being entered.
 * 
 * Return value: This method returns nothing.
 */
public class EnteringClasic {
    public static void main(String[] args) throws SecurityException, IOException {
        System.out.println("Hello, World!");

        //create a Logger

        Logger logger = Logger.getLogger(EnteringClasic.class.getName());

        // create file Handler object

        FileHandler fileHandler= new FileHandler("logsClasic.txt");
        fileHandler.setFormatter(new SimpleFormatter());

        // add file handler as handler of logs
        logger.addHandler(fileHandler);
        
        //set logger LEVEL
        logger.setLevel(Level.FINER);


        // call entering methods with class 
        // name =  GFG and method name = main 
        logger.entering(EnteringClasic.class.getName(),"main");

        // calling again for List class toString() 
        logger.entering(List.class.getName(), "toString()"); 



    }
}
