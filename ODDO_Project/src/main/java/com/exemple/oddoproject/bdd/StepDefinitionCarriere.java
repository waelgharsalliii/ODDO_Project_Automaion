package com.exemple.oddoproject.bdd;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.exemple.oddoproject.po.CarrierePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class StepDefinitionCarriere {
	private WebDriver driver;
	JavascriptExecutor js;
	CarrierePage carrierePage;
	private WebDriverWait wait; 
	
	
	@Given("I am on carrieres page")
	public void i_am_on_carrieres_page() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		 carrierePage=new CarrierePage(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 driver.get("https://www.oddo-bhf.com/fr/pd/1060/career");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		carrierePage.getAcceptButton().click();
	}

	
	
	@When("I click on les talents au coeur de notre stratégie")
	public void i_click_on_les_talents_au_coeur_de_notre_stratégie() {
		carrierePage.getCategory1Button().click();
	}

	@When("I click on Toutes nos offres")
	public void i_click_on_toutes_nos_offres() {
		carrierePage.getOffreButton().click();
	}

	@Then("Formulaire  Nos offres demploie is displayed")
	public void formulaire_nos_offres_demploie_is_displayed() {
		carrierePage.getOffreText().getText();
		carrierePage.back();
	}
	
	@When("I click on nos collaborateurs témoignent")
	public void i_click_on_nos_collaborateurs_témoignent() {
		carrierePage.getCategory2Button().click(); 
	}

	@Then("title nos collaborateurs témoignent is displayed")
	public void title_nos_collaborateurs_témoignent_is_displayed() {
		carrierePage.getCategory2Title().getText(); 
	}
	@When("I click on Une politique de développement RH engagé")
	public void i_click_on_une_politique_de_développement_rh_engagé() {
		carrierePage.getCategory3Button().click();
	}

	@When("I click on Graduate Programs")
	public void i_click_on_graduate_programs() {
		 carrierePage.getGraduatePogramButton().click();
	}

	@Then("title Graduate Programs is displayed")
	public void title_graduate_programs_is_displayed() {
		carrierePage.getGraduatePogramTitle().getText();
		carrierePage.back();
	}

	@When("I click on L’innovation au cœur de notre politique RH")
	public void i_click_on_l_innovation_au_cœur_de_notre_politique_rh() {
		carrierePage.getInnovationButton().click();
	}

	@Then("title L’innovation au cœur de notre politique RH is displayed")
	public void title_l_innovation_au_cœur_de_notre_politique_rh_is_displayed() {
		carrierePage.getInnovationTitle().getText();
		carrierePage.back();
	}
	
	@When("I click on Développement des potentiels et mobilité")
	public void i_click_on_développement_des_potentiels_et_mobilité() {
		carrierePage.perform(carrierePage.getDevelopmentButton());
		//carrierePage.getDevelopmentButton().click();
		
	}

	@Then("title Développement des potentiels et mobilité is displayed")
	public void title_développement_des_potentiels_et_mobilité_is_displayed() {
		carrierePage.getDevelopmentTitle().getText();
	    carrierePage.back();
	}

	@When("I click on Engagements")
	public void i_click_on_engagements() {
		carrierePage.perform(carrierePage.getEngagementButton());
		  //carrierePage.getEngagementButton().click();
	}

	@Then("title Engagements is displayed")
	public void title_engagements_is_displayed() {
		 carrierePage.getEngagementTitle().getText();
		 carrierePage.back();
	}
	
	@When("I click on le mot de la DRH")
	public void i_click_on_le_mot_de_la_drh() {
	   carrierePage.getCategory4Button().click();
	}

	@Then("I am on the text le mot de la DRH")
	public void i_am_on_the_text_le_mot_de_la_drh() {
	   carrierePage.getCategory4Title().getText();
	}

	
	

	
}