package codeforces;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by karthik on 2/2/16.
 */
public class GraphTraversal {

    HashSet<String> visted = new HashSet<>();
    HashMap<String, ArrayList<String>> dependenceMap = new HashMap<>();

    private void setValue(String columnName, int value) {
        //implemented
    }

    public void setDependenceValue(String columnName, int value) {
        visted.add(columnName);

        setValue(columnName, value);
        List<String> dependency = dependenceMap.get(columnName);

        for(String neighbor : dependency) {
            if(!visted.contains(neighbor)) {
                setDependenceValue(neighbor, value + 1);
            }
        }
    }
    // BFS based solution
    public void setDependenceValueBFS(String columnName, int value) {
        HashSet<String> visted = new HashSet<>();
        Queue<Tuple> q = new LinkedBlockingDeque<>();

        visted.add(columnName);
        q.add(new Tuple(columnName, value));

        while(!q.isEmpty()) {
            Tuple root = q.remove();
            int rootvalue = root.value;
            setValue(root.node, rootvalue);

            List<String> dependency = dependenceMap.get(columnName);
            for(String neighbor : dependency) {
                if(!visted.contains(neighbor)) {
                    q.add(new Tuple(neighbor, rootvalue+1));
                    visted.add(neighbor);
                }
            }
        }
    }
}

class Tuple {
    String node;
    int value;

    public Tuple(String a, int b) {
        this.node = a;
        this.value = b;
    }
}
