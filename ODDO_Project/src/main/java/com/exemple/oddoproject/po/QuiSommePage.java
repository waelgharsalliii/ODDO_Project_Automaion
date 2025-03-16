package com.exemple.oddoproject.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuiSommePage extends PageObject {

	public QuiSommePage(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[@id='group-menu']//span[contains(text(),'Qui sommes-nous')]")
	private WebElement quiSommeButton;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='A propos']")
	private WebElement aPropos;
	
	@FindBy(xpath = "//ul[contains(@class,'pt-4')]//a[contains(@class,'active')]")
	private WebElement Identité ;
	
	@FindBy(xpath = "//span[normalize-space()='Histoire']")
	private WebElement Histoire ;
	
	@FindBy(xpath = "//span[normalize-space()='Gouvernance']")
	private WebElement Gouvernance ;
	
	@FindBy(xpath = "	//button[@class='Button_module_button__779846a6 shared_module_focusable__fd03e359 Button_module_icon__779846a6 exclude-global-button-styles Tooltip_module_tooltipContainer__d9b61844 PlayButton_module_playButton__d1afd73a shared_module_focusable__fd03e359']//*[name()='svg']\r\n"
			+ "")
	private WebElement playVideoButton;

	@FindBy(xpath = "//span[normalize-space()='Limiter notre impact environnemental']")
	private WebElement Limiternotreimpactenvironnemental1 ;
	
	@FindBy(xpath = "//h3[contains(text(),'S’engager pour nos collaborateurs')]")
	private WebElement sengagerpournocollaborateurs ;
	
	@FindBy(xpath = "//span[normalize-space()='Agir pour une société solidaire']")
	private WebElement Agirpourunesociétésolidaire ;
		
	@FindBy(xpath = "//h1[normalize-space()='ODDO BHF Forum']")
	private WebElement ODDOBHFForum ;
	
	@FindBy(xpath = "//h2[normalize-space()='ODDO BHF, make every day an opportunity']")
	private WebElement identitéTitle;
	
	@FindBy(xpath = "//h2[normalize-space()='Histoire']")
	private WebElement histoirtitle;
	
	
	@FindBy(xpath = "//div[@class='panel-article p-40']")
	private WebElement slider;
	
	@FindBy(xpath = "//span[@class='my-2'][normalize-space()='Engagements']")
	private WebElement engagementsButton ; 
	
	
	@FindBy(xpath = "//span[normalize-space()='Limiter notre impact environnemental']")
	private WebElement LimiterNotreImpactEnvironnemental ;


	@FindBy(xpath = "//h3[contains(text(),'S’engager pour nos collaborateurs')]")
	private WebElement SengagerPourNoCollaborateurs ;
	
	@FindBy(xpath = "//span[normalize-space()='Agir pour une société solidaire']")
	private WebElement AgirPourUneSociétéSolidaire ;
	
	@FindBy(xpath = "//h2[normalize-space()='Agir pour une société solidaire']")
	private WebElement AgirPourUneSociétéSolidaireTitle ;
	

	@FindBy(xpath = "//span[contains(text(),'Rapport RSE')]")
	private WebElement rapportButton;

	public WebElement getHistoirtitle() {
		return histoirtitle;
	}

	public void setHistoirtitle(WebElement histoirtitle) {
		this.histoirtitle = histoirtitle;
	}

	public WebElement getRapportButton() {
		return rapportButton;
	}

	public void setRapportButton(WebElement rapportButton) {
		this.rapportButton = rapportButton;
	}

	public WebElement getPolitiquedeRémunération() {
		return PolitiquedeRémunération;
	}

	public void setPolitiquedeRémunération(WebElement politiquedeRémunération) {
		PolitiquedeRémunération = politiquedeRémunération;
	}

	public WebElement getIndexégalitéprofessionnelle() {
		return Indexégalitéprofessionnelle;
	}

	public void setIndexégalitéprofessionnelle(WebElement indexégalitéprofessionnelle) {
		Indexégalitéprofessionnelle = indexégalitéprofessionnelle;
	}
	@FindBy(xpath = "//span[contains(text(),'Politique de Rémunération')]")
	private WebElement PolitiquedeRémunération ;
	
	@FindBy(xpath = "//span[contains(text(),'Index égalité professionnelle')]")
	private WebElement Indexégalitéprofessionnelle ;
	
	public WebElement getAgirPourUneSociétéSolidaireTitle() {
		return AgirPourUneSociétéSolidaireTitle;
	}

	public void setAgirPourUneSociétéSolidaireTitle(WebElement agirPourUneSociétéSolidaireTitle) {
		AgirPourUneSociétéSolidaireTitle = agirPourUneSociétéSolidaireTitle;
	}
	@FindBy(xpath = "//div[@class='panel-article p-40']")
	private WebElement sliderSengaer;
	
	@FindBy(xpath = "//h2[normalize-space()='Limiter notre impact environnemental']")
	private WebElement LimiterNotreImpactEnvironnementalTitle;
	
	
	public WebElement getSliderSengaer() {
		return sliderSengaer;
	}

	public void setSliderSengaer(WebElement sliderSengaer) {
		this.sliderSengaer = sliderSengaer;
	}

	public WebElement getLimiterNotreImpactEnvironnementalTitle() {
		return LimiterNotreImpactEnvironnementalTitle;
	}

	public void setLimiterNotreImpactEnvironnementalTitle(WebElement limiterNotreImpactEnvironnementalTitle) {
		LimiterNotreImpactEnvironnementalTitle = limiterNotreImpactEnvironnementalTitle;
	}

	public WebElement getLimiterNotreImpactEnvironnemental() {
		return LimiterNotreImpactEnvironnemental;
	}
	

	public void setLimiterNotreImpactEnvironnemental(WebElement limiterNotreImpactEnvironnemental) {
		LimiterNotreImpactEnvironnemental = limiterNotreImpactEnvironnemental;
	}

	public WebElement getSengagerPourNoCollaborateurs() {
		return SengagerPourNoCollaborateurs;
	}

	public void setSengagerPourNoCollaborateurs(WebElement sengagerPourNoCollaborateurs) {
		SengagerPourNoCollaborateurs = sengagerPourNoCollaborateurs;
	}

	public WebElement getAgirPourUneSociétéSolidaire() {
		return AgirPourUneSociétéSolidaire;
	}

	public void setAgirPourUneSociétéSolidaire(WebElement agirPourUneSociétéSolidaire) {
		AgirPourUneSociétéSolidaire = agirPourUneSociétéSolidaire;
	}

	public WebElement getPlayVideoButton() {
		return playVideoButton;
	}

	public void setPlayVideoButton(WebElement playVideoButton) {
		this.playVideoButton = playVideoButton;
	}

	public WebElement getaPropos() {
		return aPropos;
	}

	public void setaPropos(WebElement aPropos) {
		this.aPropos = aPropos;
	}
	
	
	public WebElement getQuiSommeButton() {
		return quiSommeButton;
	}

	public void setQuiSommeButton(WebElement quiSommeButton) {
		this.quiSommeButton = quiSommeButton;
	}
	
	
	public WebElement getEngagementsButton() {
		return engagementsButton;
	}

	public void setEngagementsButton(WebElement engagementsButton) {
		this.engagementsButton = engagementsButton;
	}

	public WebElement getSlider() {
		return slider;
	}

	public void setSlider(WebElement slider) {
		this.slider = slider;
	}

	public WebElement getHistoirtitel() {
		return histoirtitle;
	}

	public void setHistoirtitel(WebElement histoirtitel) {
		this.histoirtitle = histoirtitel;
	}

	public WebElement getIdentitéTitle() {
		return identitéTitle;
	}

	public void setIdentitéTitle(WebElement identitéTitle) {
		this.identitéTitle = identitéTitle;
	}

	public WebElement getIdentité() {
		return Identité;
	}

	public void setIdentité(WebElement identité) {
		Identité = identité;
	}

	public WebElement getHistoire() {
		return Histoire;
	}

	public void setHistoire(WebElement histoire) {
		Histoire = histoire;
	}

	public WebElement getGouvernance() {
		return Gouvernance;
	}

	public void setGouvernance(WebElement gouvernance) {
		Gouvernance = gouvernance;
	}

	public WebElement getLimiternotreimpactenvironnemental1() {
		return Limiternotreimpactenvironnemental1;
	}

	public void setLimiternotreimpactenvironnemental1(WebElement limiternotreimpactenvironnemental1) {
		Limiternotreimpactenvironnemental1 = limiternotreimpactenvironnemental1;
	}

	public WebElement getSengagerpournocollaborateurs() {
		return sengagerpournocollaborateurs;
	}

	public void setSengagerpournocollaborateurs(WebElement sengagerpournocollaborateurs) {
		this.sengagerpournocollaborateurs = sengagerpournocollaborateurs;
	}

	public WebElement getAgirpourunesociétésolidaire() {
		return Agirpourunesociétésolidaire;
	}

	public void setAgirpourunesociétésolidaire(WebElement agirpourunesociétésolidaire) {
		Agirpourunesociétésolidaire = agirpourunesociétésolidaire;
	}

	public WebElement getODDOBHFForum() {
		return ODDOBHFForum;
	}

	public void setODDOBHFForum(WebElement oDDOBHFForum) {
		ODDOBHFForum = oDDOBHFForum;
	}

}
