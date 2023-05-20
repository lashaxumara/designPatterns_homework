package WithOutFactoryPageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MoviePage {
    public ElementsCollection movieList=$$(By.cssSelector("div.movies-deal"));
    public SelenideElement buyButton1 = $(By.xpath("//div[@class='info-cinema-ticket']/p"));


}
