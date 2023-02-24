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
    public void userIsSelectChannel() throws InterruptedException{
        Thread.sleep(1000);
        url = HotstarProps.getValue("url");
        driver.get(url);
        Thread.sleep(2000);
        hotstarPage = new HotstarPage(driver);
        hotstarPage.getSelectIcon().click();
        Thread.sleep(2000);
        hotstarPage.getSelectGenres().click();
        Thread.sleep(2000);
    }

    @Given("the user navigates to the drama channel")
    public void the_user_navigates_to_the_drama_channel() throws InterruptedException{

       Thread.sleep(2000);
       hotstarPage.getSelectdrama().click();
       Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());
       Thread.sleep(2000);

    }
    @When("the user select the Guppendentha Manasu serial")
    public void the_user_select_the_Guppendentha_Manasu_serial() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectGuppendanthaManasu().click();
        Thread.sleep(2000);


    }
    @Then("the Guppendentha Manasu serial results should be displayed")
    public void the_Guppendentha_Manasu_serial_results_should_be_displayed() throws InterruptedException {

        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("the user navigates to the reality channel")
    public void the_user_navigates_to_the_reality_channel() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectreality().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());


    }

    @When("the user search the channel name")
    public void the_user_search_the_channel_name() throws InterruptedException {
        WebElement element = hotstarPage.getSearchPage();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());
        Thread.sleep(2000);
        data = TestDataReader.getData(scenario.getName());
        element.sendKeys(data.get("Search_Type"));
        Thread.sleep(2000);
        element.sendKeys(Keys.ENTER);

    }

    @Then("the search channel results should be displayed")
    public void the_search_channel_results_should_be_displayed() throws InterruptedException {

        Thread.sleep(2000);
        String text = hotstarPage.getNotFoundPage().getText();
        Assert.assertEquals(text,data.get("Expected_Result"));

    }

    @Given("the user navigates to the travel channel")
    public void the_user_navigates_to_the_travel_channel() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelecttravel().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());
    }
    @When("the user select the Maharastra Vedio")
    public void the_user_select_the_maharastra_vedio() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectVedio().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @Then("the Maharastra vedio results should be played")
    public void the_maharastra_vedio_results_should_be_played() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectTeaserVedio().click();
        Thread.sleep(60000);
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("User navigates to the sport page")
    public void user_navigates_to_the_sport_page() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectsport().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @When("User able to {string} the  vedio")
    public void user_able_to_the_vedio(String search) throws InterruptedException {
        Wait wait1 = new FluentWait(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(Exception.class);
        Thread.sleep(2000);
        WebElement Input=hotstarPage.getSearchvedio();
        Thread.sleep(2000);
        Input.sendKeys(search);
        Thread.sleep(2000);
    }
    @And("User can click on enter")
    public void user_can_click_on_enter() throws InterruptedException {
          Thread.sleep(2000);
          hotstarPage.getSearchvedio().sendKeys(Keys.ENTER);
          Thread.sleep(2000);
    }
    @Then("User redirected to the relavent page")
    public void user_redirected_to_the_relavent_page() {
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());
    }



    @Given("User navigates to the AnimalsandNature channel")
    public void user_navigates_to_the_animalsand_nature_channel() throws InterruptedException {
        Thread.sleep(2000);
        hotstarPage.getSelectAnimalsAndNature().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());
    }
    @When("User able to select teaser vedio")
    public void user_able_to_select_teaser_vedio() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectBornInAfrica().click();
        Thread.sleep(2000);
        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());

    }
    @Then("the teaser vedio should be played")
    public void the_teaser_vedio_should_be_played() throws InterruptedException {

        Thread.sleep(2000);
        hotstarPage.getSelectBornInAfricaTeaser().click();
        Thread.sleep(30000);
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }
}
