package stepsCucumber;

import org.openqa.selenium.WebDriver;

import actions.RealizarLoginActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class RealizarLoginStep {
	
	RealizarLoginActions realizarLoginActions = new RealizarLoginActions();
	
	@Dado("que abro o browser no site {string}")
	public void abrir_o_browser(String url) {
		RealizarLoginActions realizarLoginActions = new RealizarLoginActions();
		realizarLoginActions.buscarSite(url);
	}
	
	@Dado("que pesquiso um produto {string}")
	public void pesquisando_browser(String produto) throws InterruptedException {
		realizarLoginActions.clicarNoCampoDeBusca();
		realizarLoginActions.buscarProduto(produto);
	}
	
	@Entao("clico no produto desejado")
	public void clicoEValidoOProdutoDesejado() throws InterruptedException {
		realizarLoginActions.validaProdutoDesejado();
	}
	
}
