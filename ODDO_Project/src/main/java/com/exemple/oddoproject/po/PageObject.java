package com.exemple.oddoproject.po;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class PageObject {

		protected WebDriver driver;
		   public Logger log;
		   protected WebDriverWait wait;
		  
		   Actions action;
		    public PageObject(WebDriver driver){
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		        log = Logger.getLogger(Log.class.getName());
			    log.setLevel(Level.INFO);
			   wait=new WebDriverWait(driver, Duration.ofSeconds(20) );
		        action=new Actions(driver);
		  
		    }
		    
		    public void back() {
		    	driver.navigate().back();
		    }
		    
		    public void switchToWindow()
			 {
				 String currentWindow= driver.getWindowHandle();
				
				log.info("currentWindow : " + currentWindow);
				
				 String window=null;
				
				 Set<String> windows=driver.getWindowHandles();
				
				 for (String string : windows) {
					
					 System.out.println("Window : " + string);
					
				  }
				
				Iterator<String> iterator = windows.iterator();
				
				while(iterator.hasNext())
				{
				    window=iterator.next();
				    
					if(!currentWindow.equals(window)) break;
					 
				}
				
				driver.switchTo().window(window);
				
				log.info("window: " + window.equals(window));
				
				log.info("currentWindow == window: " + window.equals(currentWindow));
				 		
			 }
		    
		    public void perform(WebElement element)
			 {
		    	WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));

		        // Scroll into view
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickableElement);
				 //Focus
				 action.moveToElement(element).click().perform();
			 }
		    
		    
		    public Select getSelect(WebElement element) {
		    	return new Select(element);
		    }
		    
		    public void takeScreenShot(String fileName, WebElement element)
			 {
				   TakesScreenshot screenshot = (TakesScreenshot) element;
		            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		            fileName = fileName+ "_" + timeStamp + ".jpg";
		            
		            File destinationFile = new File(fileName);
		           
		            System.out.println("Capture d'écran enregistrée : " + destinationFile.getAbsolutePath());
		            // Copier le fichier source vers la destination
		            try {
						FileUtils.copyFile(sourceFile, destinationFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
		    public void takeScreenShot(String fileName)
			 {
				   TakesScreenshot screenshot = (TakesScreenshot) driver;
		            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		            
		            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		       	 fileName = fileName+ "_" + timeStamp + ".jpg";
		            
		            
		            File destinationFile = new File(fileName);
		           
		            System.out.println("Capture d'écran enregistrée : " + destinationFile.getAbsolutePath());
		            // Copier le fichier source vers la destination
		            try {
						FileUtils.copyFile(sourceFile, destinationFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }


		        public void takeScreenShot(String folderPath, String fileName, WebElement element) {
		            // Create the folder if it doesn't exist
		            File folder = new File(folderPath);
		            if (!folder.exists()) {
		                folder.mkdirs(); // Create all necessary parent directories
		            }

		            // Take the screenshot
		            TakesScreenshot screenshot = (TakesScreenshot) element;
		            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

		            // Generate a timestamp for the file name
		            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		            fileName = fileName + "_" + timeStamp + ".jpg";

		            // Define the destination file path
		            File destinationFile = new File(folder, fileName);

		            // Copy the screenshot to the destination file
		            try {
		                FileUtils.copyFile(sourceFile, destinationFile);
		                System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
		            } catch (IOException e) {
		                System.err.println("Failed to save screenshot: " + e.getMessage());
		                e.printStackTrace();
		            }
		        }
		        //
		    }
		    





