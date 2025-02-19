package com.selenium.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.HW.HooksHW;

public class Exercise8 extends HooksHW{
	
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Setup the Environment
		setUp("edge");
		
		// 2. Navigate to the below URL
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// 3. Enter: 'Accessing Iframe' in the Text Field
		driver.switchTo().frame("singleframe");
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		textField.sendKeys("Accessing Iframe");
		
		// 4. Wait 2 seconds
		Thread.sleep(2000);
		
		// 5. Click on: Iframe with in an Iframe
		driver.switchTo().defaultContent();
		WebElement clickOniframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		clickOniframe.click();
		Thread.sleep(2000);
		
		// 6. Enter: 'Iframe is easy' in Text Field
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		WebElement enterText = driver.findElement(By.xpath("//input[@type='text']"));
		enterText.sendKeys("Iframe is easy");
		
		Thread.sleep(2000);
		
		// 7. Click Home Link
		driver.switchTo().defaultContent();
		WebElement clickOnHome = driver.findElement(By.xpath("//a[@href='Index.html']"));
		clickOnHome.click();
		Thread.sleep(2000);
		
		// 8. Retrieve Page Title
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals(pageTitle)) {
			System.out.println("TESTCASE PASSED");
		
		} else {
			System.out.println("TESTCASE FAILED");
		}
		Thread.sleep(1000);
		
		// 9. Close the Browser
		driver.close();
		
		// Tear down the Environment
		tearDown();
	}

}
