package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.SchemaValidator;

@Getter
public class SchemaContext {

    private ErrorStack errorStack;
    private ImportFunction importFunction;

    public SchemaContext() {
        this.errorStack = new ErrorStack();
        this.importFunction = new ImportFunction(this);
    }
}
