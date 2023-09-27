package auth.test;

import auth.dataHelper.DataHelper;
import auth.pages.*;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    @Owner(value = "Рязанцев Александр")

    @BeforeEach
    void openPage() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000;
        open("https://demoqa.com/");
    }

    @DisplayName("Успешный тест запонения формы, нажатия кнопок, открытия новых окно и выполнение действий с всплывающими сообщениями")
    @Description("Переходим на сайт https://demoqa.com/ и заполняем форму, проверяем нажатие кнопок, открываем новые окна и работаем с всплывающими сообщениями")
    @Test
    void shouldSuccessAuthTest() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.elements();
        mainPage.textBox();
        TextBoxPage textBox = new TextBoxPage();
        textBox.userData(DataHelper.getFullName(), DataHelper.getEmail(), DataHelper.getCurrentAddress(), DataHelper.getPermanentAddress());
        textBox.submit();
        textBox.results(DataHelper.getFullName(), DataHelper.getEmail(), DataHelper.getCurrentAddress(), DataHelper.getPermanentAddress());
        mainPage.buttons();
        ButtonsPage buttons = new ButtonsPage();
        buttons.clickMe();
        buttons.rightClickMe();
        buttons.doubleClickMe();
        mainPage.elementsCloseOpen();
        Thread.sleep(1000);
        mainPage.alertsFrameAndWindows();
        WindowsPage windows = new WindowsPage();
        windows.browserWindows();
        windows.newTab();
        windows.newWindow();
        mainPage.alert();
        AlertPage alert = new AlertPage();
        alert.alertClickMe();
        alert.timerAlert();
        alert.confirmAlert();
        alert.confirmResult();
        alert.promtAlert(DataHelper.getFullName());
        alert.promptResult();
    }
}
