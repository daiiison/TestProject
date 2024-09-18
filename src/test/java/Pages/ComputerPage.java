package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputerPage extends BasePage{
    public ComputerPage(WebDriver driver){
        super(driver);
    }
    public void navigateComputer(){
        driver.get("https://hotline.ua/ua/computer/");}

    public WebElement getSidebar(){
        return driver.findElement(By.xpath("//aside[@class='col-xs-12 col-lg-3']"));
    }
    public WebElement getLaptopsContainer(){
        return driver.findElement(By.xpath("//div[@id='noutbuki-pk']"));
    }
    public WebElement getBreadcrumbs(){
        return driver.findElement(By.xpath("(//div[@class='breadcrumbs__container'])[1]"));
    }

}
