package com.cybersoft.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class hrmAdminPage {

    By menuAdmin = By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Admin']"); // (1) Menu Admin

    By menuPIM = By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='PIM']"); // (2) Menu PIM

    By menuLeave = By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Leave']"); // (3) Menu Leave

    By inputUsername = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input"); // (4) Ô Username

    By dropdownUserRole = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text')]"); // (5) Dropdown User Role

    By optionRoleAdmin = By.xpath("//div[@role='option']//span[text()='Admin']"); // (6) Option Admin

    By optionRoleESS = By.xpath("//div[@role='option']//span[text()='ESS']"); // (7) Option ESS

    By inputEmployeeName = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input"); // (8) Ô Employee Name

    By btnReset = By.xpath("//button[normalize-space()='Reset']"); // (9) Nút Reset

    By btnSearch = By.xpath("//button[normalize-space()='Search']"); // (10) Nút Search

    By tabUserManagement = By.xpath("//nav[contains(@class,'oxd-topbar-body-nav')]//*[normalize-space()='User Management']"); // (11) Tab User Management

    By cellUsernameBala22 = By.xpath("//div[@role='cell'][normalize-space()='bala22']"); // (12) Ô Username bala22

    By cellUserRoleESS = By.xpath("//div[@role='cell'][normalize-space()='ESS']"); // (13) Ô User Role ESS

    By btnDeleteRow = By.xpath("(//button[.//i[contains(@class,'bi-trash')]])[2]"); // (14) Icon Delete

    By btnEditRow = By.xpath("(//button[.//i[contains(@class,'bi-pencil-fill')]])[2]"); // (15) Icon Edit

    By headerUserRole = By.xpath("//div[contains(@class,'oxd-table-header')]//div[normalize-space()='User Role']"); // (16) Tiêu đề cột User Role

    By headerEmployeeName = By.xpath("//div[contains(@class,'oxd-table-header')]//div[normalize-space()='Employee Name']"); // (17) Tiêu đề cột Employee Name

    By breadcrumbTitle = By.xpath("//header//*[contains(@class,'oxd-topbar-header-breadcrumb')]"); // (18) Breadcrumb Admin / User Management

    By btnToggleSidebar = By.xpath("//button[contains(@class,'oxd-main-menu-button')]"); // (19) Nút thu gọn sidebar

    By btnCollapseFilter = By.xpath("//div[contains(@class,'oxd-table-filter-header')]//button[contains(@class,'oxd-icon-button')]"); // (20) Nút thu gọn filter

    By btnAdd = By.xpath("//button[normalize-space()='Add']"); // (21) Nút Add

    public Map<String, By> getAllLocators() {
        Map<String, By> map = new LinkedHashMap<>();
        map.put("1. menuAdmin", menuAdmin);
        map.put("2. menuPIM", menuPIM);
        map.put("3. menuLeave", menuLeave);
        map.put("4. inputUsername", inputUsername);
        map.put("5. dropdownUserRole", dropdownUserRole);
        map.put("6. optionRoleAdmin", optionRoleAdmin);
        map.put("7. optionRoleESS", optionRoleESS);
        map.put("8. inputEmployeeName", inputEmployeeName);
        map.put("9. btnReset", btnReset);
        map.put("10. btnSearch", btnSearch);
        map.put("11. tabUserManagement", tabUserManagement);
        map.put("12. cellUsernameBala22", cellUsernameBala22);
        map.put("13. cellUserRoleESS", cellUserRoleESS);
        map.put("14. btnDeleteRow", btnDeleteRow);
        map.put("15. btnEditRow", btnEditRow);
        map.put("16. headerUserRole", headerUserRole);
        map.put("17. headerEmployeeName", headerEmployeeName);
        map.put("18. breadcrumbTitle", breadcrumbTitle);
        map.put("19. btnToggleSidebar", btnToggleSidebar);
        map.put("20. btnCollapseFilter", btnCollapseFilter);
        map.put("21. btnAdd", btnAdd);
        return map;
    }

    public WebElement findMenuAdmin(WebDriver driver) { return driver.findElement(menuAdmin); }
    public WebElement findInputUsername(WebDriver driver) { return driver.findElement(inputUsername); }
    public WebElement findBtnSearch(WebDriver driver) { return driver.findElement(btnSearch); }
    public WebElement findBtnAdd(WebDriver driver) { return driver.findElement(btnAdd); }
}
