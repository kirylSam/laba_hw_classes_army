package org.example.archiver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.IncorrectFileNameException;
import org.example.exceptions.IncorrectInfoToBeAddedException;

import java.io.*;

public class Archiver {

    static Logger logger = LogManager.getLogger("org.example.archiver.Archiver");

    public Archiver() {
    }

    public static void addInfoToTheArchiveFile(String filename, String infoToBeAdded) throws IncorrectFileNameException, IncorrectInfoToBeAddedException {
        if(!validateFileName(filename)) {
            throw new IncorrectFileNameException("The provided filename is not correct: " + filename);
        }
        if(!validateInfoToBeAdded(infoToBeAdded)) {
            throw new IncorrectInfoToBeAddedException("The provided string was either too short or too long");
        }

        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                logger.info("File created: " + myObj.getName());
            } else {
                logger.info("File already exists. No need to create a new one");
            }
            PrintWriter myWriter = new PrintWriter(new FileWriter(myObj.getName(), true));
            myWriter.println(infoToBeAdded);
            myWriter.close();
            logger.info("Successfully wrote to the file.");
        } catch (IOException e) {
            logger.error("[EXCEPTION] IOException");
            e.printStackTrace();
        }
    }

    public static boolean validateFileName(String filename) {
        if(!filename.contains(".txt") || filename.length() < 5) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateInfoToBeAdded(String infoToBeAdded) {
        if (infoToBeAdded.length() < 2 || infoToBeAdded.length() > 10000) {
            return false;
        } else {
            return true;
        }
    }
}
