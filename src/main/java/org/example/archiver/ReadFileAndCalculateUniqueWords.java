package org.example.archiver;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadFileAndCalculateUniqueWords {

    public static void processFile(String filename, String resultFilename) {
       String fileContent = readFileAndExtractContent(filename);
       int amountOfUniqueWords = calculateUniqueWordsInAString(fileContent);
       String result = "There are " + amountOfUniqueWords + " unique words in the " + filename + " file.";
       System.out.println(result);
       writeResultToAFile(result, resultFilename);
    }

    public static String readFileAndExtractContent(String filename) {
        if (filename != null) {
            File file = new File(filename);
            String fileContent;
            try {
                fileContent = FileUtils.readFileToString(file, "UTF-8");
                return fileContent;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return null;
        }
    }

    public static int calculateUniqueWordsInAString(String fileContent) {
        String[] arrayOfWords = StringUtils.split(fileContent);

        Set uniqueWords = new HashSet();
        for (String word : arrayOfWords) {
            uniqueWords.add(word);
        }

        int numberOfUniqueWords = uniqueWords.size();

        return numberOfUniqueWords;
    }

    private static void writeResultToAFile(String result, String resultFilename) {
        File file = new File(resultFilename);
        try {
            FileUtils.writeStringToFile(file, result, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
