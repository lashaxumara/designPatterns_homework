
import FactoryStepObjects.CaveaEastPointObjStep;
import FactoryStepObjects.DashBoardObjStep;
import FactoryStepObjects.MovieObjStep;
import FactoryStepObjects.VacantSeatPickObjStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class FactoryTest {
    private WebDriver driver;
    private CaveaEastPointObjStep caveaEastPointObjStep;
    private DashBoardObjStep dashBoardObjStep;
    private MovieObjStep movieObjStep;
    private VacantSeatPickObjStep vacantSeatPickObjStep;

    SoftAssert softAssert;
    @BeforeMethod
    public void beforMethod() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        caveaEastPointObjStep = new CaveaEastPointObjStep(driver);
        dashBoardObjStep = new DashBoardObjStep(driver);
        movieObjStep = new MovieObjStep(driver);
        vacantSeatPickObjStep = new VacantSeatPickObjStep(driver);


        softAssert = new SoftAssert();
        driver.get("https://www.swoop.ge/");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void swoopRegister() {
        dashBoardObjStep.movieClick();

        String firstMovieText = movieObjStep.firstMovieText();

        movieObjStep
                .firstMovie()
                .buyButton();
        caveaEastPointObjStep
                .scrollTo()
                .clickOnCavea();

        for(String actualVal: caveaEastPointObjStep.caveaNameList()){
            softAssert.assertEquals(actualVal, caveaEastPointObjStep.caveaNameText());
        }

        caveaEastPointObjStep
                .lastData()
                .lastFilm();
        vacantSeatPickObjStep
                .vacantSeat();

        softAssert.assertEquals(vacantSeatPickObjStep.getFilmName(), firstMovieText);
        softAssert.assertEquals(vacantSeatPickObjStep.getCinemaName(), caveaEastPointObjStep.caveaNameText());
        softAssert.assertEquals(vacantSeatPickObjStep.getFilmDate(), caveaEastPointObjStep.getFilmDate());


        softAssert.assertAll();
    }
}







