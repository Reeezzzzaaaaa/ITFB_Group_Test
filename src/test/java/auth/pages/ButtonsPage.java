package auth.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {

    private final SelenideElement clickMeButton = $x("//*[@class='mt-4']//*[text()='Click Me']");

    private final SelenideElement dynamicClickMassage = $x("//*[text()='You have done a dynamic click']");

    private final SelenideElement rightClickMeButton = $x("//*[@class='mt-4']//*[@id='rightClickBtn']");

    private final SelenideElement rightClickMassage = $x("//*[text()='You have done a right click']");

    private final SelenideElement doubleClickMeButton = $x("//*[@id='doubleClickBtn']");

    private final SelenideElement doubleClickMassage = $x("//*[text()='You have done a double click']");


    public void clickMe() {
        clickMeButton.click();
        dynamicClickMassage.shouldBe(visible, Duration.ofSeconds(15));
        new ButtonsPage();
    }

    public void rightClickMe() {
        rightClickMeButton.contextClick();
        rightClickMassage.shouldBe(visible, Duration.ofSeconds(15));
        new ButtonsPage();
    }

    public void doubleClickMe() {
        doubleClickMeButton.doubleClick();
        doubleClickMassage.shouldBe(visible, Duration.ofSeconds(15));
        new ButtonsPage();
    }
}
