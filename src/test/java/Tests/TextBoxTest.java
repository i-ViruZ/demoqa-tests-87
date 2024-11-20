package Tests;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll2(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // defoult 4000
    }



    @Test
    void LoginTest() {
        open("/text-box");
        $("#userName").setValue("TestName");
        $("#userEmail").setValue("sa@jm.com");
        $("#currentAddress").setValue("Saratov");
        $("#permanentAddress").setValue("Street");
        $("#submit").click();

        $("#output #name").shouldHave(text("TestName"));
        $("#output").$("#email").shouldHave(text("sa@jm.com"));
        $("#output").$("#currentAddress").shouldHave(text("Saratov"));
        $("#output").$("#permanentAddress").shouldHave(text("Street"));

    }
}