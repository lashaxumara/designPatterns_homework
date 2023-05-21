package FactoryStepObjects;

import FactoryPageObjects.DashBoardObjPage;
import org.openqa.selenium.WebDriver;

public class DashBoardObjStep {
    DashBoardObjPage dashBoardObjPage;

    public DashBoardObjStep  movieClick(){
        dashBoardObjPage.el.click();
        return this;
    }
    public DashBoardObjStep(WebDriver driver){
        this.dashBoardObjPage = new DashBoardObjPage(driver);

    }

}
