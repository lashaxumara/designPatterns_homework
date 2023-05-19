package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PopUpPage {
    protected SelenideElement title = $("#example-modal-sizes-title-lg");
    protected SelenideElement name = $(byText("Student Name")).sibling(0);
    protected SelenideElement gender = $(byXpath("//td[text()='Gender']")).sibling(0);
    protected SelenideElement mobile = $(byXpath("//td[text()='Mobile']")).sibling(0);

}
