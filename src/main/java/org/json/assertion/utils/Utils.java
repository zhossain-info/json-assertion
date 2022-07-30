package org.json.assertion.utils;

import org.json.assertion.tree.nodes.JTKey;
import org.json.assertion.tree.nodes.JTLeafNode;
import org.json.assertion.tree.nodes.JTNode;
import org.json.assertion.tree.nodes.JTString;

import java.util.List;

public class Utils {
    public static boolean search(List<JTKey> keys, JTNode n) {
        String text = ((JTLeafNode) n).getText();
        for(JTKey key : keys) {
            if(key.getText().equals(text)) return true;
        }
        return false;
    }
}
