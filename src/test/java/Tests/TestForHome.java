package Tests;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForHome extends TestInit{

    @Test
    public void hotlineSearch(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        homePage.getSearchField().sendKeys("Lenovo");
        Assert.assertTrue(true);
    }

    @Test
    public void hotlineTheme(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        homePage.getThemeToggle().click();
        Assert.assertTrue(true);
    }

    @Test
    public void hotlineFooter(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHome();
        Assert.assertTrue(homePage.getFooter().isDisplayed());
    }
}
