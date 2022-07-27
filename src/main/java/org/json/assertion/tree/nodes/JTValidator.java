package org.json.assertion.tree.nodes;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.assertion.tree.DataType;

import java.util.List;

@Data
@AllArgsConstructor
public class JTValidator {

    private String name;
    private DataType dataType;
    private List<JTNode> arguments;
    private boolean optional;
    private int level;
}
