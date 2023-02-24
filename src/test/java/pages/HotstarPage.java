package pages;

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
        private WebElement SelectIcon;

        public WebElement getSelectIcon() {
            return SelectIcon;
        }

        public WebElement getDisplayHotstarPage() {
            return DisplayHotstarPage;
        }

        @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
        private WebElement DisplayHotstarPage;

        @FindBy(xpath = "//a[@href=\"/in/genres\"]")
        private  WebElement SelectGenres;

        public WebElement getSelectGenres() {
            return SelectGenres;
        }

        @FindBy(xpath = "//a[@href=\"/in/genres/drama\"]")
        private  WebElement Selectdrama;

        public WebElement getSelectdrama() {
            return Selectdrama;
        }

        @FindBy(xpath = "//a[@href=\"/in/tv/guppedantha-manasu/1260049160\"]")
        private  WebElement SelectGuppendanthaManasu;

        public WebElement getSelectGuppendanthaManasu() {
            return SelectGuppendanthaManasu;
        }

        @FindBy(xpath = "//div[@class=\"master-container-inner\"]")
        private WebElement SerialHotstarPage;

        public WebElement getSerialHotstarPage(){
            return SerialHotstarPage;
        }

        @FindBy(xpath = "//a[@href=\"/in/genres/reality\"]")
        private WebElement Selectreality;

        public WebElement getSelectreality(){
            return Selectreality;
        }

        @FindBy(xpath = "//a[@href=\"/in/genres/travel\"]")
        private  WebElement Selecttravel;

        public WebElement getSelecttravel() {
            return Selecttravel;
        }


        @FindBy(xpath = "//a[@href=\"/in/tv/postcards-from-maharashtra/1260127328\"]")
        private  WebElement SelectVedio;

        public WebElement getSelectVedio() {
            return SelectVedio;
        }

        @FindBy(xpath = "//a[@href=\"/in/postcards-from-maharashtra-teaser-3/1260129363\"]")
        private  WebElement SelectTeaserVedio;

        public WebElement getSelectTeaserVedio() {
            return SelectTeaserVedio;
        }

        @FindBy(xpath = "//a[@href=\"/in/genres/sport\"]")
        private  WebElement Selectsport;

        public WebElement getSelectsport() {
            return Selectsport;
        }

        @FindBy(xpath = "//a[@href=\"/in/movies/liger-saala-crossbreed/1260115642\"]")
        private  WebElement SelectLiger;

        public WebElement getSelectLiger() {
            return SelectLiger;
        }

        @FindBy(xpath = "//div[@class=\"play-icon pulsateIcon\"]")
        private WebElement SelecetLigerTrailer;

        public WebElement getSelecetLigerTrailer() {
            return SelecetLigerTrailer;
        }

        @FindBy(xpath = "//a[@href=\"/in/genres/animals-&-nature\"]")
        private  WebElement SelectAnimalsAndNature;

        public WebElement getSelectAnimalsAndNature() {
            return SelectAnimalsAndNature;
        }

        @FindBy(xpath = "//a[@href=\"/in/tv/born-in-africa/1260008308\"]")
        private  WebElement SelectBornInAfrica;

        public WebElement getSelectBornInAfrica() {
            return SelectBornInAfrica;
        }

        public WebElement getSearchPage() {
            return SearchPage;
        }

        @FindBy(id = "searchField")
        private WebElement SearchPage;

    public WebElement getSearchvedio() {
        return Searchvedio;
    }

    @FindBy(id = "searchField")
        private WebElement Searchvedio;

        @FindBy(xpath = "//a[@href=\"/in/born-in-africa-teaser/1000239442\"]")
        private  WebElement SelectBornInAfricaTeaser;

        public WebElement getSelectBornInAfricaTeaser() {
            return SelectBornInAfricaTeaser;
        }

        @FindBy(xpath = "//h3[@class=\"title\"]")
        private WebElement NotFoundPage;

        public WebElement getNotFoundPage() {
            return NotFoundPage;
        }
}
