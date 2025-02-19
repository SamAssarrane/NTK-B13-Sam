package com.selenium.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.HW.HooksHW;

public class Exercise7 extends HooksHW{
	
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Set up the Environment
		setUp("edge");
		
		// 2. Navigate to the URL
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// 3. Click on: org.openqa.selenium
		WebElement clickOnSelenium = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']"));
		clickOnSelenium.click();
		Thread.sleep(2000);
		
		// 4. Click on: Alert
		WebElement clickOnAlert = driver.findElement(By.xpath("//a[@href='Alert.html']"));
		clickOnAlert.click();
		Thread.sleep(2000);
		
		// 5. Retrieve Text Message 
		WebElement textMessage = driver.findElement(By.xpath("//h1[@class='title']"));
		String verifyMessage = textMessage.getText();
		
		
		if (verifyMessage.equals("Interface Alert")) {
			System.out.println("TESTCASE PASSSED");
		
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		Thread.sleep(2000);
		
		// 6. Locate & Click on: org.openqa.selenium.chrome
		driver.switchTo().defaultContent();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement clickOnSeleniumChrome = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-summary.html']"));
		clickOnSeleniumChrome.click();
		Thread.sleep(2000);
		
		// 7. Click on ChromeDriver
		WebElement clickOnChrome = driver.findElement(By.xpath("//a[text()='ChromeDriver']"));
		clickOnChrome.click();
		Thread.sleep(2000);
		
		// 8. Retrieve Text Message: "Class ChromeDriver"
		WebElement chromeTextMessage = driver.findElement(By.xpath("//h1[@title='Class ChromeDriver']"));
		String Message = chromeTextMessage.getText();
		
		
		if (Message.equals("Class ChromeDriver")) {
			System.out.println("TESTCASE PASSSED");
		
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		Thread.sleep(2000);
		
		// 9. Close the Browser
		driver.close();
		
		// Tear down the environment
		tearDown();
	}

}
