package WithOutFactoryStepObj;

import WithOutFactoryPageObj.CaveaEastPointPage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CaveaEastPointStep extends CaveaEastPointPage {
    public CaveaEastPointStep scrollAt() {
        executeJavaScript("arguments[0].scrollIntoView();", caveaEastPointButton);
       return this;
    }

    public CaveaEastPointStep clickOnCavea1() {
        executeJavaScript("arguments[0].click();", caveaEastPointButton);
        return this;
    }



    public CaveaEastPointStep lastData() {
        WebElement lastDataElem =dateTimeList.get(dateTimeList.size()-1);
        lastDataElem.click();
        return this;
    }

    public CaveaEastPointStep lastFilm() {
        WebElement lastFilmElem =filmList.get(filmList.size()-1);
        lastFilmElem.click();
        return this;
    }

    public List<String> caveaNameList1() {
        List<String > caveaNameList1 =  new ArrayList<>();
        for (WebElement el:caveaEastPointTitle) {
            caveaNameList1.add(el.getText());
            break;
        }
        return caveaNameList1;
    }
    public String getCaveaNameText() {
        return caveaEastPointButton.getText();
    }

    public String getFilmDate() {
        return filmList.get(filmList.size()-1).getText();
    }

}
