package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

public void navigateHome(){
        driver.get("https://hotline.ua/");
}
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@placeholder='Знайти товар, магазин, бренд']"));
    }
    public WebElement getThemeToggle(){
        return driver.findElement(By.xpath("//span[@class='toggle__button toggle__button--left']"));
    }
    public WebElement getFooter(){
        return driver.findElement(By.xpath("//footer[@class='footer default-layout__footer']\n"));
    }
}
