# Проект по автоматизации тестирования для Wildberries
## <a target="_blank" href="https://www.wildberries.ru/">Веб сайт Wildberries</a>

## :shinto_shrine: Содержание:

- <a href="#shinto_shrine-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#shinto_shrine-реализованные-проверки">Реализованные проверки</a>
- <a href="#shinto_shrine-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#shinto_shrine-запуск-из-терминала">Запуск из терминала</a>
- <a href="#shinto_shrine-allure-отчет">Allure отчет</a>
- <a href="#shinto_shrine-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- <a href="#shinto_shrine-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#shinto_shrine-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#shinto_shrine-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :shinto_shrine: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :shinto_shrine: Реализованные проверки
- Открытие сайта
- Открытие чата поддержки
- Наличие на сайте категории "Хиты продаж"
- Проверка результатов поиска товара 
- Проверка доступности бургер меню

## :shinto_shrine: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/Misha_13_1//">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/Jenkins.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 100.0)
- size (размер окна браузера, по умолчанию 1920x1080)
- remoteUrl (адрес удаленного сервера selenoid)
- user (пользователль удаленного сервера selenoid)
- password (пароль от удаленного сервера selenoid)
- threads (количество потоков)

## :shinto_shrine: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Duser=${USER}
-Dpassword=${PASSWORD}
-Dbrowser=${BROWSER}
-DremoteBrowser=${REMOTE_BROWSER}
-Dversion=${VERSION}
-Dsize=${BROWSER_SIZE}
-Dthreads=${THREADS}
```

## :shinto_shrine: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_report_1.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure_report_2.jpg">
</p>

## :shinto_shrine: Интеграция с Allure TestOps
- ### Экран с результатами запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/allure_test_ops_1.png">
</p>

- ### Страница с тестами в TestOps
<p align="center">
<img title="TestOps tests page" src="images/screenshots/allure_test_ops_2.png">
</p>

## :shinto_shrine: Интеграция с Jira
- ### Страница с задачей в Jira
<p align="center">
<img title="Jira issue" src="images/screenshots/Jira_1.png">
</p>

## :shinto_shrine: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/bot_telegramm.png">
</p>

## :shinto_shrine: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test_success_example.gif">
</p>