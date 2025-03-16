package com.exemple.oddoproject.bdd;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.exemple.oddoproject.po.CarrierePage;
import com.exemple.oddoproject.po.ExpertisePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionExpertise {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	ExpertisePage expertisePage;
	
	@Given("I am on Expertises")
	public void i_am_on_expertises() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		expertisePage=new ExpertisePage(driver);
		 driver.get("https://www.oddo-bhf.com/fr");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		js = (JavascriptExecutor) driver;
		expertisePage.getAcceptButton().click();
		expertisePage.getExpertiseButton().click();
		
	}
	

	@When("I click on Banque privé")
	public void i_click_on_banque_privé() {
	   expertisePage.getBanquePrivéButton().click();
	}

	@Then("title Banque privée is displayed")
	public void title_banque_privée_is_displayed() {
	   expertisePage.getBanquePriveTitle().getText();
	}


	@When("I click on Private Assets")
	public void i_click_on_private_assets() {
		 expertisePage.getPrivateAssetButton().click();
		 expertisePage.getAcceptButton().click();
	}

	@Then("title PRIVATE ASSESTS is displayed")
	public void title_private_assests_is_displayed() {
		expertisePage.getPrivateAssetTitle().getText();
	}


	@When("I click on Recherche et Intermédiation")
	public void i_click_on_recherche_et_intermédiation() {
		expertisePage.getRecherche().click();
	}
	
	@Then("title Recherche et Intermédiation is displayed")
	public void title_recherche_et_intermédiation_is_displayed() {
		expertisePage.getRechercheTitle().getText();
	}

	

	
}
