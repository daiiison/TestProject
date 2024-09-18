package Tests;
import Pages.ComputerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForComputer extends TestInit{

    @Test
    public void hotlineCompsBreadcrumbs(){
        ComputerPage computerPage = new ComputerPage(driver);
        computerPage.navigateComputer();
        Assert.assertTrue(computerPage.getBreadcrumbs().isDisplayed());
    }

    @Test
    public void hotlineCompsSidebar(){
        ComputerPage computerPage = new ComputerPage(driver);
        computerPage.navigateComputer();
        Assert.assertTrue(computerPage.getSidebar().isDisplayed());
    }

    @Test
    public void hotlineCompsLaptopCont(){
        ComputerPage computerPage = new ComputerPage(driver);
        computerPage.navigateComputer();
        Assert.assertTrue(computerPage.getLaptopsContainer().isDisplayed());
    }
}
