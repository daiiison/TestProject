package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IPhonePage extends BasePage{

    public IPhonePage(WebDriver driver){
        super(driver);
    }
    public void navigateIphone(){
        driver.get("https://hotline.ua/ua/mobile-mobilnye-telefony-i-smartfony/apple-iphone-15-pro-max-256gb-black-titanium-mu773/");}

    public WebElement getCompareBtn(){
return driver.findElement(By.xpath("//button[contains(text(),'Порівняти')]"));
    }
    public WebElement getAboutProdBtn(){
        return driver.findElement(By.xpath("//b[contains(text(),'Про товар')]"));
    }
    public WebElement getPersonalListBtn(){
    return driver.findElement(By.xpath("//div[@class='action-button flex action-button--bookmark']\n"));
}
}
