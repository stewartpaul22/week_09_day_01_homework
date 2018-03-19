import models.NameGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNameGenerator {

    private NameGenerator nameGenerator;

    @Before
    public void setUp() throws Exception {
        nameGenerator = new NameGenerator();
    }

    @Test
    public void hasNameArrayList() {
        assertEquals(4, nameGenerator.getNames().size());
    }
}
