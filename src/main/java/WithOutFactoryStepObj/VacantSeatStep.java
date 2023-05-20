package WithOutFactoryStepObj;

import WithOutFactoryPageObj.VacantSeatPage;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class VacantSeatStep extends VacantSeatPage {
    public VacantSeatStep vacantSeat1() {
        for (WebElement singleSeat : cinemaSeat) {
            if (singleSeat.getAttribute("class").equals("seat free")) {
                executeJavaScript("arguments[0].click();", singleSeat);
                break;
            }
        }
        return this;
    }

    public String getFilmName(){
        return filmName.getText();
    }

    public String getCinemaName(){
        return cinemaName.get(0).getText();
    }

    public String getFilmDate(){
        String dateTimeString = cinemaName.get(1).getText();
        String[] parts = dateTimeString.split(" ");
        String timeString = parts[parts.length - 1];
        return timeString;
    }
}
