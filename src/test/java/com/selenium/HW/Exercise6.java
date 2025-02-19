package com.selenium.HW;

import java.net.http.WebSocket;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utils.HW.HooksHW;

public class Exercise6 extends HooksHW{
	
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Set up the environment
		setUp("firefox");
		
		// 2. Navigate to the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// 3. Verify the page title is: Alerts
		String pageTitle = driver.getTitle();
		
		// Verify the page Title
		System.out.println(pageTitle);
	
		// Sleep for 2 Seconds
		Thread.sleep(2000);
		
		// 4. Click Alert with TextBox
		WebElement alertTextBox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alertTextBox.click();
		
		Thread.sleep(1000);
		
		// 4.a Click the button to demonstrate the prompt box button
		WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickButton.click();
		Thread.sleep(2000);
		
		// 4.b Enter your Name in the Alert Text field
		Alert alert = driver.switchTo().alert();

		// Remove the Selected Text & Enter your Name
        alert.sendKeys("");
		alert.sendKeys("Sam A");
		
		Thread.sleep(2000);
		
		// 4.c Click Ok button
		alert.accept();
		
		// 4.d Verify the message displayed it should contain: How are you today
		WebElement verifyMessage = driver.findElement(By.xpath("//p[@id='demo1']"));
		String getMessage = verifyMessage.getText();
		
		if (getMessage.contains("How are you today")) {
			
			System.out.println("Yes - It Contains the Message!");
			
		} else {
			
			System.out.println("No, it doesn't!");
		}
		
		Thread.sleep(2000);
		
		// 5. Refresh the page
		driver.navigate().refresh();
		
		// 6. Click Alert with OK & Cancel
		WebElement alertOkCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertOkCancel.click();
		
		Thread.sleep(2000);
		
		// 6.a Click the button to display a confirm box
		WebElement displayConfirmBox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		displayConfirmBox.click();
		Thread.sleep(2000);
		
		// 6.c Verify the text in alert contains: Press a Button!
		Alert alert2 = driver.switchTo().alert();
		alert2.getText();
		
		// Verify Text Message
		if (alert2.getText().contains("Press a Button !")) {
			
			alert2.dismiss();
			
		} else {
			
			alert2.accept();
		}
		
		Thread.sleep(2000);
		
		// 6.d Verify the message displayed under the button to display a confirm box
		WebElement verifyMessageDisplayed = driver.findElement(By.xpath("//p[@id='demo']"));
		String getMessageDisplayed = verifyMessageDisplayed.getText();
		
		if (getMessageDisplayed.contains("You Pressed")) {
			
			System.out.println("Yes - It Contains the Message!");
			
		} else {
			
			System.out.println("No, it doesn't!");
		}
		
		Thread.sleep(1000);
		
		// Close the Browser
		driver.quit();
		
		// Tear down the environment
		tearDown();
	}

}
