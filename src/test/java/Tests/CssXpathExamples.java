package Tests;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpath(){
        $("[data-testid-email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid-email]").setValue("1");

        $("[id=email]").setValue("1");
        $(by("id", "email")).setValue("1");
        $(byId("email")).setValue("1");
        $("#email").setValue("1");
        $x("//*[@id='email']").setValue("1");


        $("[name=email}").setValue("1");
        $(by("name", "email")).setValue("1");
        $(byName("email")).setValue("1");
        $x("//*[@name='email']").setValue("1");


        $("[class=inputtext][class=login_form_input_box]").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $(".login_form_input_box").setValue("1");


        $(".inputtext .login_form_input_box").setValue("1");

        $(byText("Hello Guru"));
        $(withText("Hello Guru"));
        $x("//*[contains(text(), 'hello Guru')]");
    }
}
