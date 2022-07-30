package org.json.assertion.tree.nodes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

public class JTKey extends JTLeafNode {

    private String text;

    public JTKey(JTNode parent, String text) {
        super(parent);
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JTKey key = (JTKey) o;
        return text.equals(key.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
