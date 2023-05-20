package FactoryStepObjects;

import FactoryPageObjects.VacantSeatPickObjPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VacantSeatPickObjStep {

    WebDriver driver;
    JavascriptExecutor js;
    VacantSeatPickObjPage vacantSeatPickObjPage;

    WebDriverWait wait;

    public VacantSeatPickObjStep vacantSeat() {
        for (WebElement singleSeat : vacantSeatPickObjPage.cinemaSeats) {
            if (singleSeat.getAttribute("class").equals("seat free")) {
                js.executeScript("arguments[0].click();", singleSeat);
                break;
            }
        }
        return this;
    }

    public String getFilmName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".movie-title")));
        return vacantSeatPickObjPage.filmName.getText();
    }

    public String getCinemaName(){
        return vacantSeatPickObjPage.cinema.get(0).getText();
    }

    public String getFilmDate(){
        String dateTimeString = vacantSeatPickObjPage.cinema.get(1).getText();
        String[] parts = dateTimeString.split(" ");
        String timeString = parts[parts.length - 1];
        return timeString;
    }

    public VacantSeatPickObjStep(WebDriver driver){
        this.js = (JavascriptExecutor)driver;
        this.vacantSeatPickObjPage = new VacantSeatPickObjPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}