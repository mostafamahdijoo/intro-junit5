package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Mostafa"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called Once!!!");
    }
}