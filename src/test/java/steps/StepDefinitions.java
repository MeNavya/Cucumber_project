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
import utils.*;

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
        ClickUtils.click(driver,hotstarPage.getSelectIcon());
        ClickUtils.click(driver,hotstarPage.getSelectGenres());

    }

    @Given("the user navigates to the drama channel")
    public void the_user_navigates_to_the_drama_channel() {

        ClickUtils.click(driver,hotstarPage.getSelectdrama());

    }

    @When("the user select the Guppendentha Manasu serial")
    public void the_user_select_the_Guppendentha_Manasu_serial() {

        ClickUtils.click(driver,hotstarPage.getSelectGuppendanthaManasu());
        WaitUtils.waitTillVisible(driver,hotstarPage.getDisplayHotstarPage());

    }

    @Then("the Guppendentha Manasu serial results should be displayed")
    public void the_Guppendentha_Manasu_serial_results_should_be_displayed()  {

        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("the user navigates to the reality channel")
    public void the_user_navigates_to_the_reality_channel()  {

        ClickUtils.click(driver,hotstarPage.getSelectreality());

    }

    @When("the user search the channel name")
    public void the_user_search_the_channel_name() {

        WaitUtils.waitTillVisible(driver,hotstarPage.getSearchPage());
        WebElement element = hotstarPage.getSearchPage();
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

        ClickUtils.click(driver,hotstarPage.getSelecttravel());

    }

    @When("the user select the Maharastra Vedio")
    public void the_user_select_the_maharastra_vedio() {

        ClickUtils.click(driver,hotstarPage.getSelectVedio());

    }

    @Then("the Maharastra vedio results should be played")
    public void the_maharastra_vedio_results_should_be_played()  {

        ClickUtils.click(driver,hotstarPage.getSelectTeaserVedio());
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }

    @Given("User navigates to the sport page")
    public void user_navigates_to_the_sport_page()  {

        ClickUtils.click(driver,hotstarPage.getSelectsport());

    }

    @When("User able to {string} the  vedio")
    public void user_able_to_the_vedio(String search)  {

        WebElement Input=hotstarPage.getSearchvedio();
        //WaitUtils.waitTillVisible(driver,hotstarPage.getDisplayHotstarPage());
        Input.sendKeys(search);

    }

    @And("User can click on enter")
    public void user_can_click_on_enter()  {

        hotstarPage.getSearchvedio().sendKeys(Keys.ENTER);

    }

    @Then("User redirected to the relavent page")
    public void user_redirected_to_the_relavent_page() {

        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();

    }



    @Given("User navigates to the AnimalsandNature channel")
    public void user_navigates_to_the_animalsand_nature_channel() {

        ClickUtils.click(driver,hotstarPage.getSelectAnimalsAndNature());

    }

    @When("User able to select teaser vedio")
    public void user_able_to_select_teaser_vedio() {

        ClickUtils.click(driver,hotstarPage.getSelectBornInAfrica());
//        Assert.assertTrue(hotstarPage.getDisplayHotstarPage().isDisplayed());


    }
    @Then("the teaser vedio should be played")
    public void the_teaser_vedio_should_be_played()  {

        ClickUtils.click(driver,hotstarPage.getSelectBornInAfricaTeaser());
        WebElement DisplayHotstarPage = hotstarPage.getDisplayHotstarPage();
        Assert.assertTrue(DisplayHotstarPage.isDisplayed());

    }
}
