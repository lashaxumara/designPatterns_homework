package FactoryStepObjects;

import FactoryPageObjects.MovieObjPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MovieObjStep {
    Actions actions;
    MovieObjPage movieObjPage;
    @Step("Click on first movie")
    public MovieObjStep firstMovie(){
        actions.moveToElement(movieObjPage.moviesList.get(0)).perform();
        return this;
    }
    @Step("Hover over first movie and after click buy button")
    public MovieObjStep buyButton(){
        WebElement buyButtons = movieObjPage.buyButton;
        buyButtons.click();
        return this;
    }
    @Step("Picking first movie on swoop.ge")
    public String firstMovieText(){
        return movieObjPage.moviesList.get(0).getText();
    }

    public MovieObjStep(WebDriver driver){
        this.actions=new Actions(driver);
        this.movieObjPage = new MovieObjPage(driver);
    }

}
