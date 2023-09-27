package auth.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement elementsButton = $x("//*[@class='card mt-4 top-card']//h5[text()='Elements']");

    private final SelenideElement elementsCloseOpen = $x("//*[contains(text(),'Elements')]/parent::div");

    private final SelenideElement textBoxButton = $x("//*[@class='menu-list']//span[text()='Text Box']");

    private final SelenideElement chapterButtons = $x("//*[@class='menu-list']//*[text()='Buttons']");

    private final SelenideElement alertsFrameAndWindowsButton = $x("//*[@class='header-wrapper']//*[text()='Alerts, Frame & Windows']");

    private final SelenideElement alert = $x("//*[@id='item-1']//*[text()='Alerts']");
    public void elements() {
        elementsButton.click();
        new MainPage();
    }

    public void elementsCloseOpen() {
        elementsCloseOpen.click();
        new MainPage();
    }

    public void textBox() {
        textBoxButton.click();
        new MainPage();
    }

    public void buttons() {
        chapterButtons.click();
        new MainPage();
    }

    public void alertsFrameAndWindows() {
        alertsFrameAndWindowsButton.click();
        new MainPage();
    }

    public void alert() {
        alert.click();
        new MainPage();
    }
}
