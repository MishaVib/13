
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.AllureAttach;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.sleep;

@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void beforeAll() {
            Configuration.baseUrl = "https://www.wildberries.ru/";
            Configuration.browserSize = System.getProperty("size", "1920x1080");
            Configuration.browser = System.getProperty("browser", "chrome");
            Configuration.pageLoadTimeout = 80000;
            Configuration.browserVersion = System.getProperty("version", "100");

            //password and user for remote browser
            String user = System.getProperty("user");
            String password = System.getProperty("password");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = "https://" + user + ":" + password + "@" + System.getProperty("remoteBrowser");

            SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
public void addAttachments() {
        AllureAttach.screenshotAs("Скриншот");
        AllureAttach.pageSource();
        AllureAttach.browserConsoleLogs();
        AllureAttach.addVideo();
        sleep(5000);
        Selenide.closeWebDriver();

        }
    }
