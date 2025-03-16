package com.exemple.oddoproject.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpertisePage extends PageObject{

	public ExpertisePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptButton;
	
	public WebElement getAcceptButton() {
		return acceptButton;
	}

	public void setAcceptButton(WebElement acceptButton) {
		this.acceptButton = acceptButton;
	}
	
	
	@FindBy(xpath = "//a[@id='expertise-menu']//span[contains(text(),'Expertises')]")
    private WebElement ExpertiseButton;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Banque Privée']")
    private WebElement BanquePrivéButton;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Family Office']")
    private WebElement FamilyOfficeButton;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Recherche et Intermédiation']")
    private WebElement recherche;
	
	@FindBy(xpath = "//h1[normalize-space()='Recherche et Intermédiation']")
    private WebElement rechercheTitle;
	
	public WebElement getRechercheTitle() {
		return rechercheTitle;
	}

	public void setRechercheTitle(WebElement rechercheTitle) {
		this.rechercheTitle = rechercheTitle;
	}

	public WebElement getRecherche() {
		return recherche;
	}

	public void setRecherche(WebElement recherche) {
		this.recherche = recherche;
	}
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Asset Management']")
    private WebElement assetManagementButton;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Private Assets']")
    private WebElement privateAssetButton;

	@FindBy(xpath = "//h1[normalize-space()='Banque privée']")
    private WebElement banquePriveTitle;
	
	@FindBy(xpath = "//p[@class='block-hero__top-title']")
    private WebElement FamilyOfficeTitle;
	
	@FindBy(xpath = "//h1[normalize-space()='Asset Management']")
    private WebElement assetManagementTitle;
	
	@FindBy(xpath = "//span[@class='hero-banner__major']")
    private WebElement privateAssetTitle;

	public WebElement getExpertiseButton() {
		return ExpertiseButton;
	}

	public void setExpertiseButton(WebElement expertiseButton) {
		ExpertiseButton = expertiseButton;
	}

	public WebElement getBanquePrivéButton() {
		return BanquePrivéButton;
	}

	public void setBanquePrivéButton(WebElement banquePrivéButton) {
		BanquePrivéButton = banquePrivéButton;
	}

	public WebElement getFamilyOfficeButton() {
		return FamilyOfficeButton;
	}

	public void setFamilyOfficeButton(WebElement familyOfficeButton) {
		FamilyOfficeButton = familyOfficeButton;
	}

	public WebElement getAssetManagementButton() {
		return assetManagementButton;
	}

	public void setAssetManagementButton(WebElement assetManagementButton) {
		this.assetManagementButton = assetManagementButton;
	}

	public WebElement getPrivateAssetButton() {
		return privateAssetButton;
	}

	public void setPrivateAssetButton(WebElement privateAssetButton) {
		this.privateAssetButton = privateAssetButton;
	}

	public WebElement getBanquePriveTitle() {
		return banquePriveTitle;
	}

	public void setBanquePriveTitle(WebElement banquePriveTitle) {
		this.banquePriveTitle = banquePriveTitle;
	}

	public WebElement getFamilyOfficeTitle() {
		return FamilyOfficeTitle;
	}

	public void setFamilyOfficeTitle(WebElement familyOfficeTitle) {
		FamilyOfficeTitle = familyOfficeTitle;
	}

	public WebElement getAssetManagementTitle() {
		return assetManagementTitle;
	}

	public void setAssetManagementTitle(WebElement assetManagementTitle) {
		this.assetManagementTitle = assetManagementTitle;
	}

	public WebElement getPrivateAssetTitle() {
		return privateAssetTitle;
	}

	public void setPrivateAssetTitle(WebElement privateAssetTitle) {
		this.privateAssetTitle = privateAssetTitle;
	}
	
	
	
	
	
	
	

}
