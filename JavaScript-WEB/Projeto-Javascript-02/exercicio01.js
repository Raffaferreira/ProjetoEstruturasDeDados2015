var numProdutos = prompt("Quantos produtos você quer cadastrar ??");
var produtos = [];

function cadastrarProdutos(produtos)
{
    for(var i = 0; i < numProdutos; i++)
    {
       produtos[i] = prompt("Qual o preço dos Produtos ?");
    }
    return produtos;
}

function calcularTributos(produtos){
    var vlracrescido = impostoCidade(produtos);
    var vlracrescido2 = impostoEstado(produtos);
    alert("Imposto da cidade é : "+ vlracrescido);
    alert("Imposto do estado é : " + vlracrescido2);
}

function impostoCidade(valor1){
    var media1 = valor1 * 0.5;
    return media1;
}

function impostoEstado(valor2){
    var media = valor2 * 0.10;
    return media;
}