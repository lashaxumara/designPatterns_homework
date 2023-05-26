import FactoryStepObjects.CaveaEastPointObjStep;
import FactoryStepObjects.DashBoardObjStep;
import FactoryStepObjects.MovieObjStep;
import FactoryStepObjects.VacantSeatPickObjStep;
import Utils.ScreenshotUtil;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

@Epic("Epic - Movie pick and Booking Seat-Registration")
@Feature("Feature - Searching movies and picking day")
public class FactoryTest{
    private WebDriver driver;
    private CaveaEastPointObjStep caveaEastPointObjStep;
    private DashBoardObjStep dashBoardObjStep;
    private MovieObjStep movieObjStep;
    private VacantSeatPickObjStep vacantSeatPickObjStep;

    @BeforeMethod
    public void beforMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        caveaEastPointObjStep = new CaveaEastPointObjStep(driver);
        dashBoardObjStep = new DashBoardObjStep(driver);
        movieObjStep = new MovieObjStep(driver);
        vacantSeatPickObjStep = new VacantSeatPickObjStep(driver);

        driver.get("https://www.swoop.ge/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        ScreenshotUtil.captureScreenshotOnFailure(driver, result);
        driver.quit();
    }

    @Test(description = "TestNG - Navigating To Swoop.ge,Picking Movie's free seat and Registrating")
    @Story("Story - Booking Seat and Registrating on Swoop.ge")
    @Description("Allure - Navigating To Swoop.ge,Picking Movie's free seat and Registrating")
    @Severity(SeverityLevel.CRITICAL)
    public void swoopRegister() {
        dashBoardObjStep.movieClick();

        String firstMovieText = movieObjStep.firstMovieText();

        movieObjStep
                .firstMovie()
                .buyButton();
        caveaEastPointObjStep
                .scrollTo()
                .clickOnCavea();

        for (String actualVal : caveaEastPointObjStep.caveaNameList()) {
            Assert.assertEquals(actualVal, caveaEastPointObjStep.caveaNameText());
        }
        caveaEastPointObjStep
                .lastData()
                .coockie()
                .lastFilm();
        vacantSeatPickObjStep
                .vacantSeat("seat free");

        Assert.assertEquals(vacantSeatPickObjStep.getFilmName(), firstMovieText);
        Assert.assertEquals(vacantSeatPickObjStep.getCinemaName(), caveaEastPointObjStep.caveaNameText());
        Assert.assertEquals(vacantSeatPickObjStep.getFilmDate(), caveaEastPointObjStep.getFilmDate());
    }
}