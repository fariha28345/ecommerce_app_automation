import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class AppScreen {
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    WebElement btnAccept;
    @FindBy(className = "android.widget.ImageView") //4
    List<WebElement> cartView;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnPlus")
    WebElement btnPlus;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")
    WebElement btnAddToCart;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    WebElement iconCounter;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    WebElement btnCheckout;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement btnGuestCheckout;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement firstName;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    WebElement lastName;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    WebElement email;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")
    WebElement countrySpinner;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    WebElement stateSpinner;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    WebElement etCName;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    WebElement etCity;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    WebElement etSAddr;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    WebElement etZipCode;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etPhone")
    WebElement etPhoneN;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFax")
    WebElement etFax;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnCont;
    AndroidDriver driver;
    public AppScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void addToCartFunc() throws InterruptedException {
        btnAccept.click();

        new TouchAction(driver)
                .longPress(PointOption.point(1009, 925))
                .moveTo(PointOption.point(150, 947))
                .release()
                .perform();

        cartView.get(7).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/ivCategoryBanner")));

        new TouchAction(driver)
                .longPress(PointOption.point(833, 2005))
                .moveTo(PointOption.point(833, 670))
                .release()
                .perform();
        cartView.get(8).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/image_view")));

        new TouchAction(driver)
                .longPress(PointOption.point(819, 1629))
                .moveTo(PointOption.point(819, 921))
                .release()
                .perform();
        btnPlus.click();
        btnAddToCart.click();
    }

    public String placeOrderGuestFuc() throws InterruptedException {
        iconCounter.click();

        btnCheckout.click();

        btnGuestCheckout.click();

        firstName.sendKeys("Fariha");
        lastName.sendKeys("Rahman");
        email.sendKeys("fariharahman.cse@gmail.com");


        countrySpinner.click();
        Thread.sleep(2000);

        new TouchAction(driver)
                .longPress(PointOption.point(536, 2164))
                .moveTo(PointOption.point(536, 75))
                .release()
                .perform();

        driver.findElements(By.className("android.widget.TextView")).get(13).click();


        stateSpinner.click();

        driver.findElements(By.className("android.widget.TextView")).get(1).click();

        etCName.sendKeys("JU");
        etCity.sendKeys("Dhaka");
        Thread.sleep(2000);

        new TouchAction(driver)
                .longPress(PointOption.point(708, 1943))
                .moveTo(PointOption.point(708, 960))
                .release()
                .perform();
        etSAddr.sendKeys("34/13Dhaka");

        etZipCode.sendKeys("2345");
        etPhoneN.sendKeys("01992884775");
        etFax.sendKeys("1236");
        btnCont.click();
        Thread.sleep(2000);

        driver.findElements(By.className("android.widget.RelativeLayout")).get(8).click();

        new TouchAction(driver)
                .longPress(PointOption.point(447, 2032))
                .moveTo(PointOption.point(447, 1230))
                .release()
                .perform();

        driver.findElements(By.className("android.widget.Button")).get(1).click();
        Thread.sleep(2000);
        new TouchAction(driver)
                .longPress(PointOption.point(453, 1999))
                .moveTo(PointOption.point(453, 87))
                .release()
                .perform();

        new TouchAction(driver)
                .longPress(PointOption.point(495, 1958))
                .moveTo(PointOption.point(495, 495))
                .release()
                .perform();

        driver.findElements(By.className("android.widget.ImageView")).get(21).click();

        driver.findElements(By.className("android.widget.Button")).get(1).click();

        driver.findElement(By.className("android.widget.Button")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/checkoutButton")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message")));

        String verifyTxt = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message")).getText();

        return verifyTxt;

    }
}
