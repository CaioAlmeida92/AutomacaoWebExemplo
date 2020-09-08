package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriver.WebDriverFactory;

public class LoginPage extends WebDriverFactory {

	private WebDriver driver;
	private WebDriverWait wait;
	
	private WebElement campoDeBusca;
	private WebElement botaoLupa;
	private WebElement produtoDesejado;
	private WebElement botaoAdicionarAoCarrinho;
	
	public LoginPage() {
		this.driver = createDriver("https://www.amazon.com.br/");
		wait = new WebDriverWait(driver, 12);
	}
	
	public WebElement getCampoDeBusca() {
		campoDeBusca = driver.findElement(By.id("twotabsearchtextbox"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		return campoDeBusca;
	}
	
	public WebElement getBotaoLupa() {
		botaoLupa = driver.findElement(By.id("nav-search-submit-text"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-text")));
		return botaoLupa;
	}
	
	public WebElement getProdutoDesejado() {
		produtoDesejado = driver.findElement(By.xpath("//span[contains(text(), 'HD Portátil Expansion 2Tb, Seagate, Stea2000400')]"));
		return produtoDesejado;
	}
	
	public WebElement getBotaoAdicionarAoCarrinho() {
		botaoAdicionarAoCarrinho = driver.findElement(By.id("add-to-cart-button"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
		return botaoAdicionarAoCarrinho;
	}
	
	
}
