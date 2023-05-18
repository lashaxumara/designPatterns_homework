package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftPanelPage {

    protected SelenideElement practiceBtn = $(byText("Practice Form"));
}
