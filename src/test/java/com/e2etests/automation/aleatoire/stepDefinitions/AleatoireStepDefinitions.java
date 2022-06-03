package com.e2etests.automation.aleatoire.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.e2etests.automation.aleatoire.pageObjects.AleatoirePage;
import com.e2etests.automation.utils.Assertions;
import com.e2etests.automation.utils.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AleatoireStepDefinitions {

	AleatoirePage aleatoirePage;
	CommonUtils commonUtils;
	Assertions assertions;

	public AleatoireStepDefinitions() {

		this.aleatoirePage = new AleatoirePage();
		this.commonUtils = new CommonUtils();
		this.assertions = new Assertions();
	}

	@Given("Je suis connecté à l'application")
	public String jeSuisConnectéÀLApplication() throws IOException {
		commonUtils.getUrl("home.url");
		return aleatoirePage.urlExtraction();
		// return commonUtils.getUrl("home.url");

	}

	@When("Je clique sur Aléatoire")
	public void jeCliqueSurAléatoire() {
		aleatoirePage.clickOnAléatoire();

	}

	@Then("Je me redirige vers Aléatoire")
	public void jeMeRedirigeVersLaAléatoire() throws IOException {

		String CurrentUrl = aleatoirePage.urlExtraction();
		String pageHomeUrl = jeSuisConnectéÀLApplication();

		System.out.println(pageHomeUrl);
		System.out.println(CurrentUrl);

		Assert.assertNotEquals(CurrentUrl, pageHomeUrl);
		System.out.println("la page a changé");
	}

	@Then("Je vérifie la présence des widgets")
	public void jeVérifieLaPrésenceDeWidgets() {

		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.widgetsFacebook));

		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.widgetsTwitter));

		Assert.assertTrue(assertions.isElementDisplayed(AleatoirePage.widgetsTumblr));
		System.out.println("Les widgets sont affichés");
	}

}
