package com.selenium.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.HW.HooksHW;

public class Exercise3 extends HooksHW{
	
	public static void main(String[] args) throws InterruptedException {
		
		// Scenario 3: Register a New User
		
		// 8. Set up the Environment - Launch Edge Browser
		setUp("edge");
		
		// 9. Navigate to the below URL
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(2000);
		
		// 10. Click on Register Link
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		
		Thread.sleep(2000);
		
		// 11. Verify the Page Title is nopCommerce demo store. Register
		String title = driver.getTitle();
		
		// Verify the page Title
		if (title.contains("nopCommerce demo store. Register")) {

			System.out.println("Page Title: " + title + " is Correct");

		} else {

			System.out.println("Page Title: " + title + " Expected, but NOT FOUND");
		}
		
		Thread.sleep(2000);
		
		
		// 12. a. Fill out Personal Details
		WebElement genderRadio = driver.findElement(By.id("gender-male"));
		
		// Click
		genderRadio.click();
		Thread.sleep(2000);
		
		// 12. b. FirstName
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Sam");
		
		Thread.sleep(2000);
		
		// 12. c. LastName
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Assarrane");
				
		Thread.sleep(2000);
		
		// 12. d. Email
		WebElement emailAddress = driver.findElement(By.id("Email"));
		emailAddress.sendKeys("sam@gmail.com");
								
		Thread.sleep(2000);
		
		// 13. Enter Company Name
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("XYZ");
								
		Thread.sleep(2000);
		
		// 14. Un-check NewsLetter CheckBox
		WebElement unCheckNewsLetter = driver.findElement(By.id("Newsletter"));
		
		unCheckNewsLetter.click();
		Thread.sleep(2000);
		
		
		// 15. Enter PassWord
		WebElement passWord = driver.findElement(By.id("Password"));
		passWord.sendKeys("sam123");
														
		Thread.sleep(2000);
		
		// 16. Confirm PassWord
		WebElement confirmPassWord = driver.findElement(By.id("ConfirmPassword"));
		confirmPassWord.sendKeys("sam123");
														
		Thread.sleep(2000);
		
		// 17. Register Button
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		
		Thread.sleep(3000);
		
		// 18. Text Confirmation Check
		WebElement confirmationText = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]"));
		String textCheck = confirmationText.getText();
		
		// Check if the Confirmation Text Message Contains the "Thank you" phrase
		if (textCheck.contains("Your registration completed!!!")) {
			
			System.out.println("TestCase Passed.");
			
		} else {
			
			System.out.println("TestCase Failed.");
		}
		
		driver.close();
		
		// Tear Down the Environment
		tearDown();
		
	}

}
