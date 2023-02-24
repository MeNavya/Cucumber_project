package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import pages.HotstarPage;
import utils.BrowserManager;
import utils.HotstarProps;
import utils.TestDataReader;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class StepDefinitions {
    private WebDriver driver;
    HotstarPage hotstarPage;
    String url;
    HashMap<String, String> data;
    Scenario scenario;

    public StepDefinitions(BrowserManager browserManager){
        this.driver= browserManager.getDriver();
    }

    @Before(order =1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }
    @Given("User is select channel")
    public void userIsSelectChannel() {

        url = HotstarProps.getValue("url");
        driver.get(url);
        hotstarPage = new HotstarPage(driver);
        hotstarPage.getSelectIcon().click();
        hotstarPage.getSelectGenres().click();

    }

    @Given("the user navigates to the drama channel")
    public void the_user_navigates_to_the_drama_channel() {

        hotstarPage.getSelectdrama().click();
       Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());


    }
    @When("the user select the Guppendentha Manasu serial")
    public void the_user_select_the_Guppendentha_Manasu_serial() {

        hotstarPage.getSelectGuppendanthaManasu().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @Then("the Guppendentha Manasu serial results should be displayed")
    public void the_Guppendentha_Manasu_serial_results_should_be_displayed()  {

        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("the user navigates to the reality channel")
    public void the_user_navigates_to_the_reality_channel()  {

        hotstarPage.getSelectreality().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }

    @When("the user search the channel name")
    public void the_user_search_the_channel_name()  {

        WebElement element = hotstarPage.getSearchPage();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());
        data = TestDataReader.getData(scenario.getName());
        element.sendKeys(data.get("Search_Type"));
        element.sendKeys(Keys.ENTER);

    }

    @Then("the search channel results should be displayed")
    public void the_search_channel_results_should_be_displayed()  {

        String text = hotstarPage.getNotFoundPage().getText();
        Assert.assertEquals(text,data.get("Expected_Result"));

    }

    @Given("the user navigates to the travel channel")
    public void the_user_navigates_to_the_travel_channel()  {

        hotstarPage.getSelecttravel().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @When("the user select the Maharastra Vedio")
    public void the_user_select_the_maharastra_vedio()  {

        hotstarPage.getSelectVedio().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @Then("the Maharastra vedio results should be played")
    public void the_maharastra_vedio_results_should_be_played()  {

        hotstarPage.getSelectTeaserVedio().click();
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("User navigates to the sport page")
    public void user_navigates_to_the_sport_page() {

        hotstarPage.getSelectsport().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @When("User able to {string} the  vedio")
    public void user_able_to_the_vedio(String search)  {
        Wait wait1 = new FluentWait(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(Exception.class);
        WebElement Input=hotstarPage.getSearchvedio();
        Input.sendKeys(search);

    }
    @And("User can click on enter")
    public void user_can_click_on_enter()  {

          hotstarPage.getSearchvedio().sendKeys(Keys.ENTER);

    }
    @Then("User redirected to the relavent page")
    public void user_redirected_to_the_relavent_page() {
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());
    }



    @Given("User navigates to the AnimalsandNature channel")
    public void user_navigates_to_the_animalsand_nature_channel()  {

        hotstarPage.getSelectAnimalsAndNature().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @When("User able to select teaser vedio")
    public void user_able_to_select_teaser_vedio()  {

        hotstarPage.getSelectBornInAfrica().click();
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @Then("the teaser vedio should be played")
    public void the_teaser_vedio_should_be_played()  {

        hotstarPage.getSelectBornInAfricaTeaser().click();
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }
}
