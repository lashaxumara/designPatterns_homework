package FactoryPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MovieObjPage {
    public WebDriver driver;
    @FindBy(css = "div.movies-deal")
   public List<WebElement> moviesList;

    @FindBy(xpath = "//div[@class='info-cinema-ticket']/p")
    public WebElement buyButton;

    public MovieObjPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
