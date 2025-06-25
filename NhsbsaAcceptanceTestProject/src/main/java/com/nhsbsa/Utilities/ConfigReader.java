package com.nhsbsa.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/config.properties";
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file at: " + FILE_PATH, e);
        }
    }

    public static String getTestData(String keyName) {
        String value = properties.getProperty(keyName);
        if (value == null) {
            throw new IllegalArgumentException("Key '" + keyName + "' not found in config.properties");
        }
        return value;
    }
}

