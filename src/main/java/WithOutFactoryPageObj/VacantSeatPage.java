package WithOutFactoryPageObj;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class VacantSeatPage {

    public ElementsCollection cinemaSeat = $$("div.seat");

    public SelenideElement filmName = $(By.xpath("//div[@class='content-header']//p[@class='movie-title']"));

    public ElementsCollection cinemaName = $$(By.xpath("//div[@class='content-header']//p[@class='movie-cinema']"));

}
