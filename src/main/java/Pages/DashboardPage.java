package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    protected SelenideElement dashBoard = $((By.xpath("//div[@class='category-cards']/div[2]")));
}
