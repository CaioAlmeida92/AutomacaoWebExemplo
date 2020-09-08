$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BuscarProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    },
    {
      "line": 2,
      "value": "# encoding: ISO-8859-1"
    }
  ],
  "line": 4,
  "name": "Buscar um produto no e-commerce",
  "description": "",
  "id": "buscar-um-produto-no-e-commerce",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@buscarProduto"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Buscar produto válido",
  "description": "",
  "id": "buscar-um-produto-no-e-commerce;buscar-produto-válido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que abro o browser no site \"www.magazineluiza.com.br\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "pesquiso o produto",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "www.magazineluiza.com.br",
      "offset": 28
    }
  ],
  "location": "RealizarLoginStep.que_abro_o_browser_no_site(String)"
});
formatter.result({
  "duration": 94063400,
  "status": "passed"
});
formatter.match({
  "location": "RealizarLoginStep.pesquisar()"
});
formatter.result({
  "duration": 56100,
  "status": "passed"
});
});