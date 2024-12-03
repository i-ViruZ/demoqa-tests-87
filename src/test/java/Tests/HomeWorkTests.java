import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.File;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkTests {

    @BeforeAll
    static void beforeAllBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
    }

        @Test
    void test1() {
        String Username = "Igor";

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript( "$('#fixedban').remove()"); //убрать рекламу из браузера

        $("#firstName").setValue("Igor");
        $("#lastName").setValue("Braman");
        $("#userEmail").setValue("viruz@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0000000000");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1987");
        $(".react-datepicker__day--029:nth-child(6)").click();
        $("#subjectsInput").setValue("English");
        $("#subjectsInput").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.img");
        //$("#file-upload").uploadFile(new File("src/test/resources/img/1.img"));
        $("#currentAddress").setValue("Street");
        $("#state").click();
        $("#react-select-3-option-3").click();
        //$(withText("Rajasthan")).click(); //аналогично ыерхнему варианту
        $("#city").click();
        $(withText("Jaiselmer")).click();
        $("#submit").click();
        // проверки введенного текста
        $$(".table-responsive").shouldHave(texts("Igor Braman"));
        $$(".table-responsive").shouldHave(texts("viruz@gmail.com"));
            $$(".table-responsive").shouldHave(texts("Male"));
            $$(".table-responsive").shouldHave(texts("0000000000"));
       //  "English", "Sports", "Street", "Rajasthan Jaiselmer"
        $(".table-responsive").shouldHave(text("29 May,1987"),text("English"),text("Sports"));
    }
}