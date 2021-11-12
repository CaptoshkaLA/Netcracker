package Container;

import Person.Person;
import Contracts.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerTest {

    Person Person;
    MobileContract mobileContr;
    TelevisionContract televisionContr;
    InternetContract internetContr;
    Container Container;

    @BeforeEach
    void setUp() {
        Person = new Person();
        mobileContr = new MobileContract();
        televisionContr = new TelevisionContract();
        internetContr = new InternetContract();
        Container = new Container();
    }

    @Test
    void isEmpty() {
        assertEquals(Container.isEmpty(), true);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        assertEquals(Container.isEmpty(), false);
    }

    @Test
    void size() {
        assertEquals(Container.size(), 0);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        televisionContr = new TelevisionContract(6, "2020-11-11", "2024-11-11", 7, Person, "8");
        Container.add(televisionContr);
        assertEquals(Container.size(), 2);
    }

    @Test
    void clear() {
        assertEquals(Container.size(), 0);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        Container.clear();
        assertEquals(Container.size(),0);
    }

    @Test
    void add() {
        assertEquals(Container.size(), 0);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        televisionContr = new TelevisionContract(6, "2020-11-11", "2024-11-11", 7, Person, "8");
        Container.add(televisionContr);
        assertEquals(Container.size(), 2);
    }

    @Test
    void remove() {
        assertEquals(Container.size(), 0);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        televisionContr = new TelevisionContract(6, "2020-11-11", "2024-11-11", 7, Person, "8");
        Container.add(televisionContr);
        Container.remove(0);
        assertEquals(Container.size(), 1);
    }

    @Test
    void get() {
        assertEquals(Container.size(), 0);
        Person = new Person(1, "A AA AAA", "2001-01-01", "Man", "1111 111111");
        mobileContr = new MobileContract(1, "2020-10-10", "2024-10-10", 2, Person, 3, 4, 5);
        Container.add(mobileContr);
        assertEquals(Container.get(0), mobileContr);
    }

    @Test
    void grow() {
        assertEquals(Container.size(), 0);
        Container.grow();
        assertEquals(Container.getMaxSize(), 24);
    }
}