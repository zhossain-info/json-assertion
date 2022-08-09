package org.json.assertion.utils;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.json.assertion.tree.nodes.JTLeafNode;
import org.json.assertion.tree.nodes.JTNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssertionBuilder {

    public enum Type {
        EXPECTED("Expected (Schema%s): "),
        ACTUAL("Actual (Json%s): ");

        @Getter
        private String format;
        private Type(String format) {
            this.format = format;
        }
    }

    private Type type;
    private List<JTNode> list = new ArrayList<>();
    private Location location;


    public AssertionBuilder(Type type) {
        this.type = type;
    }

    public void add(JTNode node) {
        extractLocation(node);
        list.add(node);
    }

    public String asClass(JTNode nodeClass) {
        extractLocation(nodeClass);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(nodeClass.getClass().getSimpleName());
        return builder.toString();
    }

    public String asClasses(JTNode reference, Class<?>[] klasses) {
        extractLocation(reference);
        StringBuilder builder = new StringBuilder();
        builder.append("Alternatives data types are ");
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(Arrays.stream(klasses).map(c -> c.getSimpleName())
                .collect(Collectors.joining(", ")));
        return builder.toString();
    }

    public String asLeafText(JTLeafNode node) {
        extractLocation(node);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(node.getText());
        return builder.toString();
    }

    public String asAlternative() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append("Alternative are [");
        builder.append(list.stream().map(i -> ((JTNode) i).toJson())
                .collect(Collectors.joining(", ")));
        builder.append(']');
        return builder.toString();
    }

    public String asValues(List<JTNode> nodes) {
        extractLocation(nodes.get(0));
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(nodes.stream().map(i -> i.toJson())
                .collect(Collectors.joining(", ")));
        return builder.toString();
    }

    public String asValue(JTNode node) {
        extractLocation(node);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(node.toJson());
        return builder.toString();
    }

    public String asObject(JTNode reference, Object object) {
        extractLocation(reference);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append(object.toString());
        return builder.toString();
    }

    public String asRange(List<JTNode> minMax) {
        extractLocation(minMax.get(0));
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append("[")
                .append(((JTNode) minMax.get(0)).toJson())
                .append("-")
                .append(((JTNode) minMax.get(1)).toJson())
                .append("]");
        return builder.toString();
    }

    public String asNotFound(JTNode reference) {
        extractLocation(reference);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(type.getFormat(), getLocation()));
        builder.append("Not Found");
        return builder.toString();
    }

    private String getLocation() {
        if(location == null) return StringUtils.EMPTY;
        return String.format(" Line %d:%d", location.getLine(),
                location.getCharPosition());
    }

    private AssertionBuilder extractLocation(JTNode node) {
        if(location == null) location = node.getLocation();
        return this;
    }
}
