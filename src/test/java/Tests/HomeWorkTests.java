import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkTests {

    @BeforeAll
    static void beforeAllBrowser() {
        //Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

        @Test
    void test1() {
        open("/automation-practice-form");
        $("#firstName").setValue("Igor");
        $("#lastName").setValue("Braman");
        $("#userEmail").setValue("viruz@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
            //$(".custom-radio:nth-child(1)>.custom-control-label").click();
        $("#userNumber").setValue("0000000000");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1987");
        $(".react-datepicker__day--029:nth-child(6)").click();
        $("#subjectsInput").setValue("English");
        $("#subjectsInput").pressEnter();
        $(".custom-control:nth-child(1)>.custom-control-label").click();
       // $("").;
     //       $("#output").$("#permanentAddress").shouldHave(text("Street"));
    }
}
