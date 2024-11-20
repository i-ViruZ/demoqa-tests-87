package Tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;


public class TextBoxTest {

    @Test
    void LoginTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("TestName");
        $("#userEmail").setValue("i.surikov@gmail.com");
        $("#currentAddress").setValue("Saratov");
        $("#permanentAddress").setValue("Saratov");
        $("#submit").click();
    //    $("[id=stat]").shouldHave(text("Statistics"));
      //  $("[data-testid=PersonIcon]").click();
    }
}