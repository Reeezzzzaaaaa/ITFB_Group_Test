package auth.pages;

import auth.dataHelper.DataHelper;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class AlertPage {

    private final SelenideElement alertButton = $x("//*[@id='javascriptAlertsWrapper']//*[@id='alertButton']");

    private final SelenideElement timerAlertButton = $x("//*[@id='javascriptAlertsWrapper']//*[@id='timerAlertButton']");

    private final SelenideElement confirmButton = $x("//*[@id='javascriptAlertsWrapper']//*[@id='confirmButton']");

    private final SelenideElement confirmResult = $x("//*[@class='mt-4 row']//*[@id='confirmResult']");

    private final SelenideElement promtButton = $x("//*[@id='javascriptAlertsWrapper']//*[@id='promtButton']");

    private final SelenideElement promptResult = $x("//*[@class='mt-4 row']//*[@id='promptResult']");

    public void alertClickMe() {
        alertButton.click();
        switchTo().alert().accept();
        new AlertPage();
    }

    public void timerAlert() throws InterruptedException {
        timerAlertButton.click();
        Thread.sleep(5500);
        switchTo().alert().accept();
        new AlertPage();
    }

    public void confirmAlert() {
        confirmButton.click();
        switchTo().alert().accept();
        new AlertPage();
    }

    public void confirmResult() {
        confirmResult.shouldBe(visible, Duration.ofSeconds(15));
        new AlertPage();
    }

    public void promtAlert(DataHelper.FuLLName userName) {
        promtButton.click();
        switchTo().alert().sendKeys(userName.getFullName());
        switchTo().alert().accept();
        new AlertPage();
    }

    public void promptResult() {
        promptResult.shouldBe(visible, Duration.ofSeconds(15));
        new AlertPage();
    }
}
