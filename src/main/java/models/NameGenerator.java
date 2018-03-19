package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NameGenerator {

    private ArrayList<String> names;

    public NameGenerator() {
        this.names = new ArrayList<>();
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

    public String generateRandomName() {
        Collections.shuffle(this.names);
        return this.names.remove(0);
    }

    public ArrayList<String> generateRandomNames(int namesRequired) {
        if(namesRequired <= this.names.size()) {
            ArrayList<String> result = new ArrayList<String>();
            for (int i = 0; i < namesRequired; i++){
                Collections.shuffle(this.names);
                result.add(this.names.remove(0));
            }
            return result;
        }
        return names;
    }
}
