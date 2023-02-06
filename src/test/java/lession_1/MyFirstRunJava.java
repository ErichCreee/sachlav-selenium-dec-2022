package lession_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstRunJava {
    public static void main(String[] args) throws InterruptedException {
        //Setup Chrome
        WebDriverManager.chromedriver().setup();

//        initialization of chromedriver
        WebDriver driver = new ChromeDriver();

//        Maximaze Window
        driver.manage().window().maximize();
//        Navigate to URL
        driver.get("https://www.google.com");
//        Current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//        Page Source
        System.out.println("driver.getPageSource() = " + driver.getPageSource());

//        Title
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.navigate().to("https://www.yandex.ru");

        Thread.sleep(1000);
        driver.quit();
    }
}
