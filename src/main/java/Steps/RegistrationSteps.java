package Steps;


import Pages.RegistrationPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationSteps extends RegistrationPage {
    public void fillFirstName(String firstname){
        firstName.setValue(firstname);
    }

    public void selectGender(String gen){
        for (SelenideElement el:gender) {
            if(el.getText().equals(gen)){
                el.click();
                break;
            }
        }
    }

    public void fillLastName(String lastname){
        lastName.setValue(lastname);
    }

    public void fillMobile(String mob){
        mobile.setValue(mob);
    }

    public void clickSubmit(){
        executeJavaScript("arguments[0].click();", submitBtn);
    }
}
