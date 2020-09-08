package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import page.LoginPage;
import webDriver.WebDriverFactory;

public class RealizarLoginActions extends LoginPage {
	
	public static WebDriver driver;
	

	public void buscarSite(String url) {
		WebDriverFactory webDriverFactory = new WebDriverFactory();
		driver = webDriverFactory.createDriver(url);
	}
	
	public void clicarNoCampoDeBusca() throws InterruptedException {
		getCampoDeBusca().click();
	}
	
	public void buscarProduto(String produto) throws InterruptedException {
		getCampoDeBusca().sendKeys(produto);
		getBotaoLupa().click();
	}
	
	public void validaProdutoDesejado() throws InterruptedException {
		getProdutoDesejado().click();
	}
	
	public void clicarAdicionarNoCarrinho() throws InterruptedException {
		getBotaoAdicionarAoCarrinho().click();
	}
	

}
