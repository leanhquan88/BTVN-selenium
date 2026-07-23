package com.cybersoft.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class amazonSearchResultPage {

    By productBestSeller = By.xpath("(//div[@data-component-type='s-search-result'])[3]"); // (1) Card sản phẩm Best Seller

    By listPrice60 = By.xpath("//span[@class='a-price a-text-price']//span[text()='$60.00']"); // (2) Giá gốc List $60.00

    By price72 = By.xpath("//span[@class='a-offscreen'][text()='$72.00']"); // (3) Giá $72.00

    By searchBox = By.id("twotabsearchtextbox"); // (4) Ô tìm kiếm

    By cart = By.id("nav-cart"); // (5) Giỏ hàng Cart

    By categoryWomensFootwear = By.xpath("//*[normalize-space(text())=\"Women's Footwear\"]"); // (6) Danh mục Women's Footwear

    By shoeSize6 = By.xpath("//li[contains(@class,'a-spacing-micro')]//span[normalize-space(text())='6']"); // (7) Size giày 6

    By productTitleGymnastics = By.xpath("//span[contains(text(),\"Women's Gymnastics Shoes Sneaker\")]"); // (8) Tên sản phẩm Women's Gymnastics Shoes Sneaker

    By deliveryMonDec9 = By.xpath("//span[contains(text(),'Delivery') and contains(.,'Dec 9')]"); // (9) Dòng Delivery Mon, Dec 9

    By brandAdidasFirstProduct = By.xpath("(//div[@data-component-type='s-search-result']//span[text()='adidas'])[1]"); // (10) Thương hiệu adidas (sản phẩm 1)

    By headingTopCollections = By.xpath("//*[contains(text(),'Shop top adidas collections')]"); // (11) Tiêu đề Shop top adidas collections

    By filterGenderMen = By.xpath("//span[text()='Men']"); // (12) Checkbox Men

    By resultsCount = By.xpath("//span[contains(text(),'results for')]"); // (13) Dòng số kết quả

    By collectionBagsBackpacks = By.xpath("//*[normalize-space(text())='Bags & Backpacks']"); // (14) Bộ sưu tập Bags & Backpacks

    public Map<String, By> getAllLocators() {
        Map<String, By> map = new LinkedHashMap<>();
        map.put("1. productBestSeller", productBestSeller);
        map.put("2. listPrice60", listPrice60);
        map.put("3. price72", price72);
        map.put("4. searchBox", searchBox);
        map.put("5. cart", cart);
        map.put("6. categoryWomensFootwear", categoryWomensFootwear);
        map.put("7. shoeSize6", shoeSize6);
        map.put("8. productTitleGymnastics", productTitleGymnastics);
        map.put("9. deliveryMonDec9", deliveryMonDec9);
        map.put("10. brandAdidasFirstProduct", brandAdidasFirstProduct);
        map.put("11. headingTopCollections", headingTopCollections);
        map.put("12. filterGenderMen", filterGenderMen);
        map.put("13. resultsCount", resultsCount);
        map.put("14. collectionBagsBackpacks", collectionBagsBackpacks);
        return map;
    }

    public WebElement findSearchBox(WebDriver driver) { return driver.findElement(searchBox); }
    public WebElement findCart(WebDriver driver) { return driver.findElement(cart); }
    public WebElement findResultsCount(WebDriver driver) { return driver.findElement(resultsCount); }
}
