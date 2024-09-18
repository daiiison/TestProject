package Tests;
import Pages.IPhonePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForPhone extends TestInit{

    @Test
    public void hotlinePhoneAbout(){
        IPhonePage iPhonePage = new IPhonePage(driver);
        iPhonePage.navigateIphone();
        Assert.assertTrue(iPhonePage.getAboutProdBtn().isDisplayed());
    }

    @Test
    public void hotlinePhoneCompare(){
        IPhonePage iPhonePage = new IPhonePage(driver);
        iPhonePage.navigateIphone();
        Assert.assertTrue(iPhonePage.getCompareBtn().isDisplayed());
    }

    @Test
    public void hotlinePhoneAll(){
        IPhonePage iPhonePage = new IPhonePage(driver);
        iPhonePage.navigateIphone();
        iPhonePage.getPersonalListBtn().click();
        Assert.assertTrue(true);
    }
}
