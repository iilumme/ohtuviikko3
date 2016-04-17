package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.Random;
import java.util.UUID;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );

        element = driver.findElement(By.linkText("logout"));
        element.click();
        System.out.println("==");
        System.out.println( driver.getPageSource() );


        //

        element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkeptti");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println( driver.getPageSource() );

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekkatti");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkeptti");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println( driver.getPageSource());

        element = driver.findElement(By.linkText("back to home"));
        element.click();

        System.out.println("==");
        System.out.println( driver.getPageSource());

        element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println("==");
        System.out.println( driver.getPageSource());

        Random random = new Random();

        element = driver.findElement(By.name("username"));
        element.sendKeys("iinal" + random.nextInt(999));
        element = driver.findElement(By.name("password"));
        String pw = UUID.randomUUID().toString();
        element.sendKeys(pw);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(pw);
        element = driver.findElement(By.name("add"));
        element.submit();

        System.out.println("==");
        System.out.println( driver.getPageSource());

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();

        System.out.println("==");
        System.out.println( driver.getPageSource());

        element = driver.findElement(By.linkText("logout"));
        element.click();

        System.out.println("==");
        System.out.println( driver.getPageSource());
    }
}
