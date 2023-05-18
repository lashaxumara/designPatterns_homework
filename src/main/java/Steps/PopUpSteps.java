package Steps;

import Pages.PopUpPage;
import com.codeborne.selenide.Condition;

public class PopUpSteps extends PopUpPage {

    public Boolean getTitle() {
        return title.is(Condition.visible);
    }

    public String getName() {
        return name.getText();
    }

    public String getGender() {
        return gender.getText();
    }

    public String getMobile() {
        return mobile.getText();
    }
}
