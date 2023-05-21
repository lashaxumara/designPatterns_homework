package WithOutFactoryStepObj;

import WithOutFactoryPageObj.MoviePage;

import static com.codeborne.selenide.Selenide.actions;

public class MovieStep extends MoviePage {
    public MovieStep moviePick(){
        actions().moveToElement(movieList.get(0)).perform();
        return this;
    }
    public MovieStep movieBuy(){
        buyButton1.click();
        return this;
    }

    public String firstMovieText(){
        return movieList.get(0).getText();
    }
}
