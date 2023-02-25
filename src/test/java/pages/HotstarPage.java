package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotstarPage {
    private WebDriver driver;

        public HotstarPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//div[@class=\"icon-wrapper\"]")
        @Getter
        WebElement SelectIcon;

        @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
        @Getter
        WebElement DisplayHotstarPage;

        @FindBy(xpath = "//a[@href=\"/in/genres\"]")
        @Getter
        WebElement SelectGenres;

        @FindBy(xpath = "//a[@href=\"/in/genres/drama\"]")
        @Getter
        WebElement Selectdrama;

        @FindBy(xpath = "//a[@href=\"/in/tv/guppedantha-manasu/1260049160\"]")
        @Getter
        WebElement SelectGuppendanthaManasu;

        @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
        @Getter
        WebElement SerialHotstarPage;

        @FindBy(xpath = "//a[@href=\"/in/genres/reality\"]")
        @Getter
        WebElement Selectreality;

        @FindBy(xpath = "//a[@href=\"/in/genres/travel\"]")
        @Getter
        WebElement Selecttravel;

        @FindBy(xpath = "//a[@href=\"/in/tv/postcards-from-maharashtra/1260127328\"]")
        @Getter
        WebElement SelectVedio;

        @FindBy(xpath = "//a[@href=\"/in/postcards-from-maharashtra-teaser-3/1260129363\"]")
        @Getter
        WebElement SelectTeaserVedio;

        @FindBy(xpath = "//a[@href=\"/in/genres/sport\"]")
        @Getter
        WebElement Selectsport;

        @FindBy(xpath = "//a[@href=\"/in/movies/liger-saala-crossbreed/1260115642\"]")
        @Getter
        WebElement SelectLiger;

        @FindBy(xpath = "//div[@class=\"play-icon pulsateIcon\"]")
        @Getter
        WebElement SelecetLigerTrailer;

        @FindBy(xpath = "//a[@href=\"/in/genres/animals-&-nature\"]")
        @Getter
        WebElement SelectAnimalsAndNature;

        @FindBy(xpath = "//a[@href=\"/in/tv/born-in-africa/1260008308\"]")
        @Getter
        WebElement SelectBornInAfrica;

        @FindBy(id = "searchField")
        @Getter
        WebElement SearchPage;

        @FindBy(id = "searchField")
        @Getter
        WebElement Searchvedio;

        @FindBy(xpath = "//a[@href=\"/in/born-in-africa-teaser/1000239442\"]")
        @Getter
        WebElement SelectBornInAfricaTeaser;

        @FindBy(xpath = "//h3[@class=\"title\"]")
        @Getter
        WebElement NotFoundPage;

}
