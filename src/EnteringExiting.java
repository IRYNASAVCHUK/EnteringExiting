import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EnteringExiting {
    public static void main(String[] args) throws SecurityException, IOException {
        for (int i = 0; i < 10000000; i++) {
            System.out.println("Hello, World!");
        }
        

        //create a Logger

        Logger logger = Logger.getLogger(EnteringExiting.class.getName());

        // create file Handler object

        FileHandler fileHandler= new FileHandler("logsEnteringExiting.txt");
        fileHandler.setFormatter(new SimpleFormatter());

        // add file handler as handler of logs
        logger.addHandler(fileHandler);
        
        //set logger LEVEL
        logger.setLevel(Level.FINER);


        // call entering methods with class 
        // name =  EnteringExiting and method name = main 
        logger.entering(EnteringExiting.class.getName(),"main");

        // calling again for List class toString() 
        logger.entering(List.class.getName(), "toString()"); 
        
        logger.exiting(ExitingClasic.class.getName(),ExitingClasic.class.getMethods()[0].getName()); 



    }
}


