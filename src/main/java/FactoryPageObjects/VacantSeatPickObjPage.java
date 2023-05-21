package FactoryPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VacantSeatPickObjPage {
    public WebDriver driver;
    @FindBy(css = "div.seat")
    public List<WebElement> cinemaSeats;

    @FindBy(css = ".movie-title")
    public WebElement filmName;

    @FindBy(css = ".movie-cinema")
    public List<WebElement> cinema;

    public VacantSeatPickObjPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
