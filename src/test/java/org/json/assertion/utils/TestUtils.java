package org.json.assertion.utils;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.assertion.SchemaValidatorTest;

public class TestUtils {
    public static String loadResource(String path) throws URISyntaxException, IOException {
        return Files.readString(Paths.get(TestUtils.class
                .getResource(path).toURI()));
    }
}
