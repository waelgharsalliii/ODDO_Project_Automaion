package com.exemple.oddoproject.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrierePage extends PageObject {

	public CarrierePage(WebDriver driver) {
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
    @FindBy(xpath = "//a[@id='Career-Link']//span[contains(text(),'Carrières')]")
    private WebElement carriereButton;
    
    @FindBy(xpath = "//a[@id='lnkanchor1065']")
    private WebElement category1Button;
    
    @FindBy(xpath = "//a[@id='lnkanchor1066']")
    private WebElement category2Button;
    
    @FindBy(xpath = "//a[@id='lnkanchor1067']")
    private WebElement category3Button;
    
    @FindBy(xpath = "//a[@id='lnkanchor1069']//span[contains(text(),'Le mot de la DRH')]")
    private WebElement category4Button;
    
    @FindBy(xpath = "//span[@class='text-20 font-bold font-libre-baskerville'][normalize-space()='Le mot de la DRH']")
    private WebElement category4Title;
    
    @FindBy(xpath = "//h2[normalize-space()='Nos collaborateurs témoignent']")
    private WebElement category2Title;
    
    public WebElement getCategory2Title() {
        return category2Title;
    }
    public void setCategory2Title(WebElement category2Title) {
        this.category2Title = category2Title;
    }
    @FindBy(xpath = "//a[@class='btn btn-secondary']")
    private WebElement offreButton;
    
    @FindBy(xpath = "//div[@class='container d-flex mb-80']//h2[1]")
    private WebElement offreText;
    
    @FindBy(xpath = "//div[@data-target='#felixRoyModal']//span[@class='icon-plus']")
    private WebElement collab1Button;
    
    @FindBy(xpath = "//div[@data-target='#dianeNeuvilleModal']//span[@class='icon-plus']")
    private WebElement collab2Button;
    @FindBy(xpath = "Félix ROY")
    private WebElement collab1Name;
    
    @FindBy(xpath = "Diane NEUVILLE")
    private WebElement collab2Name;
    
    @FindBy(xpath = "//div[contains(text(),'Graduate programs')]")
    private WebElement graduatePogramButton;
    
    @FindBy(xpath = "//h1[normalize-space()='Graduate Programs']")
    private WebElement graduatePogramTitle;
    
    @FindBy(xpath = "//div[@class='full-bloc mt-5 py-0 px-0']//div[2]//div[1]//a[1]//div[1]")
    private WebElement innovationButton;
    
    @FindBy(xpath = "//h1[contains(text(),'L’innovation au cœur de notre politique RH')]")
    private WebElement innovationTitle;
    
    
    @FindBy(xpath = "//div[contains(text(),'Développement des potentiels et mobilité')]")
    private WebElement developmentButton;
    
    @FindBy(xpath = "//h1[normalize-space()='Développement des potentiels et mobilité']")
    private WebElement developmentTitle;
    
    @FindBy(xpath = "//div[contains(text(),'Engagements')]")
    private WebElement engagementButton;
    
    @FindBy(xpath = "//h1[normalize-space()='Engagements']")
    private WebElement engagementTitle;
    public WebElement getCarriereButton() {
        return carriereButton;
    }
    public void setCarriereButton(WebElement carriereButton) {
        this.carriereButton = carriereButton;
    }
    public WebElement getCategory1Button() {
        return category1Button;
    }
    public void setCategory1Button(WebElement category1Button) {
        this.category1Button = category1Button;
    }
    public WebElement getCategory2Button() {
        return category2Button;
    }
    public void setCategory2Button(WebElement category2Button) {
        this.category2Button = category2Button;
    }
    public WebElement getCategory3Button() {
        return category3Button;
    }
    public void setCategory3Button(WebElement category3Button) {
        this.category3Button = category3Button;
    }
    public WebElement getCategory4Button() {
        return category4Button;
    }
    public void setCategory4Button(WebElement category4Button) {
        this.category4Button = category4Button;
    }
    public WebElement getCategory4Title() {
        return category4Title;
    }
    public void setCategory4Title(WebElement category4Title) {
        this.category4Title = category4Title;
    }
    public WebElement getOffreButton() {
        return offreButton;
    }
    public void setOffreButton(WebElement offreButton) {
        this.offreButton = offreButton;
    }
    public WebElement getOffreText() {
        return offreText;
    }
    public void setOffreText(WebElement offreText) {
        this.offreText = offreText;
    }
    public WebElement getCollab1Button() {
        return collab1Button;
    }
    public void setCollab1Button(WebElement collab1Button) {
        this.collab1Button = collab1Button;
    }
    public WebElement getCollab2Button() {
        return collab2Button;
    }
    public void setCollab2Button(WebElement collab2Button) {
        this.collab2Button = collab2Button;
    }
    public WebElement getCollab1Name() {
        return collab1Name;
    }
    public void setCollab1Name(WebElement collab1Name) {
        this.collab1Name = collab1Name;
    }
    public WebElement getCollab2Name() {
        return collab2Name;
    }
    public void setCollab2Name(WebElement collab2Name) {
        this.collab2Name = collab2Name;
    }
    public WebElement getGraduatePogramButton() {
        return graduatePogramButton;
    }
    public void setGraduatePogramButton(WebElement graduatePogramButton) {
        this.graduatePogramButton = graduatePogramButton;
    }
    public WebElement getGraduatePogramTitle() {
        return graduatePogramTitle;
    }
    public void setGraduatePogramTitle(WebElement graduatePogramTitle) {
        this.graduatePogramTitle = graduatePogramTitle;
    }
    public WebElement getInnovationButton() {
        return innovationButton;
    }
    public void setInnovationButton(WebElement innovationButton) {
        this.innovationButton = innovationButton;
    }
    public WebElement getInnovationTitle() {
        return innovationTitle;
    }
    public void setInnovationTitle(WebElement innovationTitle) {
        this.innovationTitle = innovationTitle;
    }
    public WebElement getDevelopmentButton() {
        return developmentButton;
    }
    public void setDevelopmentButton(WebElement developmentButton) {
        this.developmentButton = developmentButton;
    }
    public WebElement getDevelopmentTitle() {
        return developmentTitle;
    }
    public void setDevelopmentTitle(WebElement developmentTitle) {
        this.developmentTitle = developmentTitle;
    }
    public WebElement getEngagementButton() {
        return engagementButton;
    }
    public void setEngagementButton(WebElement engagementButton) {
        this.engagementButton = engagementButton;
    }
    public WebElement getEngagementTitle() {
        return engagementTitle;
    }
    public void setEngagementTitle(WebElement engagementTitle) {
        this.engagementTitle = engagementTitle;
    }

	
}
