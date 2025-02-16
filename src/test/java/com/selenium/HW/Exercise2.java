package com.selenium.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.HW.HooksHW;

public class Exercise2 extends HooksHW{
	
	public static void main(String[] args) throws InterruptedException {
		
		// Scenario 2: Register a New User in Mercury Tours Page
		
		// 1. Set up the Environment - Launch Edge Browser
		setUp("edge");
		
		// 2. Navigate to the Below URL
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
		
		// 3. Click on Register Link
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		Thread.sleep(2000);
		
		// 4. Verify the Page is Mercury Tours
		String title = driver.getTitle();
		
		// Verify the page Title
		if (title.contains("Mercury Tours")) {
			System.out.println("Page Title: " + title + " is Correct");
			
		} else {
			System.out.println("Page Title: " +  title  + " Expected, but NOT FOUND");
		}
		
		Thread.sleep(1000);
		
		// 5. Enter First Name
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Sam");
		
		Thread.sleep(2000);
		
		// 6. Enter Last Name
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Assarrane");
				
		Thread.sleep(2000);
		
		
		// 7. Enter Phone Number
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("222-222-2222");
						
		Thread.sleep(2000);
		
		
		// 8. Enter Email Address
		WebElement emailAddress = driver.findElement(By.id("userName"));
		emailAddress.sendKeys("sam@gmail.com");
								
		Thread.sleep(2000);
		
		
		// 9. Enter Address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("1 Reserve ST");
										
		Thread.sleep(2000);
				
				
		// 10. Enter City
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Raleigh");
										
		Thread.sleep(2000);
		
		
		// 11. Enter State
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("North Carolina");
												
		Thread.sleep(2000);
				
				
		// 12 Enter Zip Code
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("27606");
												
		Thread.sleep(2000);
		
		
		// 13 Enter the Country
		WebElement country = driver.findElement(By.name("country"));
		
		// Create an Object of Select Class
		Select selectObj = new Select(country);
		
		//13.1 Select the Country from the DropDown Menu
		selectObj.selectByValue("UNITED STATES");
														
		Thread.sleep(2000);
		
		
		// 13.2 Enter the UserName
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("sam_batch13");
														
		Thread.sleep(2000);
		
		
		// 14. Enter Password
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("sam123");
														
		Thread.sleep(2000);
		
		
		// 15. Confirm PassWord
		WebElement confirmPassWord = driver.findElement(By.name("confirmPassword"));
		confirmPassWord.sendKeys("sam123");
		
		Thread.sleep(2000);
		
		
		// 16. Click Submit
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		Thread.sleep(3000);
		
		
		// 17. Text Confirmation Check
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		String textCheck = confirmationText.getText();
		
		// Check if the Confirmation Text Message Contains the "Thank you" phrase
		if (textCheck.contains("Thank you for registering.")) {
			
			System.out.println("TestCase Passed");
			
		} else {
			
			System.out.println("TestCase Failed");
		}
		
		Thread.sleep(3000);
		
		// 18. Close the Browser
		driver.close();
		
		// Tear Down The Environment
		tearDown();
	}
}
