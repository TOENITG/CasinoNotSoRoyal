package com.casino;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.casino.Main;


/**
 * The main class of this server.
 * 
 * @author Gabriel
 */
public final class Main {
	  /** The logger for printing information. */
    private static Logger logger = Logger.getLogger(Main.class.getSimpleName());

    /** The name of this server. */
    public static final String NAME = "Casino 1.0";
    
    /** If debugging messages should be printed. */
    public static final boolean DEBUG = true;
    
    /**
     * The main method of this server.
     * 
     * @param args
     *            the array of runtime arguments.
     */
    public static void main(String[] args) {
        try {
        	//Example:	HostGateway.loadBannedHosts();
        	
        	logger.info("Sucessfully loaded all utilities!");
        
        } catch (Exception e) {

            // An error occurred, print it.
            logger.log(Level.SEVERE,
                "An error occured while starting " + Main.NAME + "!", e);
        	}
        }

    private Main() {}
}
