
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class  First extends TestBase {
    @DisplayName("Открытие страницы")
    @Test
    void openPage() {
        step("Открываем сайт", () -> {
            open("https://www.wildberries.ru/");
            $("img[alt='Wildberries']").shouldBe(Condition.visible);
        });
    }

    @Test
    @DisplayName("Выбор локали")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт", () -> {
            open("https://www.wildberries.ru/");
        });
        step("Хиты продаж", () -> {
            $("h2.goods__header").shouldHave(Condition.text("Хиты продаж"));
        });
    }



    @Test
    @DisplayName("Результаты поиска")
    void localPoland() {
        step("Открываем сайт", () -> {
            open("https://www.wildberries.ru/");
        });
        step("Ввод данных в строку поиска", () -> {
            $("input#searchInput").setValue("iphone").pressEnter();
            $("h1.searching-results__title").shouldHave(Condition.text("По запросу «iphone» найдено"))
                    .shouldBe(Condition.visible);
        });
    }

    @Test
    @DisplayName("Чат поддержки")
    void chat() {
        step("Открываем сайт", () -> {
            open("https://www.wildberries.ru/");
        });
        step("Отображение чата поддержки", () -> {
        $("[aria-label='Онлайн чат']").click();
        $("h2.chat__header").shouldBe(Condition.visible)
                .shouldHave(Condition.text("Чат поддержки"));
        });
    }

    @Test
    @DisplayName("Бургер меню")
    void burgerMenu() {
        step("Открываем сайт", () -> {
            open("https://www.wildberries.ru/");
        });
        step("Клик по бургер менют", () -> {
            $("[aria-label='Навигация по сайту'").click();
            $(".menu-burger__main-list").shouldBe(Condition.visible);
        });
        }
    }










