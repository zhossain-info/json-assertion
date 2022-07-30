package org.json.assertion;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws URISyntaxException, IOException {
        SchemaValidator validator = new SchemaValidator();
        String json = Files.readString(Paths.get(validator.getClass()
                .getResource("/input.json").toURI()));
        String schema = Files.readString(Paths.get(validator.getClass()
                .getResource("/schema.scm").toURI()));
        validator.validate(schema, json);
    }
}
