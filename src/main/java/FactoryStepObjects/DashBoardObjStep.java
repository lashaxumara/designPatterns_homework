package FactoryStepObjects;

import FactoryPageObjects.DashBoardObjPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class DashBoardObjStep {
    DashBoardObjPage dashBoardObjPage;

    @Step("Picking 'კინო' into dashboard menu")
    public DashBoardObjStep movieClick() {
        dashBoardObjPage.el.click();
        return this;
    }

    public DashBoardObjStep(WebDriver driver) {
        this.dashBoardObjPage = new DashBoardObjPage(driver);

    }

}
