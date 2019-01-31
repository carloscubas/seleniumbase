package br.cubas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 1/29/19 8:23 AM
 */
public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/s2it_csilva/Documents/Private/SeleniumProject/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com.br");
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("brasil");
        campoDeTexto.submit();
        driver.close();
    }
}
