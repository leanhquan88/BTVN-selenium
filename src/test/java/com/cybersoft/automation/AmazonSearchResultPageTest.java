package com.cybersoft.automation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

@Disabled("Amazon có CAPTCHA/chống bot; bật thủ công bằng cách xoá annotation này")
public class AmazonSearchResultPageTest extends BaseTest {

    private final amazonSearchResultPage page = new amazonSearchResultPage();

    @Test
    @DisplayName("BT3 - Tìm 'adidas' và kiểm chứng locator (tham khảo)")
    void locatorsReport() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(page.searchBox));
        WebElement box = driver.findElement(page.searchBox);
        box.sendKeys("adidas");
        box.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfElementLocated(page.resultsCount));

        StringBuilder report = new StringBuilder("\n==== KẾT QUẢ KIỂM CHỨNG LOCATOR (Bài Tập 3) ====\n");
        for (Map.Entry<String, By> e : page.getAllLocators().entrySet()) {
            List<WebElement> found = driver.findElements(e.getValue());
            report.append(String.format("[%s] %-30s -> %d element%n",
                    found.isEmpty() ? "FAIL" : " OK ", e.getKey(), found.size()));
        }
        System.out.println(report);
    }
}
