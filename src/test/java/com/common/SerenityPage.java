package com.common;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

public class SerenityPage extends PageObject {
	protected static final Logger LOG = LoggerFactory.getLogger(SerenityPage.class);

	protected void waitForMill (long mill) {
		try {
			Thread.sleep(mill);
		} catch (InterruptedException e) {
			LOG.error("", e);
			Thread.currentThread().interrupt();
		}
	}

	protected void waitForElementToVanish (WebElement element, int second) {
		this.element(element).withTimeoutOf(second, TimeUnit.SECONDS).waitUntilNotVisible();
	}
	protected void waitForPresenseOfElement(WebElement element, int second) {
		this.element(element).withTimeoutOf(second, TimeUnit.SECONDS).waitUntilPresent();
	}
	protected void waitForElementToBeClickable (org.openqa.selenium.By locator, int second) {
		WebDriverWait wait = new WebDriverWait(getDriver(), second);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	protected void waitForElementToBeVisible(org.openqa.selenium.By locator, int second) {
		WebDriverWait wait = new WebDriverWait(getDriver(), second);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void enterText(WebElementFacade element, String text)
	{
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys(text);
		actions.build().perform();
	}
}