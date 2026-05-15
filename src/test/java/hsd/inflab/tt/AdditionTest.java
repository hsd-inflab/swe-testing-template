package test.java.hsd.inflab.tt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.hsd.inflab.tt.Addition;

public class AdditionTest {
    
    @Test
    void addTest() {
        Addition addition = new Addition(); 
        assertEquals(5, addition.add(2, 3));
    }
}
