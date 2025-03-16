package com.exemple.oddoproject.bdd;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.exemple.oddoproject.po.ExpertisePage;
import com.exemple.oddoproject.po.QuiSommePage;

import io.cucumber.java.en.Given;

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
public class StepDefinitionQuiSommeNous {

	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	QuiSommePage quiSommePage;
	private WebDriverWait wait; 
	
	

	@Given("I am in page ODDO-Qui sommes-nous-A propos")
	public void i_am_in_page_oddo_qui_sommes_nous_a_propos() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		quiSommePage=new QuiSommePage(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 driver.get("https://www.oddo-bhf.com/fr");
		 quiSommePage.getAcceptButton().click()	;
		 quiSommePage.getQuiSommeButton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		
	}
	
	

	@When("I click on identité")
	public void i_click_on_identité() {
		quiSommePage.getaPropos().click();
	    //quiSommePage.getIdentité().click();
	}

	@Then("Title ODDO BHF, make every day an opportunity is displayed")
	public void title_oddo_bhf_make_every_day_an_opportunity_is_displayed() {
	   quiSommePage.getIdentitéTitle().getText();
	}
	
	/*@When("I click on play vidéo")
	public void i_click_on_play_vidéo() {
		
		quiSommePage.perform(quiSommePage.getPlayVideoButton());
	}

	@Then("Vidéo played")
	public void vidéo_played() {
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    boolean isPlaying = (Boolean) js.executeScript("return document.querySelector('video').paused === false;");

	    Assert.assertTrue("The video did not start playing", isPlaying);
	}*/

	@When("I click on Histoir")
	public void i_click_on_histoir() {
		quiSommePage.getaPropos().click();
	    quiSommePage.getHistoire().click();
	}

	@Then("title Histoire is displayed")
	public void title_histoire_is_displayed() {
	   quiSommePage.getHistoirtitel().getText();
	}

	

	@When("I click on a Gouvernance")
	public void i_click_on_a_gouvernance() {
		quiSommePage.getaPropos().click();
		quiSommePage.getGouvernance().click();
	}

	@Then("A slider is displayed")
	public void a_slider_is_displayed() {
		try {
			quiSommePage.getSlider().isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

	

	@When("I click on Sengager pour nos collaborateurs")
	public void i_click_on_s_engager_pour_nos_collaborateurs() {
		quiSommePage.getEngagementsButton().click();
	  quiSommePage.getSengagerPourNoCollaborateurs().getText();
	}

	@Then("A title Sengager pour nos collaborateurs and sliders displayed")
	public void a_title_s_engager_pour_nos_collaborateurs_and_sliders_displayed() {
		try {
			quiSommePage.getSlider().isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@When("I click on Limiter notre impact environnemental")
	public void i_click_on_limiter_notre_impact_environnemental() {
		quiSommePage.getEngagementsButton().click();
		quiSommePage.getLimiterNotreImpactEnvironnemental().click();
	}

	@Then("A title Limiter notre impact environnemental is displayed")
	public void a_title_limiter_notre_impact_environnemental_is_displayed() {
		quiSommePage.getLimiterNotreImpactEnvironnementalTitle().getText();
		
	}

	@When("I click on Agir pour une société solidaire")
	public void i_click_on_agir_pour_une_société_solidaire() {
		quiSommePage.getEngagementsButton().click();
		quiSommePage.getAgirPourUneSociétéSolidaire().click();
	}

	@Then("A title Agir pour une société solidaire displayed")
	public void a_title_agir_pour_une_société_solidaire_displayed() {
		quiSommePage.getAgirPourUneSociétéSolidaireTitle().getText();
	
	}


	@When("I click on Rapport RSE")
	public void i_click_on_rapport_rse() {
		quiSommePage.getEngagementsButton().click();
		quiSommePage.perform(quiSommePage.getRapportButton());
	}

	@Then("A file pdf Rapport RSE  displayed")
	public void a_file_pdf_rapport_rse_displayed() {
		quiSommePage.switchToWindow();
	}
	

	

	
}
