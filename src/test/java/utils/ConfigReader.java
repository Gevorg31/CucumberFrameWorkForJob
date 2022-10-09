package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    /**
     * this method read any properties files
     * @param filePath - path for file with properties
     * @return - properties
     */
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fileInput = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * this method returns value of key from properties
     * @param key - key from properties
     * @return - value form properties
     */
   
    public static String getPropertyValue (String key) {
        return properties.getProperty(key);
    }
}
