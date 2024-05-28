package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@Owner("AleksSh")
@Epic("��������� ����� ����� ���������")
@Feature("������������� �������� ��������� Android ������ ���������")
@Severity(SeverityLevel.NORMAL)

public class SearchTests extends TestBase {

    @Test
    @DisplayName("�������� ����������� ����������� ������")
    void checkResultTest() {
        step("���������� ������ � ���������", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });

        step("���������, ��� ���������� ���������� ������", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }


    @Test
    @DisplayName("�������� ������ ��������� ������")
    void successfulSearchTest() {
        step("���������� ������ � ���������", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });

        step("�������� �� ������ ��������� ������", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click());

        step("��������� ��������� ������", () ->
                $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(visible));
    }


    @Test
    @DisplayName("�������� ������� ���������")
    void checkNewsHeaderTest() {
        step("�������� ������� ��������� � ��������", () -> {
            $(id("org.wikipedia.alpha:id/view_card_header_title")).shouldHave(text("In the news"));
        });
    }

}