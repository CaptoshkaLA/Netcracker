package Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void calcAge() {
         Person Person1 = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
         assertEquals(Person1.calcAge(),20);
         Person Person2 = new Person(1, "A AA AAA", "2021-11-20", "Man", "1111 111111");
         assertEquals(Person2.calcAge(),0);
    }
}