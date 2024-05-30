# Проект по мобильной автоматизации тестовых сценариев для сайта Wikipedia

Википе́дия (англ. Wikipedia, произносится о файле/ˌwɪkɪˈpiːdiə/, разг. «Ви́ки» по названию технологии веб-сайта) — многоязычная общедоступная интернет-энциклопедия со свободным контентом, поддержку и написание которой осуществляют добровольцы — «википедисты», посредством открытого сотрудничества и с использованием программного обеспечения (сайта) MediaWiki, а также системы редактирования на основе вики-принципов. Википедия является самым крупным и наиболее читаемым справочником, а также самой полной энциклопедией из когда-либо создававшихся за всю историю человечества. По состоянию на февраль 2024 года сайт находится на 7 месте по посещаемости в мире по версии компании SimilarWeb, занимающейся анализом интернет-трафика.

## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/yellow-computer-folder.png"> Содержание:

- <a href="#tools">  Используемый стек технологий и инструментов</a>
- <a href="#cases"> Реализованные проверки</a>
- <a href="#autotests"> Запуск автотестов</a>
- <a href="#jenkins"> Сборка в Jenkins</a>
- <a href="#allureReport"> Интеграция Allure-отчета</a>
- <a href="#allure"> Интеграция с Allure TestOps</a>
- <a href="#jira"> Интеграция с Jira</a>
- <a href="#tg"> Уведомления в Telegram с использованием бота</a>
- <a href="#video"> Видео отчет запуска тестов в Browserstack</a>

<a id="stech"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/programm.jpg"> Используемый стек технологий и инструментов

| Java                                                    | IntelliJ  <br>  Idea                                            | GitHub                                                    | JUnit 5                                                   | Gradle                                                    | Selenide                                                    | Selenoid                                                    | Allure<br/>Report                                                | Allure <br> TestOps                                               | Jenkins                                                    | Jira                                                    |                                                    Telegram |
|:--------------------------------------------------------|-----------------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-------------------------------------------------------------|-------------------------------------------------------------|------------------------------------------------------------------|-------------------------------------------------------------------|------------------------------------------------------------|---------------------------------------------------------|------------------------------------------------------------:|
| <img height="50" src="media/logo/Java.svg" width="50"/> | <img height="50" src="media/logo/Intelij_IDEA.svg" width="50"/> | <img height="50" src="media/logo/GitHub.svg" width="50"/> | <img height="50" src="media/logo/JUnit5.svg" width="50"/> | <img height="50" src="media/logo/Gradle.svg" width="50"/> | <img height="50" src="media/logo/Selenide.svg" width="50"/> | <img height="50" src="media/logo/Selenoid.svg" width="50"/> | <img height="50" src="media/logo/Allure_Report.svg" width="50"/> | <img height="50" src="media\logo\Allure_TestOps.svg" width="50"/> | <img height="50" src="media/logo/Jenkins.svg" width="50"/> | <img height="50" src="media/logo/Jira.svg" width="50"/> | <img height="50" src="media\logo\Telegram.svg" width="50"/> |


Тесты в проекте написаны на языке <code>Java</code> с использованием фреймворка  [Selenide](https://selenide.org/) и сборщика <code>Gradle</code>. <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
При прогоне тестов для удалённого запуска браузеров используется [Selenoid](https://aerokube.com/selenoid/).
Для удаленного запуска реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота. Также реализована интеграция с <code>Allure TestOps</code> и <code>Jira</code>.


<a id="chek"></a>
##  <img width="40" height="40" style="vertical-align:middle" title="List" src="media/images/todo.png"> Реализованные проверки
- Проверка обнаружения результатов поиска
- Поиск нужного определения
- Проверка наличия заголовка в новостях

<a id="engine"></a>
## <img height="40" src="media/images/play.jpg" title="Play" width="40"/> Запуск автотестов


### Запуск тестов из терминала локально:
```
gradle clean test 
```
### Запуск тестов из терминала удаленно (Selenoid):
```      
gradle clean test -Denv=main
```
### Запуск тестов в Jenkins:
```   
clean test
```

<a id="build"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins.svg"> [Сборка в Jenkins](https://jenkins.autotests.cloud/job/SH_Diploma_WIKI_MOBILE_TESTS/)

Для запуска сборки необходимо перейти в раздел **"Build with Parameters"** и нажать кнопку **"Build"**.
<p align="center">
<img title="Jenkins Build" src="media/screenshots/Jenkins_Build.png"> 
</p>

После выполнения сборки, в блоке **Build History** напротив номера сборки появятся значки <img src="media\logo\Allure_TestOps.svg" width="15" height="15">
и <img src="media\logo\Allure_Report.svg" width="15" height="15"> , при клике на которые откроются соответствующие
артефакты.

## <img width="40" height="40" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure_Report.svg"> [Интеграция с Allure](https://jenkins.autotests.cloud/job/SH_Diploma_WIKI_MOBILE_TESTS/allure/)

<a id="report"></a>
### Allure отчет

<p align="center">   
<img title="Jenkins Build" src="media/screenshots/Allure_Report1.png">    
</p>

### Подробнее
<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report2.png">    
</p>       

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report3.png">    
</p>  

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report4.png">    
</p>  

## <img width="40" height="40" style="vertical-align:middle" title="Allure TestOps" src="media/logo/Allure_TestOps.svg"> [Интеграция с Allure TestOps](https://allure.autotests.cloud/launch/39386)


<a id="testops"></a>
### Allure TestOps отчет

#### Overview

<p align="center">    
<img title="Allure TestOps Overview" src="media/screenshots/Allure_TestOps1.png">
</p>

#### DashBoards
<p align="center">
<img title="Allure TestOps DashBoards" src="media/screenshots/Allure_TestOps2.png">
</p>

#### Подробнее

<p align="center">
<img title="Test Results in Alure TestOps" src="media/screenshots/Allure_TestOps3.png">
</p>


<a id="jira"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jira" src="media/logo/Jira.svg"> [Интеграция с Jira](https://jira.autotests.cloud/browse/HOMEWORK-1243)


<p align="center">
<img title="Jira Task" src="media/screenshots/Jira.png">
</p>

## <img width="40" height="40" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> [Уведомления в Telegram с использованием бота](https://t.me/HW16Notification)


<a id="telegram"></a>
<p align="center">
<img title="Telegram Notifications" src="media/screenshots/Notifications.png">
</p>


<a id="video"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Selenoid" src="media/logo/Selenoid.svg"> [Видео отчет запуска тестов в Browserstack](https://app-automate.browserstack.com/sessions/7b4df51549dd845f2f0e69e6231750c95eba4605/video?token=ZzZueXpkTUxKQVJpOHIxczZBREdybFZpWmRUdTBjTm81aXdtdWd4SUk2MU9RSTBMQWRHTXRXVGNZSlF1OWtpYWx0aUdENXpkazZvT0FvYVdCcWpNM0E9PS0tSWFBSDBqYlI3a3dqMm93WmZiSkJyZz09--e2bea91dfb910fa16d7890ef9ffe90f87c6223e8&source=rest_api&diff=1.52170954)

<p align="center">
  <img title="Selenoid Video" src="media/gifs/WIKI.gif">
</p>
