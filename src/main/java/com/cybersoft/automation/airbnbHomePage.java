package com.cybersoft.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class airbnbHomePage {

    By logo = By.cssSelector("nav img[alt='Cyber Logo']"); // (1) Logo

    By menuHome = By.xpath("//nav//a[normalize-space()='Home']"); // (2) Menu Home

    By menuAbout = By.xpath("//nav//a[normalize-space()='About']"); // (3) Menu About

    By iconUser = By.xpath("//nav//button[.//img[contains(@src,'6596121')]]"); // (4) Icon user

    By boxDiaDiem = By.xpath("//p[normalize-space()='Bạn sắp đi đâu?']/parent::div"); // (5) Ô Địa điểm

    By boxNgay = By.xpath("//p[contains(text(),'/') and string-length(normalize-space())>15]"); // (6) Ô chọn ngày

    By boxThemKhach = By.xpath("//p[normalize-space()='Thêm khách']/parent::div"); // (7) Khối Thêm khách

    By iconSearch = By.cssSelector("span[aria-label='search']"); // Icon tìm kiếm trong khối (7)

    By btnTangKhach = By.xpath("//button[.//div[normalize-space()='+']]"); // (8) Nút + tăng khách

    By btnGiamKhach = By.xpath("//button[.//div[normalize-space()='-']]"); // (9) Nút - giảm khách

    By cardHoChiMinh = By.cssSelector("a[href='/rooms/ho-chi-minh']"); // (10) Thẻ Hồ Chí Minh

    By cardCanTho = By.cssSelector("a[href='/rooms/da-lat']"); // (11) Thẻ Cần Thơ

    By btnLoaiNoiO = By.xpath("//button[normalize-space()='Loại nơi ở']"); // (12) Nút Loại nơi ở

    By btnGia = By.xpath("//button[normalize-space()='Giá']"); // (13) Nút Giá

    By cardNhaTrang = By.cssSelector("a[href='/rooms/nha-trang']"); // (14) Thẻ Nha Trang

    public Map<String, By> getAllLocators() {
        Map<String, By> map = new LinkedHashMap<>();
        map.put("1. logo", logo);
        map.put("2. menuHome", menuHome);
        map.put("3. menuAbout", menuAbout);
        map.put("4. iconUser", iconUser);
        map.put("5. boxDiaDiem", boxDiaDiem);
        map.put("6. boxNgay", boxNgay);
        map.put("7. boxThemKhach", boxThemKhach);
        map.put("8. btnTangKhach", btnTangKhach);
        map.put("9. btnGiamKhach", btnGiamKhach);
        map.put("10. cardHoChiMinh", cardHoChiMinh);
        map.put("11. cardCanTho", cardCanTho);
        map.put("12. btnLoaiNoiO", btnLoaiNoiO);
        map.put("13. btnGia", btnGia);
        map.put("14. cardNhaTrang", cardNhaTrang);
        return map;
    }

    public WebElement findLogo(WebDriver driver)        { return driver.findElement(logo); }
    public WebElement findMenuHome(WebDriver driver)    { return driver.findElement(menuHome); }
    public WebElement findMenuAbout(WebDriver driver)   { return driver.findElement(menuAbout); }
    public WebElement findIconUser(WebDriver driver)    { return driver.findElement(iconUser); }
    public WebElement findBoxDiaDiem(WebDriver driver)  { return driver.findElement(boxDiaDiem); }
    public WebElement findBoxNgay(WebDriver driver)     { return driver.findElement(boxNgay); }
    public WebElement findBoxThemKhach(WebDriver driver){ return driver.findElement(boxThemKhach); }
    public WebElement findBtnTangKhach(WebDriver driver){ return driver.findElement(btnTangKhach); }
    public WebElement findBtnGiamKhach(WebDriver driver){ return driver.findElement(btnGiamKhach); }
    public WebElement findCardHoChiMinh(WebDriver driver){ return driver.findElement(cardHoChiMinh); }
    public WebElement findCardCanTho(WebDriver driver)  { return driver.findElement(cardCanTho); }
    public WebElement findBtnLoaiNoiO(WebDriver driver) { return driver.findElement(btnLoaiNoiO); }
    public WebElement findBtnGia(WebDriver driver)      { return driver.findElement(btnGia); }
    public WebElement findCardNhaTrang(WebDriver driver){ return driver.findElement(cardNhaTrang); }
}
