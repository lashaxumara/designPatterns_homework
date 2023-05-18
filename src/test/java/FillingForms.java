import Data.RegistrationFormData;
import Steps.DashBoardSteps;
import Steps.LeftPanelSteps;
import Steps.PopUpSteps;
import Steps.RegistrationSteps;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class FillingForms {
    DashBoardSteps dashBoardSteps = new DashBoardSteps();
    LeftPanelSteps leftPanelSteps = new LeftPanelSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    RegistrationFormData registrationFormData = new RegistrationFormData();

    PopUpSteps popUpSteps = new PopUpSteps();

    @BeforeMethod
    public void specialSetups(){
        Configuration.holdBrowserOpen=true;
        Configuration.timeout=10000;
        open("https://demoqa.com/");
    }

    @Test
    public void dataFilling(){
        dashBoardSteps.clickForm();
        leftPanelSteps.clickPracticeForm();
        registrationSteps.fillFirstName(registrationFormData.userName);
        registrationSteps.fillLastName(registrationFormData.lastName);
        registrationSteps.selectGender(registrationFormData.gender);
        registrationSteps.fillMobile(registrationFormData.phoneNumber);
        registrationSteps.clickSubmit();

        Assert.assertTrue(popUpSteps.getTitle());
        String fullName = registrationFormData.userName + " " + registrationFormData.lastName;
        Assert.assertEquals(popUpSteps.getName(), fullName);
        Assert.assertEquals(popUpSteps.getGender(), registrationFormData.gender);
        Assert.assertEquals(popUpSteps.getMobile(), registrationFormData.phoneNumber);
    }
}
