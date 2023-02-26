package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static void waitTillVisible(WebDriver driver, WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
