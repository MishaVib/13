import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.Project;
import helpers.AllureAttach;
import helpers.DriverSettings;
import helpers.DriverUtils;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;

@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Selenide.clearBrowserCookies();
        SelenideLogger.addListener("allure", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttach.addScreenshotAs("Last screenshot");
        AllureAttach.addPageSource();
        AllureAttach.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttach.addVideo(sessionId);
        }
    }
}