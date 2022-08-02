package org.json.assertion;

import org.json.assertion.utils.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import java.net.URISyntaxException;


public class SchemaValidatorTest {

    SchemaValidator schemaValidator;

    @BeforeEach
    void setUp() {
        this.schemaValidator = new SchemaValidator();
    }

    @Test
    void validate_IndividualNumericInput_IndividualTypeMatched() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema1.scm");
        String input = TestUtils.loadResource("/input1.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_CommonNumericInput_NumberTypeMatched() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema2.scm");
        String input = TestUtils.loadResource("/input2.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_NonNumericInput_IndividualTypeMatched() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema3.scm");
        String input = TestUtils.loadResource("/input3.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_ValidatorFunction_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema4.scm");
        String input = TestUtils.loadResource("/input4.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_ValidatorFunctionWithDataType_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema5.scm");
        String input = TestUtils.loadResource("/input5.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_OptionalKeyValueWithDataTypeSkipped_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema6.scm");
        String input = TestUtils.loadResource("/input6.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_OptionalKeyValueWithDataTypePresent_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema7.scm");
        String input = TestUtils.loadResource("/input7.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_ConcreteValueInSchema_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema8.scm");
        String input = TestUtils.loadResource("/input8.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_OptionalKeyValueWithFunctionSkipped_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema9.scm");
        String input = TestUtils.loadResource("/input9.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }

    @Test
    void validate_OptionalKeyValueWithFunctionPresent_validationSuccess() throws URISyntaxException, IOException {
        String schema = TestUtils.loadResource("/schema10.scm");
        String input = TestUtils.loadResource("/input10.json");
        assertDoesNotThrow(() -> schemaValidator.assertSchema(schema, input));
    }
}