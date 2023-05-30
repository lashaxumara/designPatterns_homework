import WithOutFactoryStepObj.CaveaEastPointStep;
import WithOutFactoryStepObj.DashBoardStep;
import WithOutFactoryStepObj.MovieStep;
import WithOutFactoryStepObj.VacantSeatStep;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;

public class WithOutFactoryTest {

    SoftAssert softAssert = new SoftAssert();
    DashBoardStep dashBoardStep = new DashBoardStep();
    MovieStep movieStep = new MovieStep();
    CaveaEastPointStep caveaEastPointStep = new CaveaEastPointStep();
    VacantSeatStep vacantSeatStep = new VacantSeatStep();


    @BeforeMethod
    public void specialSetup() {
        open("https://www.swoop.ge/");
        Configuration.timeout=15000;
        Configuration.holdBrowserOpen=true;

    }

    @Test
    public void swoopRegister() {
        dashBoardStep
                .movieClick();
        String firstMovie = movieStep.firstMovieText();
        movieStep
                .moviePick()
                .movieBuy();
        caveaEastPointStep
                .scrollAt()
                .clickOnCavea1();
        for (String cavea : caveaEastPointStep.caveaNameList1()) {
            softAssert.assertEquals(cavea, caveaEastPointStep.getCaveaNameText());
        }
        caveaEastPointStep
                .lastData()
                .lastFilm();
        vacantSeatStep
                .vacantSeat1();

        softAssert.assertEquals(vacantSeatStep.getFilmName(), firstMovie);
        softAssert.assertEquals(vacantSeatStep.getCinemaName(), caveaEastPointStep.getCaveaNameText());
        softAssert.assertEquals(vacantSeatStep.getFilmDate(), caveaEastPointStep.getFilmDate());

        softAssert.assertAll();
    }
}
