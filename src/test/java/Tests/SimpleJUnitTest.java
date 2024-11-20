package Tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("\n###  beforeAll\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###  beforeEach");
        result = getResult();
    }

   @AfterEach
    void afterEach() {
        System.out.println("###  afterEach");
        result = 0;
    }

    @AfterAll
    static void afterAll(){
        System.out.println("\n###  afterAll\n");
    }

    @Test
    void firstTest() {

        System.out.println("###      firstTest");
        Assertions.assertTrue(result > 2);

    }
private int getResult(){
        return 3;
}
    @Test
    void secondTest() {
        System.out.println("###      secondTest");
        Assertions.assertTrue(result > 2);

    }
}