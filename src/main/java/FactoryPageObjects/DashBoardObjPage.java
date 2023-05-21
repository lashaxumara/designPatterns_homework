package FactoryPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardObjPage {
    public WebDriver driver;
    @FindBy(css = "img[src='https://cdn.swoop.ge/images/icons/_block1.svg']")
    public WebElement el;

    public DashBoardObjPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}