import models.NameGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestNameGenerator {

    private NameGenerator nameGenerator;
    ArrayList<String> tempNames;

    @Before
    public void setUp() throws Exception {
        nameGenerator = new NameGenerator();
        tempNames = new ArrayList<String>();
        tempNames.add("John");
        tempNames.add("Paul");
        tempNames.add("George");
        tempNames.add("Ringo");
    }

    @Test
    public void hasNameArrayList() {
        assertEquals(4, nameGenerator.getNames().size());
    }

    @Test
    public void canGetRandomName() {
        String name = nameGenerator.generateRandomName();
        assert(tempNames.contains(name));
    }

    @Test
    public void canGetTwoRandomNames() {
        ArrayList<String> twoNames = nameGenerator.generateRandomNames(2);
        assert(tempNames.contains(twoNames.get(0)));
        assert(tempNames.contains(twoNames.get(1)));
        assertEquals(2, twoNames.size());
    }
}
