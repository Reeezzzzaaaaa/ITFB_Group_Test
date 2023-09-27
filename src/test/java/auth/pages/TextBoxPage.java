package auth.pages;

import auth.dataHelper.DataHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage {

    private final SelenideElement fullName = $("div.text-field-container #userName");

    private final SelenideElement email = $("div.text-field-container #userEmail");

    private final SelenideElement curAddress = $("div.text-field-container #currentAddress");

    private final SelenideElement perAddress = $("div.text-field-container #permanentAddress");

    private final SelenideElement submitButton = $("div.text-field-container #submit");

    private final SelenideElement nameResult = $x("//*[@id='output']//*[@id='name']");

    private final SelenideElement emailResult = $x("//*[@id='output']//*[@id='email']");

    private final SelenideElement currentAddressResult = $x("//*[@id='output']//*[@id='currentAddress']");

    private final SelenideElement permanentAddressResult = $x("//*[@id='output']//*[@id='permanentAddress']");

    public void userData(DataHelper.FuLLName userName, DataHelper.Email userEmail, DataHelper.CurrentAddress userCurrentAddress, DataHelper.PermanentAddress userPermanentAddress) {
        fullName.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        fullName.setValue(userName.getFullName());
        email.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        email.setValue(userEmail.getEmail());
        curAddress.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        curAddress.setValue(userCurrentAddress.getCurrentAddress());
        perAddress.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        perAddress.setValue(userPermanentAddress.getPermanentAddress());
        new TextBoxPage();
    }

    public void submit() {
        submitButton.click();
        new TextBoxPage();
    }

    public void results(DataHelper.FuLLName userName, DataHelper.Email userEmail, DataHelper.CurrentAddress userCurrentAddress, DataHelper.PermanentAddress userPermanentAddress) {
        nameResult.shouldHave(text(userName.getFullName()));
        emailResult.shouldHave(text(userEmail.getEmail()));
        currentAddressResult.shouldHave(text(userCurrentAddress.getCurrentAddress()));
        permanentAddressResult.shouldHave(text(userPermanentAddress.getPermanentAddress()));
        new TextBoxPage();
    }
}
