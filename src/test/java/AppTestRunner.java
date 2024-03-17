import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTestRunner extends Setup{
    AppScreen appScreen;

    @Test(priority = 1, description = "Customer add products in his shopping cart")
    public void addToCart() throws InterruptedException{
        appScreen = new AppScreen(driver);
        Thread.sleep(1000);
        appScreen.addToCartFunc();
    }

    @Test(priority = 2, description = "Customer successfully place order as a guest user")
    public void  placeOrderGuest() throws InterruptedException{
        appScreen = new AppScreen(driver);
        Thread.sleep(1000);
        String actual_txt = appScreen.placeOrderGuestFuc();
        String expected_txt = "Your order has been successfully processed!";
        Assert.assertTrue(actual_txt.contains(expected_txt));
    }

}
