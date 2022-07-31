package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.SchemaValidator;

@Getter
public class SchemaContext {

    private ErrorStack errorStack;
    private ImportFunction importFunction;
    private SchemaValidator validator;

    public SchemaContext(SchemaValidator validator) {
        this.validator = validator;
        this.errorStack = new ErrorStack();
        this.importFunction = new ImportFunction(this);
    }
}
