package com.selenium.HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.HW.HooksHW;

public class DragDropExercise extends HooksHW {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Setup the environment
		setUp("edge");

		// Call the Method
		dragAction();

		// Tear down the environment
		tearDown();
	}

	public static void dragAction() throws InterruptedException {

		// Navigate to the URL
		driver.get("https://jqueryui.com/droppable/#photo-manager");

		// Switching to Frame (0)
		driver.switchTo().frame(0);

		// Using 1 FindElements
		List<WebElement> pictures = driver.findElements(By.xpath("//ul[@id='gallery']//li"));

		WebElement trash = driver.findElement(By.xpath("//*[@id='trash']"));

		// Creating a new Object
		Actions actionsObj = new Actions(driver);

		// For Loop | Logic to Move all the Pictures to the Trash.
		for (WebElement pic : pictures) {
			actionsObj.dragAndDrop(pic, trash).build().perform();
			Thread.sleep(500);
		}
	}

}
