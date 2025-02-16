package com.selenium.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.HW.HooksHW;

public class Exercise1 extends HooksHW {

	public static void main(String[] args) throws InterruptedException {

		// Scenario 1: Login to OrangeHRM Application
		
		// 1 . Set up the Environment - Launch Edge Browser
		setUp("firefox");

		// 2. Navigate to the below URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		// 3. Enter the UserName
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");

		Thread.sleep(2000);

		// 4. Enter the Password 
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		Thread.sleep(2000);

		// 5. Click Login Button
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();

		Thread.sleep(2000);
		
		// 6. Retrieve The Header Text
		WebElement headerText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
		//6.1 Print the Header
		System.out.println(headerText);

		Thread.sleep(2000);
		
		//7. Close the Browser
		driver.close();

		// Tear Down The Environment
		tearDown();

	}

}
