package FactoryPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CaveaEastPointObjPage {
    public WebDriver driver;
    @FindBy(xpath = "//a[text()='კავეა ისთ ფოინთი']")
    public WebElement caveaEastPoint;

    @FindBy(xpath = "//div[@id='384933']//div//ul//li//a")
    public List<WebElement> dateTimeList;
    @FindBy(xpath = "//div[@id='384933']//div[@aria-hidden='false']//a//p[1]")
    public List<WebElement> filmListTime;

    @FindBy(xpath = "//div[@id='384933']//div[@aria-hidden='false']//a//p[text()='კავეა ისთ ფოინთი']")
    public List<WebElement> caveaEastPointTitle;

    @FindBy(css = ".cookieButton")
    public WebElement cookieButton;

    @FindBy(css = "div[class^=banner-close]")
    public WebElement adClose;

    public CaveaEastPointObjPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
