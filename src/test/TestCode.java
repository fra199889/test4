package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logic.Code;

public class TestCode {
	@Test
	public void testFunc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.unitconverters.net/");     
		
		driver.findElement(By.xpath("//*[@id=\"calFrom\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"calTo\"]/option[1]")).click();      
		driver.findElement(By.xpath("//*[@id=\"qcvt\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("1");
		WebElement TxtBoxContent=driver.findElement(By.xpath("//*[@id=\"qcvt\"]/table/tbody/tr[2]/td[2]/input"));    
        String val=TxtBoxContent.getAttribute("value");
        driver.close();
		assertEquals("1000",val);
	}
	
	@Test
    public void testTemperture() {
    	System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.unitconverters.net/");     
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"calTo\"]/option[3]")).click();    
		driver.findElement(By.xpath("//*[@id=\"qcvt\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("30");
		WebElement TxtBoxContent=driver.findElement(By.xpath("//*[@id=\"qcvt\"]/table/tbody/tr[2]/td[2]/input"));    
        String val=TxtBoxContent.getAttribute("value");
        driver.close();
		assertEquals("86",val);
    }
}
