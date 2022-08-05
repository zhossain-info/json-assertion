package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.SchemaValidator;

@Getter
public class SchemaContext {

    private ErrorStack errorStack;
    private ImportFunction importFunction;

    private SchemaValidator schemaValidator;

    public SchemaContext(SchemaValidator schemaValidator) {
        this.errorStack = new ErrorStack();
        this.importFunction = new ImportFunction(this);
        this.schemaValidator = schemaValidator;
    }
}
