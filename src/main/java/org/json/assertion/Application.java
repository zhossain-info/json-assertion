package org.json.assertion;

import org.json.assertion.tree.DataType;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.tree.JsonInputTree;
import org.json.assertion.tree.JsonSchemaTree;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

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
