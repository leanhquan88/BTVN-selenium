package com.cybersoft.automation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirbnbHomePageTest extends BaseTest {

    private final airbnbHomePage page = new airbnbHomePage();

    @Test
    @DisplayName("BT2 - Tất cả 14 locator đều tìm thấy element trên trang Cyberbnb")
    void allLocatorsShouldBeFound() {
        driver.get("https://demo5.cybersoft.edu.vn/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(page.boxDiaDiem));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[style*='9999']")));

        wait.until(ExpectedConditions.elementToBeClickable(page.boxThemKhach)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(page.btnTangKhach));

        StringBuilder report = new StringBuilder("\n==== KẾT QUẢ KIỂM CHỨNG LOCATOR (Bài Tập 2) ====\n");
        for (Map.Entry<String, By> e : page.getAllLocators().entrySet()) {
            List<WebElement> found = driver.findElements(e.getValue());
            report.append(String.format("[%s] %-22s -> %d element%n",
                    found.isEmpty() ? "FAIL" : " OK ", e.getKey(), found.size()));
            assertFalse(found.isEmpty(), "Không tìm thấy element: " + e.getKey());
        }
        System.out.println(report);
    }
}
