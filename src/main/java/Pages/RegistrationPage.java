package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {
    protected SelenideElement firstName = $("#firstName");
    protected SelenideElement lastName = $("#lastName");
    protected ElementsCollection gender = $$("label[for^='gender-radio-']");
    protected SelenideElement mobile = $("#userNumber");

    protected SelenideElement submitBtn = $("#submit");
}
