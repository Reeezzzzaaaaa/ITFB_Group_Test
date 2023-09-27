package auth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WindowsPage {

    private final SelenideElement browserWindowsButton = $x("//*[@class='menu-list']//*[contains(text(),'Browser Windows')]");

    private final SelenideElement newTabButton = $x("//*[@id='tabButtonWrapper']//*[@id='tabButton']");

    private final SelenideElement newWindowButton = $x("//*[@id='browserWindows']//*[@id='windowButtonWrapper']");

    public void browserWindows() {
        browserWindowsButton.click();
        new WindowsPage();
    }

    public void newTab() {
//        switchTo().window(getWebDriver().getWindowHandle()).close();
        newTabButton.click();
        switchTo().window(1).close();
        switchTo().window(0);
        new WindowsPage();
    }

    public void newWindow() {
        actions().moveToElement(newWindowButton, -300, 10).release().click().build().perform();
        switchTo().window(1).close();
        switchTo().window(0);
        new WindowsPage();
    }
}
