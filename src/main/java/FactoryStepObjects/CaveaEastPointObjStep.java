package FactoryStepObjects;

import FactoryPageObjects.CaveaEastPointObjPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CaveaEastPointObjStep {

    public CaveaEastPointObjPage caveaEastPointObjPage;
    JavascriptExecutor js;
    @Step("Scroll to Cineam button")
    public CaveaEastPointObjStep scrollTo() {
        js.executeScript("arguments[0].scrollIntoView();", caveaEastPointObjPage.caveaEastPoint);
        return this;
    }
    @Step("Click on cavea")
    public CaveaEastPointObjStep clickOnCavea() {
        js.executeScript("arguments[0].click();", caveaEastPointObjPage.caveaEastPoint);
        return this;
    }


    @Step("Click on last Data")
    public CaveaEastPointObjStep lastData() {
        WebElement lastDataEl = caveaEastPointObjPage.dateTimeList.get(caveaEastPointObjPage.dateTimeList.size() - 1);
        lastDataEl.click();
        return this;
    }
    @Step("Remove cookie")
    public CaveaEastPointObjStep coockie(){
        caveaEastPointObjPage.cookieButton.click();
        caveaEastPointObjPage.adClose.click();
        return this;
    }
    @Step("Click on the last film")
    public CaveaEastPointObjStep lastFilm() {
        WebElement lastFilmEl = caveaEastPointObjPage.filmListTime.get(caveaEastPointObjPage.filmListTime.size() - 1);
        js.executeScript("arguments[0].click();", lastFilmEl);
        return this;
    }
    @Step("List of Cavea Cinema Movies")
    public List<String> caveaNameList() {
        List<String > caveaNameList =  new ArrayList<>();
        for (WebElement el:caveaEastPointObjPage.caveaEastPointTitle) {
            caveaNameList.add(el.getText());
        }

        return caveaNameList;
    }
    @Step
    public String caveaNameText() {
        return caveaEastPointObjPage.caveaEastPoint.getText();
    }
    @Step
    public String getFilmDate() {
        return caveaEastPointObjPage.filmListTime.get(caveaEastPointObjPage.filmListTime.size() - 1).getText();
    }

    public CaveaEastPointObjStep(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
        this.caveaEastPointObjPage = new CaveaEastPointObjPage(driver);
    }
}
