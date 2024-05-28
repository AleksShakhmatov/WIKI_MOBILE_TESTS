# ������ �� ��������� ������������� �������� ��������� ��� ����� Wikipedia

����� � ������� �������� �� ����� <code>Java</code> � �������������� ����������  [Selenide](https://selenide.org/) � �������� <code>Gradle</code>. <code>JUnit 5</code> ������������ � �������� ���������� ���������� ������������.
��� ������� ������ ��� ��������� ������� ��������� ������������ [Selenoid](https://aerokube.com/selenoid/).
��� ���������� ������� ����������� ������ � <code>Jenkins</code> � ������������� Allure-������ � ��������� ����������� � <code>Telegram</code> ��� ������ ����. ����� ����������� ���������� � <code>Allure TestOps</code> � <code>Jira</code>.


## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/yellow-computer-folder.png"> ����������:

- <a href="#tools"> ������������ �����������</a>
- <a href="#cases"> ����-�����</a>
- <a href="#autotests"> ������ ����������</a>
- <a href="#jenkins"> ������ � Jenkins</a>
- <a href="#allureReport"> ������ Allure-������</a>
- <a href="#allure"> ���������� � Allure TestOps</a>
- <a href="#jira"> ���������� � Jira</a>
- <a href="#tg"> ����������� � Telegram � �������������� ����</a>
- <a href="#video"> ����� ������� ������� ������ � Browserstack</a>

<a id="stech"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/programm.jpg"> ������������ ���� ���������� � ������������

| Java                                                    | IntelliJ  <br>  Idea                                            | GitHub                                                    | JUnit 5                                                   | Gradle                                                    | Selenide                                                    | Selenoid                                                    | Allure<br/>Report                                                | Allure <br> TestOps                                               | Jenkins                                                    | Jira                                                    |                                                    Telegram |
|:--------------------------------------------------------|-----------------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-------------------------------------------------------------|-------------------------------------------------------------|------------------------------------------------------------------|-------------------------------------------------------------------|------------------------------------------------------------|---------------------------------------------------------|------------------------------------------------------------:|
| <img height="50" src="media/logo/Java.svg" width="50"/> | <img height="50" src="media/logo/Intelij_IDEA.svg" width="50"/> | <img height="50" src="media/logo/GitHub.svg" width="50"/> | <img height="50" src="media/logo/JUnit5.svg" width="50"/> | <img height="50" src="media/logo/Gradle.svg" width="50"/> | <img height="50" src="media/logo/Selenide.svg" width="50"/> | <img height="50" src="media/logo/Selenoid.svg" width="50"/> | <img height="50" src="media/logo/Allure_Report.svg" width="50"/> | <img height="50" src="media\logo\Allure_TestOps.svg" width="50"/> | <img height="50" src="media/logo/Jenkins.svg" width="50"/> | <img height="50" src="media/logo/Jira.svg" width="50"/> | <img height="50" src="media\logo\Telegram.svg" width="50"/> |


<a id="chek"></a>
##  <img width="40" height="40" style="vertical-align:middle" title="List" src="media/images/todo.png"> ������������� ��������
- �������� �������� ������� �����
- �������� ����� �����
- �������� ��������� ������ �� �������� ��������
- �������� ���������-���� �����
- �������� ������� ������ ������
- �������� ������� ������� ���������� �����

<a id="engine"></a>
## <img height="40" src="media/images/play.jpg" title="Play" width="40"/> ������ ����������


### ������ ������ �� ��������� ��������:
```
gradle clean test 
```
### ������ ������ �� ��������� �������� (Selenoid):
```      
gradle clean test -Denv=main
```
### ������ ������ � Jenkins:
```   
clean test
```

<a id="build"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins.svg"> ������ � Jenkins

��� ������� ������ ���������� ������� � ������ **"Build with Parameters"** � ������ ������ **"Build"**.
<p align="center">
<img title="Jenkins Build" src="media/screenshots/JenkinsBuild.png"> 
</p>

����� ���������� ������, � ����� **Build History** �������� ������ ������ �������� ������ <img src="media\logo\Allure_TestOps.svg" width="15" height="15">
� <img src="media\logo\Allure_Report.svg" width="15" height="15"> , ��� ����� �� ������� ��������� ���������������
���������.

## <img width="40" height="40" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure_Report.svg"> ���������� � Allure

<a id="report"></a>
### Allure �����

<p align="center">   
<img title="Jenkins Build" src="media/screenshots/Allure_Report1.png">    
</p>

### ���������
<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report2.png">    
</p>       

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report3.png">    
</p>  

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report4.png">    
</p>  

## <img width="40" height="40" style="vertical-align:middle" title="Allure TestOps" src="media/logo/Allure_TestOps.svg"> ���������� � Allure TestOps


<a id="testops"></a>
### Allure TestOps �����

#### Overview

<p align="center">    
<img title="Allure TestOps Overview" src="media/screenshots/Allure_TestOps1.png">
</p>

#### DashBoards
<p align="center">
<img title="Allure TestOps DashBoards" src="media/screenshots/Allure_TestOps2.png">
</p>

#### ���������

<p align="center">
<img title="Test Results in Alure TestOps" src="media/screenshots/Allure_TestOps3.png">
</p>


<a id="jira"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jira" src="media/logo/Jira.svg"> ���������� � Jira


<p align="center">
<img title="Jira Task" src="media/screenshots/Jira.png">
</p>

## <img width="40" height="40" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> ����������� � Telegram ����� ����


<a id="telegram"></a>
<p align="center">
<img title="Telegram Notifications" src="media/screenshots/Notifiacations.png">
</p>


<a id="video"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Selenoid" src="media/logo/Selenoid.svg"> ����� ����� ������� ������ (Selenoid)

<p align="center">
  <img title="Selenoid Video" src="media/gifs/IBS.gif">
</p>
