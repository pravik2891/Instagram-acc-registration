package com.handson.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccount {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike\\eclipse-workspace\\Javatest\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		WebElement Signup = driver.findElement(By.xpath("//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']"));
		Signup.click();
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		email.sendKeys("kirthvi.fashions@gmail.com");
		
		WebElement name = driver.findElement(By.xpath("//input[@name='fullName']"));
		name.sendKeys("Pravin kumar Elumalai");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("pk002806");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Priya@12345");
		
		WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
		enter.click();
		
			
		WebElement list1 = driver.findElement(By.xpath("//select[@title='Month:']"));
		list1.click();
		Select months= new Select(list1);
		months.selectByVisibleText("June");
		
		WebElement list2 = driver.findElement(By.xpath("//select[@title='Day:']"));
		list2.click();
		Select days = new Select(list2);
		days.selectByVisibleText("28");
		
		WebElement list3 = driver.findElement(By.xpath("//select[@title='Year:']"));
		list3.click();
		Select year = new Select(list3);
		year.selectByVisibleText("1991");
		
		WebElement nextbutton = driver.findElement(By.xpath("//button[text()='Next']"));
		nextbutton.click();
		
		
		
		WebElement code = driver.findElement(By.xpath("//input[@autocomplete='false']"));
		code.sendKeys("629501");
		
		WebElement nxtbut = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy _4pI4F  y3zKF     ']"));
		nxtbut.click();
		
		
	}

}
