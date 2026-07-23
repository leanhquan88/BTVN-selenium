package com.cybersoft.automation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class HrmAdminPageTest extends BaseTest {

    private final hrmAdminPage page = new hrmAdminPage();

    private final List<String> stableKeys = Arrays.asList(
            "1. menuAdmin", "4. inputUsername", "5. dropdownUserRole",
            "8. inputEmployeeName", "9. btnReset", "10. btnSearch",
            "16. headerUserRole", "17. headerEmployeeName",
            "19. btnToggleSidebar", "21. btnAdd");

    @Test
    @DisplayName("BT1 - Đăng nhập, mở trang Admin và kiểm chứng locator")
    void locatorsShouldBeFound() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")))
                .sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(page.menuAdmin)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(page.inputUsername));

        driver.findElement(page.dropdownUserRole).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(page.optionRoleAdmin));

        StringBuilder report = new StringBuilder("\n==== KẾT QUẢ KIỂM CHỨNG LOCATOR (Bài Tập 1) ====\n");
        for (Map.Entry<String, By> e : page.getAllLocators().entrySet()) {
            List<WebElement> found = driver.findElements(e.getValue());
            report.append(String.format("[%s] %-24s -> %d element%n",
                    found.isEmpty() ? "FAIL" : " OK ", e.getKey(), found.size()));
            if (stableKeys.contains(e.getKey())) {
                assertFalse(found.isEmpty(), "Không tìm thấy element ổn định: " + e.getKey());
            }
        }
        System.out.println(report);
    }
}
