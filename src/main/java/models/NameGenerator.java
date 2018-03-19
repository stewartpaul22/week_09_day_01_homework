package models;

import java.util.ArrayList;

public class NameGenerator {

    private ArrayList<String> names;

    public NameGenerator() {
        this.names = new ArrayList<String>();
        this.names.add("John");
        this.names.add("Paul");
        this.names.add("George");
        this.names.add("Ringo");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }
}
