package FactoryStepObjects;

import FactoryPageObjects.MovieObjPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MovieObjStep {
    Actions actions;
    MovieObjPage movieObjPage;
    public MovieObjStep firstMovie(){
        actions.moveToElement(movieObjPage.moviesList.get(0)).perform();
        return this;
    }
    public MovieObjStep buyButton(){
        WebElement buyButtons = movieObjPage.buyButton;
        buyButtons.click();
        return this;
    }

    public String firstMovieText(){
        return movieObjPage.moviesList.get(0).getText();
    }

    public MovieObjStep(WebDriver driver){
        this.actions=new Actions(driver);
        this.movieObjPage = new MovieObjPage(driver);
    }

}
