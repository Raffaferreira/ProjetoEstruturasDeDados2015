function darBoasVindas()
{
    alert("Boas vindas");
}

function exibirMensagem(destinatario){
    alert("Olá, " + destinatario);
} 

function calcularResultado(n1, n2){
    var media = (n1+n2)/2;
    alert(media>=5?"Aprovado":"DP");
}

// funções com Retorno

function valorINSS(salario){
    var inss = salario*0.11;
    return inss;
}

function salarioLiquido(salario){
    var liq = salario*0.9;
    liq -= valorINSS(salario);
    return liq;
}

