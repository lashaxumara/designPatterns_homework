package WithOutFactoryPageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CaveaEastPointPage {

    public SelenideElement caveaEastPointButton =$(By.xpath("//a[text()='კავეა ისთ ფოინთი']"));
    public ElementsCollection dateTimeList= $$(By.xpath("//div[@id='384933']//div//ul//li//a"));

    public ElementsCollection filmList = $$(By.xpath("//div[@id='384933']//div[@aria-hidden='false']//a//p[1]"));

    public ElementsCollection caveaEastPointTitle = $$(By.xpath("//div[@id='384933']//div[@aria-hidden='false']//a//p[text()='კავეა ისთ ფოინთი']"));

}
