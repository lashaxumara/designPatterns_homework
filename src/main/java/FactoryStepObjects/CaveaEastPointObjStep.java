package FactoryStepObjects;

import FactoryPageObjects.CaveaEastPointObjPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CaveaEastPointObjStep {
    public CaveaEastPointObjPage caveaEastPointObjPage;
    JavascriptExecutor js;

    public CaveaEastPointObjStep scrollTo() {
        js.executeScript("arguments[0].scrollIntoView();", caveaEastPointObjPage.caveaEastPoint);
        return this;
    }

    public CaveaEastPointObjStep clickOnCavea() {
        js.executeScript("arguments[0].click();", caveaEastPointObjPage.caveaEastPoint);
        return this;
    }



    public CaveaEastPointObjStep lastData() {
        WebElement lastDataEl = caveaEastPointObjPage.dateTimeList.get(caveaEastPointObjPage.dateTimeList.size() - 1);
        lastDataEl.click();
        return this;
    }

    public CaveaEastPointObjStep lastFilm() {
        WebElement lastFilmEl = caveaEastPointObjPage.filmListTime.get(caveaEastPointObjPage.filmListTime.size() - 1);
        lastFilmEl.click();
        return this;
    }

    public List<String> caveaNameList() {
        List<String > caveaNameList =  new ArrayList<>();
        for (WebElement el:caveaEastPointObjPage.caveaEastPointTitle) {
            caveaNameList.add(el.getText());
        }

        return caveaNameList;
    }
    public String caveaNameText() {
        return caveaEastPointObjPage.caveaEastPoint.getText();
    }

    public String getFilmDate() {
        return caveaEastPointObjPage.filmListTime.get(caveaEastPointObjPage.filmListTime.size() - 1).getText();
    }

    public CaveaEastPointObjStep(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
        this.caveaEastPointObjPage = new CaveaEastPointObjPage(driver);
    }
}
