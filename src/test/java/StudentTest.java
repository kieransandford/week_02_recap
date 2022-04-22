import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void livesInLondon__true() {
        // given - a student who lives in London
        Student student = new Student("Test Student", 25, "London", "Glasgow");
        // when - we call the livesInLondon method
        boolean result = student.livesInLondon();
        // then - it should return true
        assertTrue(result);
    }

    @Test
    void livesInLondon__false(){
        // given - a student who lives in London
        Student student = new Student("Test Student2", 21, "Cardiff", "Queen's");
        // when - we call the livesInLondon method
        boolean result = student.livesInLondon();
        // then - it should return false
        assertFalse(result);
    }
}